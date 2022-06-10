// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        mavenCentral()
        
    }
    dependencies {
        classpath (Dependencies.BuildPlugins.androidGradle)
        classpath (Dependencies.BuildPlugins.kotlinGradlePlugin)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        
    }
}

tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}