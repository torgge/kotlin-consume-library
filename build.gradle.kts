import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/torgge/kotlin-library-package-registry")
        credentials {
            username = project.findProperty("usernameCredentials") as String? ?: System.getenv("USERNAME")
            password = project.findProperty("passwordCredentials") as String? ?: System.getenv("TOKEN")
        }
    }
}

dependencies {
    implementation("kotlin-package-registry:lib:0.1.0")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}
