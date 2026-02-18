import util.generateFeatureNamespace

plugins {
    id("plugins.android-setup")
    id("plugins.compose-setup")
    alias(libs.plugins.kotlin.android)
}

android.namespace = generateFeatureNamespace("root")
android {
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(projects.core.ui)
    implementation(projects.core.base)
    implementation(projects.core.navigation)

    implementation(projects.feature.splash)
    implementation(projects.feature.authenticate.root)
    implementation(libs.androidx.core.ktx)
}
