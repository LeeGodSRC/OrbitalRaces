import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    kotlin("kapt") version "1.7.10"
    id("com.github.johnrengelman.shadow") version "7.1.2"
    id("xyz.jpenilla.run-paper") version "1.0.6"
}

group = "me.leegod.races"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://repo.lucko.me/")
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://oss.sonatype.org/content/repositories/central")
}

dependencies {
    implementation("me.lucko:helper:5.6.12")
    implementation("com.github.cryptomorin:XSeries:9.1.0") { isTransitive = false }
    kapt("me.lucko:helper:5.6.12")
    compileOnly("org.spigotmc:spigot-api:1.19.2-R0.1-SNAPSHOT")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks {
    runServer {
        minecraftVersion("1.19.2")
    }
}