plugins {
    // Kotlin example
    // kotlin("jvm") version "1.6.20"

    id("java-library")

    // This applies the plugin
    id("me.ste.stevesseries.bukkitgradle") version "1.1"

    // paperweight-userdev, not enabled by default
    // id("io.papermc.paperweight.userdev") version "1.3.5"
}

group = "me.ste.stevesseries" // The base package of your plugin
version = "0.0.0-mc1.18.2" // The Steve's Series plugins use the version format API.MAJOR.MINOR-mcMINECRAFTVERSION. API is incremented each time there was a *BREAKING* API change
description = "An example plugin that uses the Steve's Series Bukkit Gradle." // This becomes the description of the plugin, unless overridden in the description block

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}

repositories {
    mavenCentral()

    // The repository which holds the Spigot API
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")

    // This repository is needed for the ChatComponent api
    maven("https://oss.sonatype.org/content/repositories/snapshots")

    // dmulloy2 repository, ProtocolLib
    maven("https://repo.dmulloy2.net/repository/public/")

    // Steene Public repository, SS-Kotlin
    // maven("https://mvn-public.steenesvc.cf/releases")

    // The PaperMC repository, which has the Paper API. Disabled by default
    // maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    // Kotlin example
    // compileOnly(kotlin("stdlib"))
    // pluginRuntimeOnly("me.ste.stevesseries.kotlin:kotlin:1.6.20")

    // The Spigot API. A must for most of the plugins
    implementation("org.spigotmc:spigot-api:1.18.2-R0.1-SNAPSHOT")

    // Bukkit Gradle is not limited to just the Spigot API. Anything else can be used, such as:
    //
    // paperweight-userdev:
    // paperDevBundle("1.18.2-R0.1-SNAPSHOT")
    //
    // Paper API:
    // implementation("io.papermc.paper:paper-api:1.18.2-R0.1-SNAPSHOT")

    // ProtocolLib included as an example
    depend("com.comphenix.protocol:ProtocolLib:4.7.0")
}

// Configure the development server
runServer {
    // Paper is used as the development server by default
    downloadUri.set("https://papermc.io/api/v2/projects/paper/versions/1.18.2/builds/302/downloads/paper-1.18.2-302.jar")

    // Add the nogui argument to disable the vanilla server window
    // serverArgs.add("nogui")
}

// Configure the plugin's description file
pluginDescription {
    // The main class of the plugin. This field is required to be set
    mainClass.set("me.ste.stevesseries.example.ExamplePlugin")

    // The authors of the plugin
    authors.add("SteveTheEngineer")

    // Additional configuration goes here
}

// The plugin's commands
pluginCommands {
    // An example of a command
    command("exampleplugin", description = "Prints a \"Hello, world!\" message", aliases = setOf("examplepl"))
}

// The plugin's permissions
pluginPermissions {
    // An example of a permission
    permission("stevesseries.example.permission", description = "A test permission")
}
