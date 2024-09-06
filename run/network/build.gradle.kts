plugins {
    alias(libs.plugins.runv1.android.library)
    alias(libs.plugins.runv1.jvm.ktor)
}

android {
    namespace = "com.sri.run.network"

}

dependencies {

    implementation(projects.core.domain)
    implementation(projects.core.data)
    implementation(projects.run.domain)


}