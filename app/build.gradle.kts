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
            //应用名
            //app name
            resValue("string","app_name","MG + SFPEW")
            //包名后缀
            //package name Suffix
            applicationIdSuffix = ".mgsfpew"

            //渲染器在启动器内显示的名称
            //The name displayed by the renderer in the launcher
            manifestPlaceholders["renderer"] = "mgsfpew:libSimpleFPEWrapper.so:libSimpleFPEWrapper.so"
            manifestPlaceholders["des"] = "MobileGlues + SFPEW (OpenGL 4.0)"
            manifestPlaceholders["boatEnv"] = "LIBGL_ES=3:SFPEW_EGL=libmobileglues.so:DLOPEN=libmobileglues.so"
            manifestPlaceholders["pojavEnv"] = "LIBGL_MIPMAP=3:SFPEW_EGL=libmobileglues.so:DLOPEN=libmobileglues.so:POJAV_RENDERER=opengles3:LIBGL_ES=3"
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
