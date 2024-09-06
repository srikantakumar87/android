plugins {

    alias(libs.plugins.runv1.jvm.library)
}

dependencies{
    implementation(projects.core.domain)
}