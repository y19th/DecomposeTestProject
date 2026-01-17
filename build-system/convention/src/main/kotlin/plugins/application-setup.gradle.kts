package plugins

import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties
import util.AndroidVersions

plugins {
    id("com.android.application")
}

android {
    val prop = gradleLocalProperties(rootDir, providers)

    compileSdk = AndroidVersions.compileSdk
    namespace = "com.y19th.decomposetestproject"

    defaultConfig {
        minSdk = AndroidVersions.minSdk
        targetSdk = AndroidVersions.targetSdk
    }

    signingConfigs {
        create("release") {
            keyAlias = prop.getProperty("keystore.release.alias")
            keyPassword = prop.getProperty("keystore.release.password")
            storeFile = file(prop.getProperty("keystore.release.file"))
            storePassword = prop.getProperty("keystore.release.store.password")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            signingConfig = signingConfigs.getByName("release")
            proguardFiles.apply {
                add(getDefaultProguardFile("proguard-android-optimize.txt"))
                add(file("proguard-rules.pro"))
            }
        }
        debug {
            isDebuggable = true
        }
    }
}
