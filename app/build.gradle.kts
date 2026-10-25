plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.mio.plugin.whitebelyash"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.mio.plugin.whitebelyash"
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
            // Application name
            resValue("string", "app_name", "whitebelyash turnip")

            // Driver display name shown in the launcher
            manifestPlaceholders["driver"] = "whitebelyash turnip a6x Mesa 26.2.3"

            // Driver library file name
            manifestPlaceholders["driverLib"] = "libvulkan_freedreno.so"

            // Target GPU family: adreno / mali / any
            manifestPlaceholders["driverGpu"] = "adreno"
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