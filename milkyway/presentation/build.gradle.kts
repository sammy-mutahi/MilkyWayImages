apply {
    from("$rootDir/base-module.gradle")
}

dependencies {
    "implementation"(project(Modules.domain))
    "implementation"(Coil.coilKt)
    "implementation"(FacebookShimmer.facebookShimmer)
    "implementation"(Google.material)
    "implementation"(Retrofit.retrofit)
    "implementation"(Retrofit.moshiConverter)
    "implementation"(Navigation.navigationFragmentKtx)
    "implementation"(Navigation.navigationUiKtx)
    "debugImplementation"(Testing.fragmentTest)
    "implementation"("androidx.test.ext:junit-ktx:1.1.3")
}