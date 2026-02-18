package plugins

import util.AndroidVersions

plugins {
    id("com.android.library")
}

android {
    compileSdk = AndroidVersions.compileSdk

    defaultConfig {
        minSdk = AndroidVersions.minSdk
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
