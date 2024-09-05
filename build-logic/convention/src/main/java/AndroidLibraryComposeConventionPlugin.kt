import com.android.build.api.dsl.LibraryExtension
import com.sri.convention.ExtensionType
import com.sri.convention.configureBuildTypes
import com.sri.convention.configureKotlinAndroid
import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class AndroidLibraryComposeConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run{
                apply("runv1.android.library")

            }

            val extension = extensions.getByType<LibraryExtension>()
            configureKotlinAndroid(extension)




        }

    }

}