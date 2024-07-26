rootProject.name = "scaffolding"

pluginManagement {
    includeBuild("build-logic")
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}

sequenceOf(
    "api",
    "common"
).forEach {
    include(":$it")
    project(":$it").projectDir = file(it)
}

// Platforms
sequenceOf(
    "spigot",
    "sponge"
).forEach {
    // platform implementation project
    include(":$it")
    project(":$it").projectDir = file(it)
    // platform loader project
    include(":$it:loader")
    project(":$it:loader").projectDir = file("$it/loader")
}