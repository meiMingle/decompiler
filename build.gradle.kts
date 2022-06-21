plugins {
    kotlin("jvm") version "1.7.0"
    id("org.openjfx.javafxplugin") version "0.0.13"
}

group = "dev.shota"
version = "0.6.0"

kotlin {
    jvmToolchain {
        languageVersion.set(JavaLanguageVersion.of(JavaVersion.VERSION_17.toString()))
    }
}

javafx {
    version = JavaVersion.VERSION_18.toString()
    modules("javafx.base", "javafx.controls", "javafx.graphics", "javafx.swing")
}

tasks.jar {
    archiveBaseName.set(project.name.toLowerCase())
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    manifest.attributes["Specification-Version"] = project.version
    manifest.attributes["Main-Class"] = "${project.group}.${project.name.toLowerCase()}.Main"
    from(configurations.compileClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
}

tasks.register<Jar>("testJar") {
    archiveFileName.set("test.jar")
    manifest.attributes["Main-Class"] = "${project.group}.${project.name.toLowerCase()}.Main"
    from(sourceSets.test.get().output)
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project("fernflower"))
    implementation("dev.shota:stylus4j:0.1.2")
    implementation("com.formdev:flatlaf:2.3")
    implementation("org.fxmisc.richtext:richtextfx:0.10.9")
    implementation("org.openjfx:javafx-base:${javafx.version}:win")
    implementation("org.openjfx:javafx-base:${javafx.version}:mac-aarch64")
    implementation("org.openjfx:javafx-base:${javafx.version}:linux")
    implementation("org.openjfx:javafx-controls:${javafx.version}:win")
    implementation("org.openjfx:javafx-controls:${javafx.version}:mac-aarch64")
    implementation("org.openjfx:javafx-controls:${javafx.version}:linux")
    implementation("org.openjfx:javafx-graphics:${javafx.version}:win")
    implementation("org.openjfx:javafx-graphics:${javafx.version}:mac-aarch64")
    implementation("org.openjfx:javafx-graphics:${javafx.version}:linux")
    implementation("org.openjfx:javafx-swing:${javafx.version}:win")
    implementation("org.openjfx:javafx-swing:${javafx.version}:mac-aarch64")
    implementation("org.openjfx:javafx-swing:${javafx.version}:linux")
}