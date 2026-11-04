نسخه 0.2.156: پنل متن‌گذاری در شروع بسته است و با دکمهٔ «متن‌گذاری» در نوار عمودی باز/بسته می‌شود. دکمهٔ «پایان متن‌گذاری و بستن پنجره» متن و موقعیت ثبت‌شده را نگه می‌دارد و پنل و ابزار جابه‌جایی متن را می‌بندد. ارتفاع سایر دکمه‌ها تغییر نکرده و دکمه‌های رنگ همچنان 42dp هستند.

نسخه 0.2.151: دو دکمهٔ بخش رنگ به‌صورت اجباری در یک ردیف افقی باقی می‌مانند؛ ارتفاع هر دو به 30dp و متن دکمهٔ دوم به یک خط محدود شد تا فضای عمودی کمتری اشغال شود. شناسه‌ها و عملکرد دکمه‌ها حفظ شده‌اند.
نسخه 0.2.150: دکمه‌های Auto Color و «ثبت رنگ برای اسلایدهای انتخابی» کوچک‌تر شدند و در یک ردیف افقی کنار هم قرار گرفتند؛ شناسه‌های هر دو دکمه حفظ شده‌اند.

نسخه 0.2.149: دکمهٔ «خروجی تغییرات» به جایگاه دوم نوار عمودی سمت چپ منتقل شد؛ بلافاصله پس از «انتخاب ویدیو». ارتفاع، عرض، رنگ و عملکرد دکمه‌ها تغییر نکردند.

نسخه 0.2.148: ارتفاع دکمه‌های نوار ابزار به اندازهٔ قبلی بازگشت (دکمه‌های معمولی 44dp و خروجی/حذف عمومی 48dp). برای کم‌کردن فاصلهٔ ظاهری بدون تغییر ارتفاع، حاشیه‌های بالا و پایین دکمه‌ها صفر شدند.

نسخه 0.2.146: ظرف نمایشی storyboardRows در activity_main.xml بازیابی شد تا شناسهٔ موردنیاز MainActivity.kt موجود باشد و خطای Unresolved reference در R.id.storyboardRows رفع شود.

نسخه 0.2.145: رنگ دکمه‌های هم‌کارکرد هماهنگ شد و برای تشخیص سریع‌تر از درجات متفاوت همان طیف رنگی استفاده می‌شود؛ دکمه‌های خروجی/فرمت خروجی طلایی، انتخاب زرد، حذف قرمز، افزودن رسانه آبی، ویرایش/برش سبز و Undo/Redo آبی-بنفش هستند.

نسخه 0.2.144: عرض تمام دکمه‌های نوار عمودی سمت چپ به‌صورت صریح 72dp تنظیم شد تا دقیقاً هم‌عرض دکمهٔ «انتخاب همه» باشند؛ عرض داخلی نوار با درنظرگرفتن حاشیه‌های 3dp دو طرف 72dp است.

نسخه 0.2.143: جلوگیری از نمایش تکراری Undo/Redo؛ هنگام شروع برنامه، دکمه‌های Undo و Redo در کل درخت رابط بررسی می‌شوند و فقط یک نمونه از هرکدام حفظ می‌شود. دکمهٔ اصلی در نوار ابزار سمت چپ و اتصال تاریخچهٔ موجود حفظ می‌شود.

نسخه 0.2.142: دکمه‌های مستقل و عمومی به نوار عمودی ثابت سمت چپ منتقل شدند. نوار ابزار اسکرول عمودی مستقل خود را دارد و با اسکرول صفحهٔ اصلی حرکت نمی‌کند؛ دکمه‌های داخل پنل‌ها و گروه‌های مرتبط مانند کنترل‌های ترک و رنگ در محل قبلی باقی مانده‌اند.
نسخه 0.2.141: رفع خطای محدودهٔ دسترسی requiresVideoReencode در خروجی ترکیبی؛ تصمیم رمزگذاری مجدد بیرون از بلوک try قرار گرفت تا callback نتیجه نیز آن را ببیند. در خروجی متن/ویدیوی رویی نیز شرط متن به وجود فایل متن وابسته شد، نه متغیری خارج از محدودهٔ تابع.

نسخه 0.2.140: رفع خطای اصلی کامپایل Kotlin در بلوک Auto Color با افزودن آکولاد بستهٔ جاافتاده؛ خطاهای زنجیره‌ای مربوط به توابع، ثابت‌ها و خروجی نیز از همان خطای نحوی ناشی می‌شدند.

نسخه 0.2.139: کادر Free Crop اکنون با کشیدن داخل کادر جابه‌جا می‌شود؛ کشیدن دستگیره‌های گوشه همچنان اندازهٔ کادر را تغییر می‌دهد. کادر ویدیوی رویی از قبل قابلیت جابه‌جایی و تغییر اندازه داشت.

نسخه 0.2.138: دکمه‌های ثابت Undo/Redo و تاریخچهٔ چندمرحله‌ای تا ۲۰۰ وضعیت برای برش‌های نوار زمان، ترک‌های صدا/زیرنویس، تنظیمات رنگ، برش آزاد و بعضی تنظیمات رویی اضافه شد. توجه: این تاریخچه هنوز همهٔ عملیات رابط کاربری و حذف اسلایدهای استوری‌بورد را به‌طور کامل پوشش نمی‌دهد و فایل خروجی ذخیره‌شده را برنمی‌گرداند.

نسخه 0.2.136: دکمه‌های ثابت Undo و Redo با تاریخچهٔ چندمرحله‌ای برای تغییرات اصلی ترک‌ها، برش‌های نوار زمان، تنظیمات رنگ و برخی تنظیمات تدوین اضافه شدند. تاریخچه تا ۲۰۰ مرحله نگه داشته می‌شود؛ فایل‌های خروجی ذخیره‌شده و همهٔ تعاملات رابط کاربری الزاماً قابل بازگردانی نیستند.

نسخه 0.2.136: دکمه‌های ثابت Undo و Redo با تاریخچهٔ چندمرحله‌ای برای تغییرات اصلی ترک‌ها، برش‌های نوار زمان، تنظیمات رنگ و برخی تنظیمات تدوین اضافه شدند. تاریخچه تا ۲۰۰ مرحله نگه داشته می‌شود؛ فایل‌های خروجی ذخیره‌شده و همهٔ تعاملات رابط کاربری الزاماً قابل بازگردانی نیستند.

نسخه 0.2.137: دکمه Delete ابتدا انتخاب‌های جاری را مستقیماً حذف می‌کند؛ برای انتخاب چند ترک صدا/زیرنویس، روی هر ترک نگه دارید. اگر انتخابی وجود نداشته باشد، گزینه‌های حذف عمومی قبلی نمایش داده می‌شوند.

نسخه 0.2.136: دکمهٔ قرمز Delete به‌صورت ثابت اضافه شد. با انتخاب آن، فهرست موردهای قابل حذف بر اساس وضعیت فعلی و انتخاب‌های کاربر نمایش داده می‌شود؛ از جمله اسلایدهای انتخاب‌شده، قطعهٔ ترک، بازهٔ نوار زمان، متن/ویدیوی رویی، فهرست Merge/Join، عکس مرجع، تنظیمات برش و برش‌های ثبت‌شده.

نسخه 0.2.135: کنترل اشباع رنگ و دکمه بازنشانی آن در پنل ثابت پایین صفحه قرار دارند و هنگام پیمایش محتوای اصلی جابه‌جا نمی‌شوند.

# EVCtow 0.2.134 — کنترل‌های رنگ ثابت در پایین صفحه

- دکمهٔ Auto Color، نوارهای قرمز/سبز/آبی، اشباع رنگ و دکمهٔ ثبت رنگ اکنون بیرون از ScrollView و در پنل ثابتی در پایین صفحه قرار دارند.
- با اسکرول عمودی محتوای صفحه و استوری‌بورد، پنل رنگ حرکت نمی‌کند؛ فضای باقی‌مانده برای پیمایش و دسترسی به همهٔ اسلایدها استفاده می‌شود.
- منطق رنگ، انتخاب اسلایدها و خروجی بدون تغییر عملکردی حفظ شده است.
- بیلد Gradle و نصب روی دستگاه در این محیط انجام نشده است.

# EVCtow 0.2.133 — استوری‌بورد پویا برای پوشش کامل ویدیو

- تعداد اسلایدها هنگام اعمال بازهٔ زمانی و فاصلهٔ نمونه‌برداری، به‌صورت خودکار از طول بازه و فاصله محاسبه می‌شود؛ اگر بیش از ۱۲۰ اسلاید لازم باشد، ردیف‌ها و اسلایدهای اضافه ساخته می‌شوند.
- اسلایدهای اضافه موقت‌اند. با برگشت به فاصلهٔ خودکار، تغییر ویدیو یا بارگذاری دوبارهٔ استوری‌بورد، شبکه به تعداد استاندارد ۱۲۰ اسلاید برمی‌گردد و ردیف‌های موقت حذف می‌شوند.
- برای جلوگیری از مصرف بیش‌ازحد حافظه، حداکثر ۱۲۰۰ اسلاید ساخته می‌شود. اگر فاصلهٔ درخواستی به تعداد بیشتری نیاز داشته باشد، فاصله به‌طور خودکار کمی افزایش می‌یابد تا کل بازه همچنان تا انتها پوشش داده شود و پیام اطلاع‌رسانی نمایش داده می‌شود.
- انتخاب همه، زمان‌بندی فریم، حذف و خروجی اسلایدها از تعداد فعال استوری‌بورد استفاده می‌کنند.
- بیلد Gradle و نصب روی دستگاه در این محیط انجام نشده است.

# EVCtow 0.2.132

- Image-based scene search now displays matching frames directly inside the existing storyboard grid, labeled with their exact timestamps.
- Tapping a search-result storyboard slide seeks to that exact match time.
- Removed the separate search-results dialog; no-match results are reported in the status area/toast without opening a redundant window.
- The existing video storyboard returns when a new video is selected or its time range is reloaded.

Android Gradle build/device installation have not been performed in this environment.

## Version 0.2.131 — Timeline audio/subtitle lanes

- Added a two-lane horizontal track area under the video timeline: AUDIO and SUBTITLE.
- Audio and subtitle pickers allow selecting multiple files. Each selected file appears as a separate clip starting at the current playback position.
- Drag a clip body to move it; drag its left/right edge to trim it. Select a clip and use **برش ترک در محل پخش** to split it at the current playback position; each half can then be moved/trimmed independently. **حذف قطعه** deletes the selected piece and **پاک‌کردن ترک‌ها** clears the track area.
- For track-only exports, the source video stream is copied without video re-encoding. Added audio clips are mixed with the original audio and limited to the source video duration. Subtitle clips are mapped as subtitle streams with timeline offsets; MP4 uses `mov_text`, while MKV copies subtitle streams when supported.
- Current limitation: timeline track placement is exported through the dedicated track-only path. Combining those positioned clips with visual effects/crop/text in one output is not yet supported; the app warns instead of silently ignoring track positions. Subtitle trim behavior depends on the subtitle container/format and should be tested with the specific file.
- Android Gradle build/device install was not run in this environment.

# EVCtow 0.2.130 — حفظ کدک ویدیو هنگام افزودن صدا یا زیرنویس

## Version 0.2.130 — حفظ کدک اصلی ویدیو
- در خروجی‌هایی که فقط صدای خارجی یا زیرنویس اضافه می‌شود، جریان تصویر با `-c:v copy` منتقل می‌شود تا کدک اصلی ویدیو دوباره رمزگذاری نشود.
- صدای اصلی در حالت بدون جایگزینی با `-c:a copy` حفظ می‌شود. صدای خارجی، در مسیر فعلی جایگزین صدای اصلی است و برای سازگاری به AAC تبدیل می‌شود؛ این تبدیل روی جریان تصویر اثری ندارد.
- در MP4، زیرنویس در صورت نیاز به `mov_text` تبدیل می‌شود؛ در MKV، جریان زیرنویس کپی می‌شود.
- برش تصویر، تغییر رنگ، Auto Color، درج متن یا ویدیوی رویی همچنان به رمزگذاری مجدد تصویر نیاز دارند.
- اگر کدک اصلی با ظرف خروجی انتخاب‌شده سازگار نباشد، کپی مستقیم ممکن است شکست بخورد؛ در این حالت باید ظرف خروجی سازگار انتخاب شود.
- کنار نوارهای قرمز، سبز، آبی و اشباع رنگ، دکمهٔ `Rest` اضافه شد؛ هر دکمه فقط همان نوار را به مقدار خنثی `1.00` برمی‌گرداند.
- دکمهٔ Rest اشباع رنگ کمی برجسته‌تر و عریض‌تر است تا سریع‌تر پیدا شود.
- در پنجرهٔ «ویرایش پیشرفته» نیز برای نور، کنتراست و گاما دکمهٔ Rest جداگانه کنار هر نوار اضافه شد؛ مقدار اولیهٔ هر کنترل بازگردانده می‌شود.
- این تغییر فقط کنترل‌های بازنشانی را اضافه می‌کند؛ نور، کنتراست و گاما در نسخهٔ فعلی هنوز به موتور خروجی متصل نشده‌اند.
- XML و ZIP بررسی می‌شوند؛ بیلد اندروید و آزمایش روی دستگاه در این محیط انجام نشده است.

---

# EVCtow 0.2.128 — دکمهٔ Auto Color

- دکمهٔ `Auto Color` اضافه شد و از طریق «خروجی تغییرات» روی فایل نهایی اعمال می‌شود.
- این پیاده‌سازی یک رنگ‌آمیزی تقریبی مبتنی بر روشنایی (هایلایت آبی، تون‌های تیره/میانی سبز و تون‌های میانی گرم) است؛ مدل هوش مصنوعیِ تشخیص آسمان، درخت یا چهره در پروژه بسته‌بندی نشده، بنابراین رنگ‌گذاری معنایی دقیق یا طبیعی تضمین نمی‌شود.
- خروجی به رمزگذاری مجدد نیاز دارد. اجرای بیلد واقعی و آزمون روی دستگاه انجام نشده است.

---

# EVCtow 0.2.127 — انتخاب مستقیم اسلایدها برای حذف یا خروجی

- دکمه‌های میانی «انتخاب برای حذف» و «انتخاب برای خروجی» حذف شدند؛ دیگر نیازی به تعیین حالت قبل از انتخاب نیست.
- با لمس اسلایدها، انتخاب واحدی ایجاد می‌شود: دکمهٔ «حذف اسلایدها» آن‌ها را از بازه‌های خروجی حذف می‌کند و دکمهٔ «خروجی تغییرات» در صورت انتخاب اسلایدها، مستقیماً خروجی اسلایدهای انتخابی را اجرا می‌کند.
- دکمه‌های کاربردی «انتخاب همه» و «لغو انتخاب» حفظ شدند.
- متن وضعیت اکنون تعداد اسلایدهای انتخابی را مستقل از حالت حذف/خروجی نشان می‌دهد.
- ارجاع‌های Kotlin به دکمه‌های حذف‌شده و متغیر حالت قدیمی پاک شدند. ZIP/XML و ارجاع‌های شناسه بررسی می‌شوند؛ بیلد اندروید و آزمایش دستگاه در این محیط انجام نشده است.

---

# EVCtow 0.2.126 — حذف دکمه‌های خروجی قدیمی

- دکمهٔ «خروجی تغییرات» تنها دکمهٔ خروجی‌گیری در رابط است؛ دکمه‌های مخفی و قدیمی خروجی برای Crop، رنگ، متن/ویدیوی رویی، ترک‌ها و خروجی استوری‌بورد از چیدمان حذف شدند.
- ارجاع‌های داخلیِ وضعیت و فعال/غیرفعال‌سازیِ مسیرهای قدیمی به دکمهٔ مشترک منتقل شدند؛ برچسب دکمهٔ مشترک دیگر با حالت‌های قدیمی بازنویسی نمی‌شود.
- دکمه‌های تنظیم و انتخاب فایل (مثل افزودن صدا، زیرنویس و انتخاب ویدیوی رویی) حفظ شده‌اند؛ فقط دکمه‌های اختصاصی خروجی حذف شده‌اند.
- مسیر خروجی مشترک و محدودیت‌های نسخهٔ 0.2.125 حفظ شده‌اند؛ ترکیب برش زمانی/استوری‌بورد با افکت‌ها هنوز پشتیبانی نمی‌شود.
- XML و ارجاع‌های شناسه‌ها بررسی می‌شوند؛ بیلد اندروید و آزمایش روی دستگاه در این محیط انجام نشده است.

---


- دکمهٔ قابل مشاهدهٔ خروجی به یک دکمه با عنوان «خروجی تغییرات» تبدیل شد.
- مسیر خروجی مشترک، Crop ثبت‌شده، تنظیمات رنگ، متن، ویدیوی رویی، صدای انتخابی و زیرنویس انتخابی را در یک اجرای FFmpeg ترکیب می‌کند و یک فایل نهایی می‌سازد.
- خروجی تصویری این مسیر رمزگذاری مجدد می‌شود؛ بنابراین برای اعمال افکت‌ها و ترکیب تصویر، حفظ کدک بدون رمزگذاری مجدد ممکن نیست.
- دکمه‌های تنظیم و انتخاب فایل همچنان جدا هستند؛ دکمه‌های قدیمی خروجی از رابط اصلی پنهان شده‌اند تا کاربر فقط مسیر خروجی مشترک را ببیند.
- برش‌های زمانی و انتخاب‌های استوری‌بورد در صورت استفادهٔ مستقل از دکمهٔ مشترک قابل خروجی هستند؛ ترکیب هم‌زمان این حالت‌های برش با افکت‌های تصویری هنوز در این نسخه پشتیبانی نشده و برنامه برای جلوگیری از نادیده گرفتن آن‌ها هشدار می‌دهد.
- این نسخه در محیط فعلی با Gradle/Android SDK ساخته یا روی دستگاه آزمایش نشده است؛ خروجی GitHub Actions باید بررسی شود.

## Version 0.2.124 — Kotlin nullable SurfaceTexture compile fix

- Fixed the Kotlin compilation error in the overlay-video preview: `TextureView.surfaceTexture` is nullable, so the preview now starts only when a non-null `SurfaceTexture` is available.
- No overlay behavior or UI was otherwise changed.
- Source-level fix and ZIP/XML checks performed; Android build was not run in this environment.

## Version 0.2.123 — Actual overlay-video preview in the player

- Selecting a secondary video now creates a real muted, looping preview over the main player instead of showing only a labeled placeholder rectangle.
- The preview follows the X/Y/width fields and the draggable placement frame, uses the selected video's aspect ratio, and stays beneath the crop/placement handles.
- Preview playback errors are reported in the status line; final export remains a separate action.
- ZIP/XML checks only; Android build and on-device playback have not been verified in this environment.

## Version 0.2.121 — Consolidated export actions row

- Moved the main export actions into one dedicated horizontal row near the timeline: stream-copy export, final text/overlay export, audio/subtitle track output, crop output, color output, and separate timeline segments.
- The row scrolls horizontally on narrow screens so buttons stay together without shrinking into unreadable widths. Existing button IDs and click handlers are preserved.

## Version 0.2.120 — Centered source-ratio player and crop drag scroll lock

- The visible player viewport is sized to the source video's aspect ratio and centered horizontally. Text/video placement and Crop overlays use the same viewport bounds to improve coordinate alignment between preview and exported video.
- Vertical page scrolling is blocked while dragging the Crop corner handles and re-enabled when the gesture ends or is cancelled.

## Version 0.2.119 — Timeline export separation and safer text encoding

- Fixed the main export button so timeline edits are handled separately from storyboard selection.
- When timeline Cut points/deleted ranges exist, the button exports the remaining timeline as one video without asking for storyboard slides.
- Text/video overlay export keeps H.264 output but uses conservative low-memory x264 settings for 32-bit ARM devices.
- Build and device testing have not been performed in this environment.

## Version 0.2.119 — Wider Crop and Vector buttons

- Increased the Crop and Vector button widths from 58dp to 90dp each. Other button properties are unchanged.

## Version 0.2.119 — Wider Crop and Vector buttons

The “ثبت شروع از پخش” and “ثبت پایان از پخش” controls are now in the same row as Cut, delete selected segment, and restore segments. All five buttons have equal widths and heights.


- Set the height of every button in the main layout to 46dp, matching the full-width yellow color-apply button.
- Changed only button heights; widths, colors, labels, margins, and behavior are unchanged.

## Version 0.2.114 — All storyboard slides visible in a fixed grid

- Replaced horizontally scrolling storyboard strips with a fixed wrapping grid containing all 120 frame slots.
- Removed per-row labels and horizontal scrolling so no storyboard frames are hidden off-screen to the side.
- Preserved frame IDs and existing selection/deletion behavior.

## Version 0.2.114 — Wider and taller red close button

- Moved Cut, Delete Selected Segment, and Restore Segments directly below the timeline bar so the controls sit beside the timeline they operate on.
- Preserved the existing timeline-control IDs and behavior.

## Version 0.2.111 — Remove text placement button and clarify final export

- Removed the unnecessary “جای متن” button and its click handler. Text positioning remains direct on the player by dragging the live preview; pinch gestures still resize it.
- Made the dedicated text/video overlay export button full-width and renamed it to “ساخت ویدیوی نهایی با متن / ویدیوی رویی”.
- Added an explicit note distinguishing this final-video export from “ساخت خروجی ترک‌ها”, which is for external audio/subtitle tracks.
- VersionCode 313. The red × button is now 50dp wide (double its previous 25dp) and 40dp high (previously 34dp). XML and ZIP checks are performed for this package; Android build/device testing has not been performed in this environment.

## Version 0.2.110 — Overlay controls consolidated and video selection hardened

- Moved “Place overlay video” and “Place text” into the same compact row as “Build track output”; removed their separate placement row and extra help line.
- Kept the placement hide/close control in the same row to preserve its behavior.
- The “Place overlay video” button opens the overlay-video picker if no overlay video has been selected yet.
- Overlay-video selection now attempts to persist read permission, accepts the URI from either `data` or `clipData`, and verifies that the selected item can be opened before marking it selected.
- Updated the GitHub Actions artifact name for version 0.2.110.
- XML validity and ID uniqueness were checked. Android build/device testing has not been performed in this environment.

## Version 0.2.109 — Live text editing on the player

- Text appears on the player as it is typed; the separate “activate/apply text” button was removed.
- Drag the visible text directly on the player to move it, and pinch with two fingers to resize it.
- Removed text X/Y and manual size fields. Only text start and end times remain; the end time defaults to the selected video's duration.
- Partial-duration text uses the timed FFmpeg drawtext path; full-duration MP4 text continues using the existing Media3 Transformer path.
- XML validity and removed-ID references were checked. Android build/device testing has not been performed in this environment.

## Version 0.2.100 — Text-only export routed through Media3

- Text-only MP4 export now uses Media3 Transformer with a text overlay instead of invoking FFmpegKit.
- The export button is disabled during processing and re-enabled on success or failure.
- Output is saved to `Movies/EVC` as `EVC_Text_*.mp4`.
- Text + overlay-video or external-audio combinations still use the existing FFmpeg path.
- Build/device testing has not been performed in this environment.

# EVCtow — Android video editor

**Project version:** 0.2.121  
**Android minimum SDK:** 24 (Android 7.0)  
**Build:** GitHub Actions / Gradle 8.9 / JDK 17

## What is included

This is a cleaned Android Studio project based on the supplied EVC 0.2.81 project. It preserves the existing app source and resources, including the timeline/storyboard editing workflow, crop-related functionality, color-effect controls, and the current MP4/MKV output paths.

This release packages native libraries for **32-bit ARM (`armeabi-v7a`) only**. This should reduce the APK size for compatible phones, but it will not install on devices that require 64-bit ARM (`arm64-v8a`) or x86/x86-64 libraries.

The app's displayed name and Gradle root project name are now **EVCtow**. The Android application ID remains `com.evc.app` to avoid an unrelated package-identity change.

## Build and GitHub Actions

The workflow is located at `.github/workflows/android.yml` at the repository root.

It is configured to run on:
- every branch push (`push.branches: ["**"]`);
- pull requests targeting any branch;
- manual launch through **Actions → EVCtow Android Build → Run workflow**.

On success, the workflow uploads an artifact named `EVCtow-0.2.121-ARM32-TextVideoAudio-Controls-debug-apk` containing the debug APK.

## Uploading to a new repository

1. Create a new, empty GitHub repository named `EVCtow`.
2. Extract the contents of this ZIP directly into the repository root. The `.github` folder must be at the root beside `app`, `settings.gradle.kts`, and `build.gradle.kts`—not nested inside another project folder.
3. Commit and push these files to the new repository's branch.
4. Open **Actions** and select **EVCtow Android Build**. If the workflow has not run automatically, use **Run workflow**.

This ZIP intentionally does not include the old `.git` directory, build outputs, Gradle caches, local machine settings, or IDE metadata. Initialize a fresh Git repository for the new remote; the first commit must actually be pushed to GitHub for Actions to receive it.

## Important verification note

The workflow and project configuration have been prepared, but an Android build has not been run in this environment. A green GitHub Actions result is still required to verify compilation and APK creation. The existing FFmpegKit dependency requires `minSdk 24`, so Android 6 / API 23 is not supported.


## Version 0.2.84
- Made the entire main screen vertically scrollable so all storyboard rows and lower controls can be reached on shorter displays. The storyboard grid now expands to its full height inside the page scroll container.
- Kept only the `armeabi-v7a` (32-bit ARM) target ABI.


## Version 0.2.85
- Added Free Crop directly on the player: tap Crop to show an adjustable rectangle with four draggable corner handles.
- Added separate controls to save the selected crop area or export the cropped video.
- Kept the existing Media3 crop export path and the 32-bit ARM-only ABI target.


## نسخه 0.2.87 — افزودن ترک صوتی و زیرنویس

- دکمهٔ «افزودن صدا» برای انتخاب فایل صوتی جداگانه.
- دکمهٔ «افزودن زیرنویس» برای انتخاب فایل زیرنویس مانند SRT.
- دکمهٔ «ساخت خروجی» برای قرار دادن صدا و زیرنویس به‌صورت ترک‌های جداگانه در ویدیو؛ ترک صوتی اصلی حفظ می‌شود و ترک صوتی انتخابی به‌عنوان ترک اضافی اضافه می‌شود.
- ویدیو و صدا با stream copy mux می‌شوند و ویدیو دوباره رمزگذاری نمی‌شود.
- برای خروجی MP4 زیرنویس به mov_text تبدیل می‌شود؛ برای MKV زیرنویس کپی می‌شود. در صورت ناسازگاری فرمت ورودی با ظرف انتخاب‌شده، FFmpeg خطا گزارش می‌کند.
- خروجی در Movies/EVC ذخیره می‌شود. معماری هدف همچنان armeabi-v7a است.


## Video effects (0.2.88)
- Optional rectangular blur region configured by X/Y/W/H percentages of the source frame.
- Optional noise and sharpening filters.
- Filtered export is re-encoded to H.264; the source video is not modified.
- Output is saved under Movies/EVC. Audio is stream-copied when compatible with the selected MP4/MKV container.


## Version 0.2.89 — Text and picture-in-picture video overlay
- Added a text overlay input with configurable font size and X/Y position percentages. Text is rendered into the final video using FFmpeg drawtext.
- Added a second-video overlay picker, with configurable width and X/Y position percentages. The secondary video loops as needed while the main video determines the output duration.
- Text and video overlay can be used independently or together. The final video is re-encoded to H.264; original source audio is copied when compatible.
- Output is saved under Movies/EVC. Target ABI remains armeabi-v7a.
- Android Gradle build must be verified by GitHub Actions; no local build is claimed.


## Version 0.2.90 — Join
- Added a dedicated Join button to append one or more selected videos to the end of the currently opened main video, in the order returned by the Android picker. The main video remains first; duplicate URIs are removed.
- The existing multi-video Merge workflow remains available.
- Join exports a newly encoded MP4 using the existing Media3 Transformer sequence workflow and saves it under Movies/EVC.


## Version 0.2.91 — Effect stability and drag placement

- Hardens the video-effects FFmpeg path with even crop dimensions, reduced filter/encoder threading, and a lighter encoding preset.
- Adds draggable placement selection directly on the player for blur region, text, and picture-in-picture video; dragging updates the corresponding X/Y fields automatically.
- Retains existing project features and ARM32 (`armeabi-v7a`) target.
- Android compilation must be confirmed by GitHub Actions.


## Version 0.2.92 — Clearer video-effects controls
- Reorganized blur, noise, and sharpen into separate RTL rows with plain-language explanations.
- Added a visible selected-effects status and an export button label that reflects the selection.
- Explicitly explains that effects are applied to the exported file and are not shown as a live preview.
- Blur position/size fields are visibly enabled only when regional blur is selected; tapping “جای بلوری” selects blur before opening its draggable placement box.
- Preserves the existing ARM32 target and other editing features.


## Version 0.2.94 — Text / overlay video / audio activation

- Added an explicit **Apply text / video / selected audio and create output** button, wired to the same export path as the final output button.
- The combined output action now accepts text only, overlay video only, selected external audio only, or combinations of these.
- Selected external audio is encoded as the output soundtrack and replaces the source soundtrack in this combined-export path. Use **Build track output** if the intention is to add the external audio as a separate audio track instead.
- Clarified the UI labels so track muxing is not confused with the combined text/video/audio export.
- Build still needs verification in GitHub Actions on a real Android toolchain; this source package has not been installed and tested on a device here.


## Version 0.2.94 — Separate activation and export actions
- The text button now activates text placement instead of starting export immediately. It checks that a source video and text are selected, shows a clear message, and enables dragging the purple placement box over the player.
- Overlay-video selection, external-audio selection, and output creation remain separate actions.
- The output button is explicitly labeled as step 3; the instructions list the exact sequence.
- Build/runtime testing on a physical Android device is still required.

## Version 0.2.95 — runtime-stability hotfix
- Bumped versionCode/versionName to 295 / 0.2.95.
- Disabled R8 minification and resource shrinking in the debug APK build. This avoids stripping or rewriting FFmpegKit JNI/native integration and Media3-related code while investigating reports that editing buttons close the app.
- No new editing features were added; existing project functionality and controls are otherwise retained.
- This is a targeted mitigation, not a verified device-level fix: the app has not been run on the user's device in this environment. If the crash persists, Android runtime Logcat is still needed to identify the exact exception.


## Version 0.2.98 — lower-memory video effects
- Changed noise to spatial-only mode (`allf=u`) to avoid temporal frame buffering.
- Reduced sharpening strength to lower filter work.
- Added an aspect-preserving scale stage before the effects, bounding the processed output to 1280×720 for 32-bit ARM stability. Large source videos therefore produce a lower-resolution effects export.
- Retained single-thread FFmpeg processing.
- This is a targeted mitigation for crashes during noise/sharpen/blur export, not a confirmed fix: a full Android build and device test are still required.


## 0.2.98 — Visible effects export button

Added a prominent “خروجی گرفتن از تغییرات افکت‌ها” button at the top of the video-effects panel. It runs the same export action as the existing button at the bottom, so the user does not need to scroll through all effect settings to find the export action.


## Version 0.2.98

The video-effects panel and its controls (regional blur, noise, sharpening, and effects-export buttons) have been removed temporarily to isolate the reported app shutdown. Text and overlay-video placement controls remain. Effects will be reintroduced one at a time after the baseline version is verified.


## Version 0.2.99 — Lower-memory text/overlay export
- Limited FFmpeg filter and encoder threading to one thread for text/video/audio overlay export.
- Switched to the ultrafast x264 preset and disabled encoder look-ahead to reduce memory pressure on 32-bit ARM devices.
- Reduced the muxing queue limit. This is a targeted stability change; it does not guarantee a fix without device testing or a crash log.


### Version 0.2.106
- Moved Join and separate-segment export into the horizontal row of compact controls below the player, matching the 30dp height of the small controls.


## Version 0.2.107 — Audio export stability (source-level change; build/device test pending)
- MP4 audio replacement, with optional text but without a second video overlay, now uses Media3 Transformer instead of the FFmpegKit path. The original video audio is removed and the selected audio is used as the soundtrack.
- MP4 additional-audio-track export, when no subtitle is selected, now uses Android MediaExtractor/MediaMuxer. It retains the source audio/video and adds the selected audio as a separate track without re-encoding the video. Unsupported source tracks or incompatible audio formats report an error rather than being silently discarded.
- MKV output, subtitle muxing, and combinations that include a second overlay video still use the existing FFmpegKit path.
- The project source was reviewed for routing and identifiers, but no Android build or device-level audio test has been run; GitHub Actions and device testing are required.


### Version 0.2.147
- Reduced the vertical action-rail button heights to 36dp (38dp for the primary export/delete actions) and removed vertical margins between them to reduce scrolling. Button widths remain 72dp and the rail keeps its independent scroll behavior.
- XML structure and button IDs were checked; Android build/device testing is still required.


### Version 0.2.152
- Increased the height of the two color-section buttons (`Auto Color` and `applyColorToSelectedButton`) from 30dp to 42dp, keeping them in the same horizontal row.
- No other button heights were changed. Going forward, do not reduce any button height unless the user explicitly requests it.
- XML structure and ZIP integrity checked; Android build/device testing remains pending.


### Version 0.2.153 — Easier overlay-video placement
- Added high-contrast visible corner handles and a center move grip to the overlay-video selection frame.
- Increased the corner hit target to 46dp so resizing is easier on touch screens.
- Resizing from any corner now uses a consistent aspect-preserving size calculation, with the opposite corner held in place.
- No button heights were changed. XML/ZIP checks and source review only; Android build and device testing remain pending.


## نسخه 0.2.154
- اصلاح نمایش اسلایدهای استوری‌بورد: به‌جای GridLayout با وزن‌دهی نادرست، اسلایدها در ردیف‌های افقی صریح و با عرض مساوی چیده می‌شوند؛ دیگر هر اسلاید نباید کل عرض صفحه را بگیرد.
- همین چیدمان برای نتایج «جست‌وجوی صحنه با عکس» نیز اعمال شد.
- ارتفاع دکمه‌ها تغییر نکرد؛ دو دکمهٔ رنگ همچنان 42dp هستند.


## v0.2.155
- Minimized the visible vertical gaps between buttons in the left action rail using a small negative bottom margin.
- Preserved all existing button heights, including the 42dp color controls.

## نسخه 0.2.157
- پنجرهٔ تنظیم ویدیوی رویی از پنجرهٔ متن‌گذاری جدا شد و در شروع برنامه بسته است.
- دکمهٔ «ویدیوی رویی» به نوار عمودی ابزارها اضافه شد تا پنجره را باز/بسته کند.
- دکمهٔ انتخاب ویدیوی رویی و دکمهٔ «پایان تنظیم ویدیوی رویی و بستن پنجره» در پنجرهٔ مستقل قرار گرفتند؛ پایان کار پنجره را می‌بندد و تنظیمات ویدیوی انتخاب‌شده را نگه می‌دارد.
- ارتفاع سایر دکمه‌ها تغییر نکرده است؛ دو دکمهٔ رنگ همچنان 42dp هستند.


## 0.2.158
- Added a vertical-rail button to open and close the color controls panel on demand. The panel starts hidden; its finish button closes it while preserving current color settings. Existing button heights are unchanged; the two color action buttons remain 42dp.


## 0.2.159
- Added a closed-by-default Tracks panel opened from the vertical action rail. Audio and subtitle selection controls, track timeline, split/delete/reset controls, and a close button are grouped in the panel.
- Added a video action that opens the existing overlay-video panel. Separate independent video timeline tracks are not supported in this release; the UI states this limitation.
- No button heights outside newly added controls were reduced. The two color buttons remain 42dp.


## نسخه 0.2.160
- اندازه دکمه‌های Rest در پنجره ویرایش پیشرفته (نور، کنتراست و گاما) دو برابر شد: عرض 96dp و ارتفاع 72dp. سایر ارتفاع دکمه‌ها تغییر نکرد.


## نسخهٔ 0.2.161
- پنجرهٔ ویرایش پیشرفته از AlertDialog تمام‌صفحه‌مانند به پنل شناور غیرمودال تبدیل شد تا هنگام باز بودن آن، کاربر بتواند همچنان اسلایدهای استوری‌بورد و محیط اصلی ویرایش را لمس و پیمایش کند.
- پنل با دکمهٔ «بستن» بسته می‌شود؛ ارتفاع سایر دکمه‌ها تغییر نکرده و دکمه‌های Rest همان ابعاد نسخهٔ قبل را دارند.
- بیلد واقعی اندروید در این محیط اجرا نشده است.


## نسخهٔ 0.2.162
- دکمه‌های بازکنندهٔ پنل‌ها با حاشیهٔ دورخطی دوگانه مشخص‌تر شدند؛ اندازه و ارتفاع دکمه‌ها و عملکردشان تغییر نکرده است.
