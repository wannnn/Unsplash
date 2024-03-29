plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
    id("dagger.hilt.android.plugin")
    id("org.jetbrains.kotlin.plugin.serialization") version Versions.kotlin
}

android {
    compileSdk = Versions.compileSdk
    buildToolsVersion = Versions.buildToolsVersion

    defaultConfig {
        applicationId = "com.claire.unsplash"
        minSdk = Versions.minSdk
        targetSdk = Versions.targetSdk
        versionCode = Versions.versionCode
        versionName = Versions.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"

    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.kotlinCompilerVersion
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    // Allow references to generated code
    kapt {
        correctErrorTypes = true
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = Versions.kotlinCompilerVersion
    }

    packagingOptions {
        // Multiple dependency bring these files in. Exclude them to enable
        // our test APK to build (has no effect on our AARs)
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(Libs.AndroidX.core)
    implementation(Libs.AndroidX.appcompat)
    implementation(Libs.material)

    implementation(Libs.AndroidX.Compose.composeUi)
    implementation(Libs.AndroidX.Compose.composeMaterial)
    implementation(Libs.AndroidX.Compose.composeMaterialExtended)
    implementation(Libs.AndroidX.Compose.composeRuntime)
    implementation(Libs.AndroidX.Compose.composeToolPreview)
    androidTestImplementation(Libs.AndroidX.Compose.composeUiTest)
    debugImplementation(Libs.AndroidX.Compose.composeTool)

    implementation(Libs.AndroidX.Lifecycle.lifecycle)

    implementation(Libs.AndroidX.Activity.activityCompose)
    implementation(Libs.AndroidX.Activity.activityKtx)

    implementation(Libs.ThirdParty.coil)

    // daggerHilt
    implementation(Libs.AndroidX.Hilt.daggerHilt)
    kapt(Libs.AndroidX.Hilt.daggerHiltCompiler)
    implementation(Libs.AndroidX.Hilt.hiltNavigation)

    implementation(Libs.AndroidX.Navigation.navigation)

    // accompanist
    implementation(Libs.ThirdParty.pager)
    implementation(Libs.ThirdParty.indicators)
    implementation(Libs.ThirdParty.insets_ui)
    implementation(Libs.ThirdParty.system_ui)
    implementation(Libs.ThirdParty.flow_layout)

    // okhttp
    implementation(Libs.NetWorking.okhttp)

    // retrofit
    implementation(Libs.NetWorking.retrofit)
    implementation(Libs.NetWorking.retrofitConverter)

    // kotlin serialization
    implementation(Libs.Kotlin.serialization)

    // third
    implementation(Libs.ThirdParty.nestedScrollView)

    testImplementation(Libs.junit)
    androidTestImplementation(Libs.AndroidX.Test.junitExt)
    androidTestImplementation(Libs.AndroidX.Test.espresso)

}