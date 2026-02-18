plugins {
    id("plugins.application-setup")
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.kotlin.android)
}

dependencies {
    implementation(libs.androidx.activity.compose)
    implementation(projects.feature.root)
    implementation(projects.core.base)
    implementation(projects.core.navigation)
    implementation(libs.androidx.core.ktx)
}
android {
    kotlinOptions {
        jvmTarget = "17"
    }
}
