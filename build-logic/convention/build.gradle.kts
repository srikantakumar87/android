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
            id = "runv1.android.application.Compose"
            implementationClass = "AndroidApplicationConventionPlugin"

        }
    }

}