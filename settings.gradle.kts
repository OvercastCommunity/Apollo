pluginManagement {
    includeBuild("build-logic")
    repositories {
        maven(url = "https://repo.stellardrift.ca/repository/internal/") {
            name = "stellardriftReleases"
            mavenContent { releasesOnly() }
        }
        maven(url = "https://repo.stellardrift.ca/repository/snapshots/") {
            name = "stellardriftSnapshots"
            mavenContent { snapshotsOnly() }
        }
        gradlePluginPortal()
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

rootProject.name = "apollo-parent"

val mcVersion = startParameter.projectProperties["mc"]
val loadAllVersions = mcVersion == null

listOfNotNull(
    "api",
    "common",
//    "bukkit",
//    "bukkit:common",
//    if (loadAllVersions || mcVersion == "v1_18") "bukkit:v1_18" else null,
//    if (loadAllVersions || mcVersion == "v1_19") "bukkit:v1_19" else null,
//    if (loadAllVersions) "bungee" else null,
//    if (loadAllVersions) "velocity" else null
).forEach {
    include(it)
    findProject(":$it")?.name = "apollo-${it.replace(':', '-')}"
}
