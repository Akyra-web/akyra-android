
plugins {
    id("com.android.application")
}

android {
    namespace = "com.akyra.search"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.akyra.search"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
