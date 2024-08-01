// [START maps_android_settings_plugin_management]
pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
// [END maps_android_settings_plugin_management]

// [START maps_android_settings_dependency_resolution_management]
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
// [END maps_android_settings_dependency_resolution_management]

include(":app")
rootProject.name = "Snippets App"
include(":app-ktx")
include(":app-utils-ktx")
include(":app-compose")
include(":app-places-ktx")
include(":app-rx")
include(":app-utils")
