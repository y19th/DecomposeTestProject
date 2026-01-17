import util.generateCoreNamespace

plugins {
    id("plugins.android-setup")
    id("plugins.compose-setup")
}

android.namespace = generateCoreNamespace("ui")
