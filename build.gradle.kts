plugins {
    kotlin("multiplatform") version "1.5.31"
}

// group = "me.user"
// version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    macosX64 {
        binaries { executable() }
    }
}
