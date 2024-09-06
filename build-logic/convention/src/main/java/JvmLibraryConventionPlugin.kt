import com.android.build.api.dsl.LibraryExtension
import com.sri.convention.ExtensionType
import com.sri.convention.configureBuildTypes
import com.sri.convention.configureKotlinAndroid
import com.sri.convention.configureKotlinJvm
import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.dependencies

class JvmLibraryConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
           pluginManager.apply("org.jetbrains.kotlin.jvm")
            configureKotlinJvm()
        }

    }

}