package util

internal sealed class Namespace {

    abstract fun combine(): String

    data class Core(val ext: String) : Namespace() {
        override fun combine(): String {
            return "com.y19th.decomposetestproject.core.$ext"
        }
    }

    data class Feature(val ext: String) : Namespace() {
        override fun combine(): String {
            return "com.y19th.decomposetestproject.feature.$ext"
        }
    }

    data class Custom(val namespace: String) : Namespace() {
        override fun combine(): String = namespace
    }
}

fun generateCoreNamespace(moduleName: String): String {
    return Namespace.Core(moduleName).combine()
}

fun generateFeatureNamespace(moduleName: String): String {
    return Namespace.Feature(moduleName).combine()
}