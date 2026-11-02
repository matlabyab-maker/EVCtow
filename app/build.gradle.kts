plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.evc.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.evc.app"
        minSdk = 24
        targetSdk = 35
        // This release targets only 32-bit ARM devices to reduce APK size.
        ndk {
            abiFilters += listOf("armeabi-v7a")
        }
        versionCode = 293
        versionName = "0.2.93"
    }

    buildTypes {
        getByName("debug") {
            // Keep the CI-produced debug APK installable while shrinking unused code/resources.
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions { jvmTarget = "17" }
}

dependencies {
    implementation("androidx.media3:media3-transformer:1.5.1")
    implementation("androidx.media3:media3-effect:1.5.1")
    implementation("androidx.media3:media3-common:1.5.1")
    // FFmpeg muxing enables Matroska (MKV) output while copying existing streams.
    implementation("dev.ffmpegkit-maintained:ffmpeg-kit-full:6.0.4")
}
