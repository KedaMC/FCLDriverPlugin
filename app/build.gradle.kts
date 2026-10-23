plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.mio.panvkFristOneRR.renderer"
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
    resValue("string","app_name","PanVK FristOneRR")
    applicationIdSuffix = ".PanVkFristOneRR"
    manifestPlaceholders["driver"] = "PanVK FristOneRR"
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