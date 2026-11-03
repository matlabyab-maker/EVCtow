package com.evc.app

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.view.MotionEvent
import android.view.View
import kotlin.math.max
import kotlin.math.min
import kotlin.math.sqrt

/** Transparent player overlay: live text can be dragged and pinch-scaled; PiP video keeps its frame. */
class PlacementOverlayView(
    context: Context,
    private val onPositionChanged: (xPercent: Int, yPercent: Int) -> Unit,
    private val onTextSizeChanged: (size: Int) -> Unit = {}
) : View(context) {
    enum class Mode { NONE, TEXT, VIDEO }

    private val borderPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply { style = Paint.Style.STROKE; strokeWidth = 3.5f }
    private val fillPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply { style = Paint.Style.FILL }
    private val labelPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply { textSize = 12f; isFakeBoldText = true }
    private var xPercent = 5
    private var yPercent = 5
    private var widthPercent = 25
    private var heightPercent = 25
    private var downX = 0f
    private var downY = 0f
    private var startXPercent = 0
    private var startYPercent = 0
    private var dragging = false
    private var pinchStartDistance = 0f
    private var pinchStartTextSize = 36
    private var textSizeValue = 36
    private var previewText: String = ""
    private val previewTextPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = android.graphics.Color.WHITE
        textSize = 18f
        style = Paint.Style.FILL
        setShadowLayer(3f, 1f, 1f, android.graphics.Color.BLACK)
    }
    private val previewOutlinePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = android.graphics.Color.BLACK
        style = Paint.Style.STROKE
        strokeWidth = 3f
        strokeJoin = Paint.Join.ROUND
    }

    fun setSelection(x: Int, y: Int, width: Int, height: Int) {
        widthPercent = width.coerceIn(5, 95)
        heightPercent = height.coerceIn(5, 95)
        xPercent = x.coerceIn(0, if ((tag as? Mode) == Mode.TEXT) 98 else 100 - widthPercent)
        yPercent = y.coerceIn(0, if ((tag as? Mode) == Mode.TEXT) 98 else 100 - heightPercent)
        invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (width <= 0 || height <= 0) return
        val mode = tag as? Mode ?: Mode.NONE
        val left = width * xPercent / 100f
        val top = height * yPercent / 100f
        val right = min(width.toFloat(), left + width * widthPercent / 100f)
        val bottom = min(height.toFloat(), top + height * heightPercent / 100f)
        val color = when (mode) {
            Mode.TEXT -> 0xFFD7A6FF.toInt()
            Mode.VIDEO -> 0xFF43D9A3.toInt()
            Mode.NONE -> 0xFF70AEFF.toInt()
        }
        if (mode == Mode.TEXT && previewText.isNotBlank()) {
            // Text itself is the handle: no placement rectangle or coordinate clutter.
            val textSizePx = (textSizeValue * (height / 360f)).coerceIn(8f, 90f)
            previewTextPaint.textSize = textSizePx
            previewOutlinePaint.textSize = textSizePx
            val availableWidth = (width - left - 4f).coerceAtLeast(20f)
            val lines = mutableListOf<String>()
            var line = ""
            for (word in previewText.split(Regex("\\s+"))) {
                val candidate = if (line.isEmpty()) word else "$line $word"
                if (previewTextPaint.measureText(candidate) <= availableWidth || line.isEmpty()) line = candidate
                else { lines.add(line); line = word }
            }
            if (line.isNotEmpty()) lines.add(line)
            var baseline = top + textSizePx
            val lineHeight = textSizePx * 1.18f
            for (textLine in lines) {
                if (baseline > height + textSizePx) break
                canvas.drawText(textLine, left, baseline, previewOutlinePaint)
                canvas.drawText(textLine, left, baseline, previewTextPaint)
                baseline += lineHeight
            }
            return
        }
        borderPaint.color = color
        fillPaint.color = (color and 0x00FFFFFF) or 0x26000000
        labelPaint.color = color
        canvas.drawRoundRect(RectF(left, top, right, bottom), 7f, 7f, fillPaint)
        val label = when (mode) {
            Mode.TEXT -> "متن • بکش"
            Mode.VIDEO -> "ویدیوی رویی • بکش"
            Mode.NONE -> ""
        }
        if (label.isNotEmpty()) canvas.drawText(label, left + 5f, min(bottom - 5f, top + 17f), labelPaint)
        canvas.drawRoundRect(RectF(left, top, right, bottom), 7f, 7f, borderPaint)
    }

    fun setMode(mode: Mode) { tag = mode; invalidate() }

    fun setTextPreview(text: String, textSize: Int = 36) {
        previewText = text
        textSizeValue = textSize.coerceIn(8, 160)
        invalidate()
    }

    private fun distance(event: MotionEvent): Float {
        if (event.pointerCount < 2) return 0f
        val dx = event.getX(0) - event.getX(1)
        val dy = event.getY(0) - event.getY(1)
        return sqrt(dx * dx + dy * dy)
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (visibility != VISIBLE || width <= 0 || height <= 0) return false
        val mode = tag as? Mode ?: Mode.NONE
        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                downX = event.x; downY = event.y
                startXPercent = xPercent; startYPercent = yPercent
                dragging = true
                parent?.requestDisallowInterceptTouchEvent(true)
                return true
            }
            MotionEvent.ACTION_POINTER_DOWN -> {
                if (mode == Mode.TEXT && event.pointerCount >= 2) {
                    pinchStartDistance = distance(event).coerceAtLeast(1f)
                    pinchStartTextSize = textSizeValue
                    dragging = false
                    return true
                }
            }
            MotionEvent.ACTION_MOVE -> {
                if (mode == Mode.TEXT && event.pointerCount >= 2 && pinchStartDistance > 0f) {
                    val ratio = distance(event) / pinchStartDistance
                    val updated = (pinchStartTextSize * ratio).toInt().coerceIn(8, 160)
                    if (updated != textSizeValue) {
                        textSizeValue = updated
                        invalidate()
                        onTextSizeChanged(updated)
                    }
                    return true
                }
                if (!dragging || event.pointerCount > 1) return true
                val dx = ((event.x - downX) * 100f / width).toInt()
                val dy = ((event.y - downY) * 100f / height).toInt()
                val maxX = if (mode == Mode.TEXT) 98 else 100 - widthPercent
                val maxY = if (mode == Mode.TEXT) 98 else 100 - heightPercent
                xPercent = (startXPercent + dx).coerceIn(0, maxX)
                yPercent = (startYPercent + dy).coerceIn(0, maxY)
                invalidate()
                onPositionChanged(xPercent, yPercent)
                return true
            }
            MotionEvent.ACTION_POINTER_UP -> {
                pinchStartDistance = 0f
                dragging = false
                return true
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                dragging = false
                pinchStartDistance = 0f
                parent?.requestDisallowInterceptTouchEvent(false)
                performClick()
                return true
            }
        }
        return true
    }

    override fun performClick(): Boolean { super.performClick(); return true }
}
