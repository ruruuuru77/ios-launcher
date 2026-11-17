
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.ioslauncher"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.ioslauncher"
        minSdk = 23
        targetSdk = 28
        versionCode = 1
        versionName = "0.1.0"
    }
}
