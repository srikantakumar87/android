plugins {
    `kotlin-dsl`
}
group = "com.sri.runv1.buildlogic"

dependencies{
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)


}

gradlePlugin{
    plugins{
        register("androidApplication"){
            id = "runv1.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"

        }
        register("androidApplicationCompose"){
            id = "runv1.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"

        }
        register("androidLibrary"){
            id = "runv1.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"

        }
        register("androidLibraryCompose"){
            id = "runv1.android.library.compose"
            implementationClass = "AndroidLibraryComposeConventionPlugin"

        }
        register("androidFeatureUi"){
            id = "runv1.android.feature.ui"
            implementationClass = "AndroidFeatureUiConventionPlugin"

        }
        register("androidRoom"){
            id = "runv1.android.room"
            implementationClass = "AndroidRoomConventionPlugin"

        }
        register("jvmLibrary"){
            id = "runv1.jvm.library"
            implementationClass = "JvmLibraryConventionPlugin"

        }
        register("jvmKtor"){
            id = "runv1.jvm.ktor"
            implementationClass = "JvmKtorConventionPlugin"

        }

    }

}