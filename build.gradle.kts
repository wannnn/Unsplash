// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(Libs.gradle)
        classpath(Libs.Kotlin.kotlinGradlePlugin)
        classpath(Libs.AndroidX.Hilt.daggerHiltPlugin)

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }
}

tasks {
   val clean by registering(Delete::class) {
       delete(buildDir)
   }
}