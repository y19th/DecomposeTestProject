rootProject.name = "DecomposeTestProject"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        maven("https://jitpack.io")
    }
    includeBuild("build-system/convention")
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}
include(
    ":app",
    ":core",
    ":core:ui",
    ":core:base",
    ":core:navigation",
    ":feature",
    ":feature:root",
    ":feature:splash",
    ":feature:authenticate",
    ":feature:authenticate:root",
    ":feature:authenticate:main",
    ":feature:authenticate:forgot-password",
    ":feature:authenticate:sheet",
)
