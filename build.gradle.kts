// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath ("com.android.tools.build:gradle:7.3.0-beta01")
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")

    }
}


tasks {
    val clean by registering(Delete::class) {
        delete(buildDir)
    }
}
