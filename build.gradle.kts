plugins {
    // Kotlin example
    // kotlin("jvm") version "1.8.0"

    id("java-library")

    // This applies the plugin
    id("com.github.SteveTheEngineer.SS-BukkitGradle") version "1.4"

    // paperweight-userdev, not enabled by default
    // id("io.papermc.paperweight.userdev") version "2.0.0-beta.18"
}

group = "me.ste.stevesseries" // The base package of your plugin
version = "0.0.0-mc1.21.8" // The Steve's Series plugins use the version format API.MAJOR.MINOR-mcMINECRAFTVERSION. API is incremented each time there was a *BREAKING* API change
description = "An example plugin that uses Steve's Series Bukkit Gradle." // This becomes the description of the plugin, unless overridden in the pluginDescription block

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}

repositories {
    mavenCentral()

    // The repository which holds the Spigot API
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")

    // This repository is needed for the ChatComponent API
    maven("https://oss.sonatype.org/content/repositories/snapshots")

    // dmulloy2 repository, ProtocolLib
    maven("https://repo.dmulloy2.net/repository/public/")

    // JitPack repository, SS-Kotlin, SS-GuiLibrary, others
    // maven("https://jitpack.io")

    // The PaperMC repository, which has the Paper API. Disabled by default
    // maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    // Kotlin example
    // compileOnly(kotlin("stdlib"))
    // softDepend("me.ste.stevesseries.kotlin:kotlin:1.8.0")

    // The Spigot API. A must for most of the plugins
    implementation("org.spigotmc:spigot-api:1.21.8-R0.1-SNAPSHOT")

    // Bukkit Gradle is not limited to just the Spigot API. Anything else can be used, such as:
    //
    // paperweight-userdev:
    // paperDevBundle("1.21.8-R0.1-SNAPSHOT")
    //
    // Paper API:
    // implementation("io.papermc.paper:paper-api:1.21.8-R0.1-SNAPSHOT")

    // ProtocolLib example
    // depend("com.comphenix.protocol:ProtocolLib:5.4.0-SNAPSHOT")

    // SS-GuiLibrary example
    // compileOnly("com.github.SteveTheEngineer.SS-GuiLibrary:guilib-api:0.0.0-mc1.18.2")
    // dependRuntime("com.github.SteveTheEngineer.SS-GuiLibrary:guilib:0.0.0-mc1.18.2")
}

// Configure the development server
runServer {
    // Paper is used as the development server by default
    downloadUri.set("https://api.papermc.io/v2/projects/paper/versions/1.21.8/builds/21/downloads/paper-1.21.8-21.jar")

    // Add the nogui argument to disable the vanilla server window
    // serverArgs.add("nogui")
}

// Paramters for the plugin's description file
pluginDescription {
    // The main class of the plugin. This field is required
    mainClass.set("me.ste.stevesseries.example.ExamplePlugin")
    
    // The api version
    apiVersion.set("1.21")

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
