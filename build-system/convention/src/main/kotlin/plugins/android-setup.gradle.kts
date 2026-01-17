package plugins

import gradle.kotlin.dsl.accessors._a53a94b6c3a23ac8e834f398567c3b95.android
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
