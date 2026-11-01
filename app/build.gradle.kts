plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.mio.plugin.renderer"
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
            // App name shown in Android
            resValue("string", "app_name", "LTW Renderer")

            // Keep a unique package suffix so this plugin can coexist with others
            applicationIdSuffix = ".renderermj"

            // FCL renderer plugin metadata (V1 contract)
            manifestPlaceholders["des"] = "LTW Renderer"
            manifestPlaceholders["renderer"] = "LTW:libltw.so:libltw.so"

            // No additional environment variables are required by this wrapper
            manifestPlaceholders["boatEnv"] = ""
            manifestPlaceholders["pojavEnv"] = ""

            // Empty means no Minecraft version restriction
            manifestPlaceholders["minMCVer"] = ""
            manifestPlaceholders["maxMCVer"] = ""
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
