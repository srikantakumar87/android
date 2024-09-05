import com.android.build.api.dsl.LibraryExtension
import com.sri.convention.ExtensionType
import com.sri.convention.addUiLayerDependencies
import com.sri.convention.configureBuildTypes
import com.sri.convention.configureKotlinAndroid
import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class AndroidFeatureUiConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run{
                apply("runv1.android.library.compose")

            }

          dependencies {
              addUiLayerDependencies(target)

          }




        }

    }

}