plugins {
    id("com.android.application")
    kotlin("android")
    id("dagger.hilt.android.plugin")
    id("kotlin-kapt")
}

android {
    compileSdk = ProjectConfig.compileSdk

    defaultConfig {
        applicationId = ProjectConfig.appId
        minSdk = ProjectConfig.minSdk
        targetSdk = ProjectConfig.targetSdk
        versionCode = ProjectConfig.versionCode
        versionName = ProjectConfig.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }

    buildFeatures {
        dataBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(AndroidX.coreKtx)
    implementation(AndroidX.appCompat)
    implementation(AndroidX.constraintLayout)

    implementation(project(Modules.domain))
    implementation(project(Modules.data))
    implementation(project(Modules.presentation))

    implementation(DaggerHilt.hiltAndroid)
    kapt(DaggerHilt.hiltCompiler)

    implementation(Navigation.navigationFragmentKtx)
    implementation(Navigation.navigationUiKtx)

    implementation(Retrofit.okHttp)
    implementation(Retrofit.retrofit)
    implementation(Retrofit.okHttpLoggingInterceptor)
    implementation(Retrofit.moshiConverter)


    testImplementation(Testing.junit4)
    testImplementation(Testing.junitAndroidExt)
    testImplementation(Testing.truth)
    androidTestImplementation(Testing.truth)
    testImplementation(Testing.coroutines)
    testImplementation(Testing.turbine)
    testImplementation(Testing.mockk)
    testImplementation(Testing.mockWebServer)

    debugImplementation(Testing.fragmentTest)
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.test:runner:1.4.0")
    androidTestImplementation("androidx.test:rules:1.4.0")
    androidTestImplementation("com.google.dagger:hilt-android-testing:2.40")
    kaptAndroidTest("com.google.dagger:hilt-android-compiler:2.40")

    androidTestImplementation("androidx.navigation:navigation-testing:2.5.2")

}