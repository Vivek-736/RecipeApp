plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-parcelize")
}

android {
    namespace = "eu.rudiment.myrecipeapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "eu.rudiment.myrecipeapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    val _nav_version = "2.7.7"

    // Java language implementation
    implementation("androidx.navigation:navigation-fragment-ktx:$_nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$_nav_version")

    // Kotlin
    implementation("androidx.navigation:navigation-fragment-ktx:$_nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$_nav_version")

    // Feature module Support
    implementation("androidx.navigation:navigation-dynamic-features-fragment:$_nav_version")

    // Testing Navigation
    androidTestImplementation("androidx.navigation:navigation-testing:$_nav_version")

    // Jetpack Compose Integration
    implementation("androidx.navigation:navigation-compose:$_nav_version")
// Jetpack Compose
    implementation("androidx.compose.ui:ui:1.6.7")
    implementation("androidx.compose.material:material:1.6.7")
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.7")
    implementation("androidx.compose.runtime:runtime-livedata:1.6.7")

    // Compose ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.0")

    // Retrofit for network calls
    implementation("com.squareup.retrofit2:retrofit:2.9.0")

    // Retrofit Gson Converter for JSON to Kotlin object mapping
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // Coil for image loading in Compose
    implementation("io.coil-kt:coil-compose:2.4.0")

    // For Kotlin coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.7.3")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // AndroidX
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.0")

    // Optional: For Jetpack Compose UI tooling
    debugImplementation("androidx.compose.ui:ui-tooling:1.6.7")
    debugImplementation("androidx.compose.ui:ui-test-manifest:1.6.7")
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.0")
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")
}