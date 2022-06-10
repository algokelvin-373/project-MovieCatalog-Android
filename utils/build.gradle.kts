plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Dependencies.Android.compileSdkVersion)
    defaultConfig {
        minSdkVersion(Dependencies.Android.minSdkVersion)
        targetSdkVersion(Dependencies.Android.targetSdkVersion)
//        versionCode = Dependencies.Android.versionCode
//        versionName = Dependencies.Android.versionName
        testInstrumentationRunner = Dependencies.Android.testInstrumentationRunner

        buildConfigField("String", "API_MOVIE_TV", "\"5a9914ea9eb3bfc1addfe13b0b92b0b4\"")
        buildConfigField("String", "URL_POSTER", "\"https://image.tmdb.org/t/p/w780\"")
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.Kotlin.kotlin_std)

    implementation(Dependencies.Design.recyclerview)
    implementation(Dependencies.SupportLibrary.appCompat)
    implementation(Dependencies.Design.material)

    implementation(project(Dependencies.Modules.moduleRepository))
}
