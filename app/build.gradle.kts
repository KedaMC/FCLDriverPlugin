plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.mio.panvklzenithblueoss.renderer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mio.plugin.renderer"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
        configureEach {
    resValue("string","app_name","PanVK zenithblue-oss")
    applicationIdSuffix = ".panvkzenithblue-oss"
    manifestPlaceholders["driver"] = "PanVK zenithblue-oss"
    manifestPlaceholders["driverLib"] = "libvulkan_panfrost.so"
    manifestPlaceholders["driverGpu"] = "mali"
}
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
}