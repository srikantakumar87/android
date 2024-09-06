plugins {
    alias(libs.plugins.runv1.android.library)
    alias(libs.plugins.runv1.android.room)
}

android {
    namespace = "com.sri.core.database"

}

dependencies {

    implementation(libs.org.mongodb.bson)
    implementation(projects.core.domain)

}