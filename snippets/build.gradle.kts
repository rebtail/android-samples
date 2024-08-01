// [START maps_android_secrets_gradle_plugin_project_level_config]
buildscript {
    dependencies {
        classpath("com.google.android.libraries.mapsplatform.secrets-gradle-plugin:secrets-gradle-plugin:2.0.1")
    }
}
// [END maps_android_secrets_gradle_plugin_project_level_config]

plugins {
    id("com.android.application") version "8.5.1" apply false
    id("org.jetbrains.kotlin.android") version "2.0.0" apply false
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
