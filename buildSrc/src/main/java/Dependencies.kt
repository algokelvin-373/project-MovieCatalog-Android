private const val kotlinVersion = "1.5.21"
private const val androidGradleVersion = "7.0.4"

private const val appcompatVersion = "1.2.0"
private const val coreKtxVersion = "1.0.2"
private const val constraintLayoutVersion = "1.1.3"
private const val materialVersion = "1.1.0"
private const val glideVersion = "4.9.0"
private const val retrofitVersion = "2.6.0"
private const val retrofitGsonRxJavaVersion = "2.5.0"
private const val okHttpVersion = "4.4.0"
private const val lifecycleVersion = "2.2.0"

private const val junitVersion = "4.12"
private const val runnerVersion = "1.2.0"
private const val espressoVersion = "3.2.0"

object Dependencies {
    object Android {
        const val minSdkVersion = 21
        const val targetSdkVersion = 32
        const val compileSdkVersion = 32
        const val applicationId = "com.algokelvin.catalog.movie.tv.apps"
        const val versionCode = 2
        const val versionName = "0.5.2"
        const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    object BuildPlugins {
        const val androidGradle = "com.android.tools.build:gradle:$androidGradleVersion"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }
    object Kotlin {
        const val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:$kotlinVersion"
    }
    object SupportLibrary {
        const val appCompat = "androidx.appcompat:appcompat:$appcompatVersion"
        const val coreKtx = "androidx.core:core-ktx:$coreKtxVersion"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
    }
    object Design {
        const val material = "com.google.android.material:material:$materialVersion"
        const val recyclerview = "androidx.recyclerview:recyclerview:$materialVersion"
        const val glide = "com.github.bumptech.glide:glide:$glideVersion"
    }
    object TestingLibrary {
        const val testJunit = "junit:junit:$junitVersion"
        const val androidTestRunner = "androidx.test:runner:$runnerVersion"
        const val androidTestEspresso = "androidx.test.espresso:espresso-core:$espressoVersion"
    }
    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
        const val retrofitGson = "com.squareup.retrofit2:converter-gson:$retrofitGsonRxJavaVersion"
        const val retrofitRxJava = "com.squareup.retrofit2:adapter-rxjava2:$retrofitGsonRxJavaVersion"
        const val okHttpLogging = "com.squareup.okhttp3:logging-interceptor:$okHttpVersion"
    }
    object Lifecycle {
        const val lifecycle = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycleVersion"
    }
    object Modules {
        const val moduleUtils = ":utils"
        const val moduleRepository = ":repository"
    }
}