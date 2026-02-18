import util.generateCoreNamespace

plugins {
    id("plugins.android-setup")
    id("plugins.compose-setup")
    alias(libs.plugins.kotlin.android)
}

android.namespace = generateCoreNamespace("base")
android {
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(projects.core.ui)
    api(libs.bundles.dextension)
    api(libs.bundles.koin)
    implementation(libs.androidx.core.ktx)
}
