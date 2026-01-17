import util.generateCoreNamespace

plugins {
    id("plugins.android-setup")
    alias(libs.plugins.kotlinSerialization)
}

android.namespace = generateCoreNamespace("navigation")

dependencies {
    implementation(projects.core.base)
}
