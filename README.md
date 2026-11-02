# EVCtow — Android video editor

**Project version:** 0.2.83  
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

On success, the workflow uploads an artifact named `EVCtow-0.2.83-ARM32-debug-apk` containing the debug APK.

## Uploading to a new repository

1. Create a new, empty GitHub repository named `EVCtow`.
2. Extract the contents of this ZIP directly into the repository root. The `.github` folder must be at the root beside `app`, `settings.gradle.kts`, and `build.gradle.kts`—not nested inside another project folder.
3. Commit and push these files to the new repository's branch.
4. Open **Actions** and select **EVCtow Android Build**. If the workflow has not run automatically, use **Run workflow**.

This ZIP intentionally does not include the old `.git` directory, build outputs, Gradle caches, local machine settings, or IDE metadata. Initialize a fresh Git repository for the new remote; the first commit must actually be pushed to GitHub for Actions to receive it.

## Important verification note

The workflow and project configuration have been prepared, but an Android build has not been run in this environment. A green GitHub Actions result is still required to verify compilation and APK creation. The existing FFmpegKit dependency requires `minSdk 24`, so Android 6 / API 23 is not supported.
