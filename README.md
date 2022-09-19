# MilkyWayGalaxy

### How it's built

* Technologies used
    * [Kotlin](https://kotlinlang.org/)
    * [Coroutines](https://kotlinlang.org/docs/reference/coroutines-overview.html)
    * [Hilt](https://developer.android.com/training/dependency-injection/hilt-android)
    * [Retrofit](https://square.github.io/retrofit/)
    * [Jetpack](https://developer.android.com/jetpack)
        * [Lifecycle](https://developer.android.com/topic/libraries/architecture/lifecycle)
        * [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
    * [FacebookShimmer](https://facebook.github.io/shimmer-android)

* Architecture
    * Modular Architecture
        * milkyway
            * data
            * domain
            * presentation
    * MVVM - Model-View-ViewModel
    * BuildSrc -> Manages the dependencies

* Gradle
    * Gradle Kotlin DSL

* Tests
    * [MockK](https://github.com/mockk/mockk)
    * [Truth](https://github.com/google/truth)


* CI/CD
    * Github Actions

### More features that can be added

* Favourites feature -> use cloud firestore
* Huawei support / harmony OS support -> Since at some point in future firebase cloud services will
  be used, setup the app(add hms and gms flavours) and correctly setup the dependency(app module) to
  support both
* More Unit tests and Instrumentation tests
* Appropriate use of CI/CD to automate our tests and deployments
* Detekt to analyse kotlin Code