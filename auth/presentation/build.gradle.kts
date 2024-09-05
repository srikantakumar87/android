plugins {

    alias(libs.plugins.runv1.android.feature.ui)
}

android {
    namespace = "com.sri.auth.presentation"
  
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.auth.domain)


}