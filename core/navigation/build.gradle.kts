import util.generateCoreNamespace

plugins {
    id("plugins.android-setup")
    alias(libs.plugins.kotlinSerialization)
    alias(libs.plugins.kotlin.android)
}

android.namespace = generateCoreNamespace("navigation")
android {
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(projects.core.base)
    implementation(libs.androidx.core.ktx)
}
