plugins {
    application
    id("org.openjfx.javafxplugin") version "0.1.0"
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
} 

dependencies {
    
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

application {
    mainClass.set("com.tobyteatime.Win")
}

javafx {
    version = "21"
    modules = listOf("javafx.controls", "javafx.fxml")
}

// removed incorrect Groovy `mainClassName` property; Kotlin DSL uses application.mainClass above
