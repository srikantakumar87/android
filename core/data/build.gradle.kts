plugins {

    alias(libs.plugins.runv1.android.library)
}

android {
    namespace = "com.sri.core.data"

}

dependencies {

    implementation(libs.timber)
    implementation(projects.core.domain)
    implementation(projects.core.database)
}