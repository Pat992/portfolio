import com.varabyte.kobweb.gradle.application.util.configAsKobwebApplication
import kotlinx.html.style
import kotlinx.html.unsafe
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi

plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.compose.compiler)
    alias(libs.plugins.kobweb.application)
    alias(libs.plugins.serialization.plugin)
    // alias(libs.plugins.kobwebx.markdown)
}

group = "com.pat.portfolio"
version = "1.0-SNAPSHOT"

kobweb {
    app {
        index {
            description.set("Powered by Kobweb")
            head.add {
                style {
                    unsafe {
                        raw("@import url(\"/styles/splide-min.css\") layer(splide)")
                    }
                }
            }
        }

    }
}

kotlin {
    configAsKobwebApplication("portfolio")
    js {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions.target = "es2015"
    }

    sourceSets {
        commonMain.dependencies {
            implementation(libs.compose.runtime)
        }

        jsMain.dependencies {
            implementation(libs.compose.html.core)
            implementation(libs.kobweb.core)
            implementation(libs.kobweb.silk)
            implementation(libs.kotlinx.serialization)
            implementation(npm("@splidejs/splide", "4.1.4"))
            // implementation(libs.silk.icons.fa)
            // implementation(libs.kobwebx.markdown)
        }
    }
}
