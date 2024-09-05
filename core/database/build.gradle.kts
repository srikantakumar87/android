plugins {
    alias(libs.plugins.runv1.android.library)
}

android {
    namespace = "com.sri.core.database"

}

dependencies {

    implementation(libs.org.mongodb.bson)
    implementation(projects.core.domain)

}