import org.jetbrains.intellij.platform.gradle.tasks.RunIdeTask

plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "2.0.21"
    id("org.jetbrains.intellij.platform")
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        bundledPlugin("com.intellij.java")
        bundledPlugin("com.intellij.properties")
        intellijIdeaCommunity("251.21418.62")
    }
}

intellijPlatform {
    buildSearchableOptions = false
    instrumentCode = false
}