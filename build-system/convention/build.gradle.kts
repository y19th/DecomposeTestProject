plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.kotlin.compose.gradle.plugin)
    implementation(libs.android.tools.build.gradle.plugin)
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}