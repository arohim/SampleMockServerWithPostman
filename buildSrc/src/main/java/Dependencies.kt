object ApplicationId {
    const val id = "com.cleanmvvm"
}

object Modules {
    const val app = ":app"
    const val network = ":common:network"
    const val presentation = ":common:presentation"
}

object Releases {
    const val versionCode = 5
    const val versionName = "1.4"
}

object Versions {
    const val gradle = "3.5.2"
    const val compileSdk = 29

    const val buildTool = "29.0.2"
    const val minSdk = 21
    const val targetSdk = 29
    const val googleAuth = "16.0.1"

    const val googleServices = "4.3.0"

    const val appcompat = "1.1.0"

    const val design = "1.0.0"
    const val cardview = "1.0.0"
    const val recyclerview = "1.0.0"
    const val maps = "15.0.1"
    const val ktx = "1.1.0"

    const val kotlin = "1.3.61"

    const val timber = "4.7.1"
    const val rxjava = "2.2.10"
    const val rxkotlin = "2.3.0"
    const val retrofit = "2.6.2"
    const val loggingInterceptor = "4.0.0"
    const val glide = "4.10.0"
    const val rxpaper = "1.4.0"
    const val paperdb = "2.6"
    const val moshi = "1.8.0"
    const val lifecycle = "2.0.0"
    const val leakCanary = "2.0-alpha-2"
    const val crashlytics = "2.10.1"
    const val koin = "2.0.0-beta-1"
    const val constraintLayout = "1.1.3"
    const val gson = "2.8.6"
    const val navigation = "2.1.0"
    const val roomVersion = "2.2.2"
    const val roomCompilerVersion = "2.1.0"
    const val jodaTime = "2.10.3"

    const val junit = "4.12"
    const val assertjCore = "3.12.2"
    const val mockitoKotlin = "2.1.0"
    const val mockitoInline = "3.0.0"
    const val extJunit = "1.1.1"
    const val espressoCore = "3.2.0"
    const val coreTestKtx = "1.2.0"
    const val kaKao = "2.0.0"
    const val testRule = "1.2.0"
    const val mockWebServer = "4.2.1"
}

object Libraries {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    const val ktx = "androidx.core:core-ktx:${Versions.ktx}"

    const val timber = "com.jakewharton.timber:timber:${Versions.timber}"

    const val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"
    const val rxkotlin = "io.reactivex.rxjava2:rxkotlin:${Versions.rxkotlin}"

    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val rxjavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    const val moshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"

    const val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    const val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    const val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"

    const val koinAndroid = "org.koin:koin-android:${Versions.koin}"
    const val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
    const val navigationFragment = "androidx.navigation:navigation-fragment:${Versions.navigation}"
    const val navigationFragmentExt = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUiExt = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"

    const val room = "androidx.room:room-runtime:${Versions.roomVersion}"
    const val roomCompiler = "androidx.room:room-compiler:${Versions.roomCompilerVersion}"
    const val rxRoom = "androidx.room:room-rxjava2:${Versions.roomCompilerVersion}"
    const val rxpaper = "com.github.pakoito:RxPaper2:${Versions.rxpaper}"

    const val jodaTime = "net.danlew:android.joda:${Versions.jodaTime}"
}

object SupportLibraries {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val design = "com.google.android.material:material:${Versions.design}"
    const val cardview = "androidx.cardview:cardview:${Versions.cardview}"
    const val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
}

object TestLibraries {
    const val junit = "junit:junit:${Versions.junit}"
    const val assertjCore = "org.assertj:assertj-core:${Versions.assertjCore}"
    const val mockitoKotlin = "com.nhaarman.mockitokotlin2:mockito-kotlin:${Versions.mockitoKotlin}"
    const val mockitoInline = "org.mockito:mockito-inline:${Versions.mockitoInline}"
    const val lifecycleTesting = "androidx.arch.core:core-testing:${Versions.lifecycle}"
    const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    const val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espressoCore}"
    const val testCoreKtx = "androidx.test:core-ktx:${Versions.espressoCore}"
    const val kakao = "com.agoda.kakao:kakao:${Versions.kaKao}"
    const val testRule = "androidx.test:rules:${Versions.testRule}"
    const val jodaTime = "joda-time:joda-time:${Versions.jodaTime}"
    const val mockWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.mockWebServer}"
}
