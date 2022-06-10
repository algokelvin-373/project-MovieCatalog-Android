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

        buildConfigField("String", "URL_MOVIE_TV", "\"https://api.themoviedb.org/\"")
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.retrofitGson)
    implementation(Dependencies.Retrofit.retrofitRxJava)
    implementation(Dependencies.Retrofit.okHttpLogging)
    implementation(Dependencies.Lifecycle.lifecycle)
}
