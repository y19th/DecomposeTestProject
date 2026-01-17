plugins {
    id("plugins.application-setup")
    alias(libs.plugins.kotlin.compose)
}

dependencies {
    implementation(libs.androidx.activity.compose)
    implementation(projects.feature.root)
    implementation(projects.core.base)
    implementation(projects.core.navigation)
}