import util.generateFeatureNamespace

plugins {
    id("plugins.android-setup")
    id("plugins.compose-setup")
}

android.namespace = generateFeatureNamespace("splash")

dependencies {
    implementation(projects.core.ui)
    implementation(projects.core.base)
    implementation(projects.core.navigation)
}
