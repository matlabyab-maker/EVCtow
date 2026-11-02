package com.evc.app

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.RectF
import android.view.MotionEvent
import android.view.View
import kotlin.math.max
import kotlin.math.min

/** Transparent player overlay used to place text and PiP video by dragging. */
class PlacementOverlayView(
    context: Context,
    private val onPositionChanged: (xPercent: Int, yPercent: Int) -> Unit
) : View(context) {
    enum class Mode { NONE, TEXT, VIDEO }

    private val borderPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        style = Paint.Style.STROKE
        strokeWidth = 3.5f
    }
    private val fillPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply { style = Paint.Style.FILL }
    private val labelPaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        textSize = 12f
        isFakeBoldText = true
    }
    private var xPercent = 10
    private var yPercent = 10
    private var widthPercent = 25
    private var heightPercent = 25
    private var downX = 0f
    private var downY = 0f
    private var startXPercent = 0
    private var startYPercent = 0
    private var dragging = false

    fun setSelection(x: Int, y: Int, width: Int, height: Int) {
        widthPercent = width.coerceIn(5, 95)
        heightPercent = height.coerceIn(5, 95)
        xPercent = x.coerceIn(0, 100 - widthPercent)
        yPercent = y.coerceIn(0, 100 - heightPercent)
        invalidate()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (width <= 0 || height <= 0) return
        val left = width * xPercent / 100f
        val top = height * yPercent / 100f
        val right = min(width.toFloat(), left + width * widthPercent / 100f)
        val bottom = min(height.toFloat(), top + height * heightPercent / 100f)
        val color = when (tag as? Mode ?: Mode.NONE) {
            Mode.TEXT -> 0xFFD7A6FF.toInt()
            Mode.VIDEO -> 0xFF43D9A3.toInt()
            Mode.NONE -> 0xFF70AEFF.toInt()
        }
        borderPaint.color = color
        fillPaint.color = (color and 0x00FFFFFF) or 0x26000000
        labelPaint.color = color
        canvas.drawRoundRect(RectF(left, top, right, bottom), 7f, 7f, fillPaint)
        canvas.drawRoundRect(RectF(left, top, right, bottom), 7f, 7f, borderPaint)
        val label = when (tag as? Mode ?: Mode.NONE) {
            Mode.TEXT -> "متن • بکش"
            Mode.VIDEO -> "ویدیوی رویی • بکش"
            Mode.NONE -> ""
        }
        canvas.drawText(label, left + 5f, min(bottom - 5f, top + 17f), labelPaint)
    }

    fun setMode(mode: Mode) { tag = mode; invalidate() }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        if (visibility != VISIBLE || width <= 0 || height <= 0) return false
        when (event.actionMasked) {
            MotionEvent.ACTION_DOWN -> {
                downX = event.x
                downY = event.y
                startXPercent = xPercent
                startYPercent = yPercent
                dragging = true
                parent?.requestDisallowInterceptTouchEvent(true)
                return true
            }
            MotionEvent.ACTION_MOVE -> {
                if (!dragging) return false
                val dx = ((event.x - downX) * 100f / width).toInt()
                val dy = ((event.y - downY) * 100f / height).toInt()
                xPercent = (startXPercent + dx).coerceIn(0, 100 - widthPercent)
                yPercent = (startYPercent + dy).coerceIn(0, 100 - heightPercent)
                invalidate()
                onPositionChanged(xPercent, yPercent)
                return true
            }
            MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                dragging = false
                parent?.requestDisallowInterceptTouchEvent(false)
                performClick()
                return true
            }
        }
        return true
    }

    override fun performClick(): Boolean { super.performClick(); return true }
}
