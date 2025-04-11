plugins {
    kotlin("jvm") version "1.9.0"
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.json:json:20231013")
}

application {
    mainClass.set("MainKt")
}
