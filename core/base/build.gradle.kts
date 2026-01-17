import util.generateCoreNamespace

plugins {
    id("plugins.android-setup")
    id("plugins.compose-setup")
}

android.namespace = generateCoreNamespace("base")

dependencies {
    implementation(projects.core.ui)
    api(libs.bundles.dextension)
    api(libs.bundles.koin)
}
