plugins {
    alias(libs.plugins.runv1.android.library)
    alias(libs.plugins.runv1.jvm.ktor)
}

android {
    namespace = "com.sri.auth.data"

}

dependencies {

    implementation(projects.core.domain)
    implementation(projects.auth.domain)
    implementation(projects.core.data)

}