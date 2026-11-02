# EVCtow — Android video editor

**Project version:** 0.2.89  
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

On success, the workflow uploads an artifact named `EVCtow-0.2.89-ARM32-TextVideoOverlay-debug-apk` containing the debug APK.

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
