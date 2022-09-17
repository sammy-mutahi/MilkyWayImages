apply {
    from("$rootDir/base-module.gradle")
}

dependencies {
    "implementation"(project(Modules.domain))
    "implementation"(Navigation.navigationFragmentKtx)
    "implementation"(Navigation.navigationUiKtx)
}