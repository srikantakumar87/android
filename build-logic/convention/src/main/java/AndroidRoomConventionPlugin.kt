import androidx.room.gradle.RoomExtension
import com.android.build.api.dsl.LibraryExtension
import com.sri.convention.ExtensionType
import com.sri.convention.configureBuildTypes
import com.sri.convention.configureKotlinAndroid
import com.sri.convention.libs
import org.gradle.api.Project
import org.gradle.api.Plugin
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.kotlin
import org.gradle.kotlin.dsl.dependencies
import org.gradle.kotlin.dsl.getByType

class AndroidRoomConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        target.run {
            pluginManager.run{
                apply("androidx.room")
                apply("com.google.devtools.ksp")

            }

           extensions.configure<RoomExtension> {
               schemaDirectory("$projectDir/schemas")

           }
            dependencies {
                "implementation"(libs.findLibrary("room.runtime").get())
                "implementation"(libs.findLibrary("room.ktx").get())
                "ksp"(libs.findLibrary("room.compiler").get())
            }





        }

    }

}