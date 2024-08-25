package com.pat.portfolio.models

import com.pat.portfolio.core.constants.ExternalUrls.AFFINITY_DESIGNER_URL
import com.pat.portfolio.core.constants.ExternalUrls.ANDROID_STUDIO_URL
import com.pat.portfolio.core.constants.ExternalUrls.AZURE_URL
import com.pat.portfolio.core.constants.ExternalUrls.COMPOSE_HTML_URL
import com.pat.portfolio.core.constants.ExternalUrls.COSMOSDB_URL
import com.pat.portfolio.core.constants.ExternalUrls.CSS_URL
import com.pat.portfolio.core.constants.ExternalUrls.DART_URL
import com.pat.portfolio.core.constants.ExternalUrls.FIGMA_URL
import com.pat.portfolio.core.constants.ExternalUrls.FLUTTER_URL
import com.pat.portfolio.core.constants.ExternalUrls.FRAMER_URL
import com.pat.portfolio.core.constants.ExternalUrls.GITHUB_CONTACT_URL
import com.pat.portfolio.core.constants.ExternalUrls.GOOGLE_ADMOB_URL
import com.pat.portfolio.core.constants.ExternalUrls.GOOGLE_CLOUD_URL
import com.pat.portfolio.core.constants.ExternalUrls.GREENSOCK_URL
import com.pat.portfolio.core.constants.ExternalUrls.HTML_URL
import com.pat.portfolio.core.constants.ExternalUrls.INTELLIJ_URL
import com.pat.portfolio.core.constants.ExternalUrls.JAVASCRIPT_URL
import com.pat.portfolio.core.constants.ExternalUrls.KOBWEB_URL
import com.pat.portfolio.core.constants.ExternalUrls.KOTLIN_URL
import com.pat.portfolio.core.constants.ExternalUrls.LINKEDIN_CONTACT_URL
import com.pat.portfolio.core.constants.ExternalUrls.NEXT_JS_URL
import com.pat.portfolio.core.constants.ExternalUrls.REACT_URL
import com.pat.portfolio.core.constants.ExternalUrls.REDUX_URL
import com.pat.portfolio.core.constants.ExternalUrls.TYPESCRIPT_URL
import com.pat.portfolio.core.constants.ExternalUrls.VERCEL_URL
import com.pat.portfolio.core.constants.ExternalUrls.VS_CODE_URL
import com.pat.portfolio.core.constants.Icons.ADMOB_ICON
import com.pat.portfolio.core.constants.Icons.AFFINITY_DESIGNER_ICON
import com.pat.portfolio.core.constants.Icons.ANDROID_STUDIO_ICON
import com.pat.portfolio.core.constants.Icons.AZURE_ICON
import com.pat.portfolio.core.constants.Icons.COMPOSE_HTML_ICON
import com.pat.portfolio.core.constants.Icons.COSMOSDB_ICON
import com.pat.portfolio.core.constants.Icons.CSS_ICON
import com.pat.portfolio.core.constants.Icons.DART_ICON
import com.pat.portfolio.core.constants.Icons.FIGMA_ICON
import com.pat.portfolio.core.constants.Icons.FLUTTER_ICON
import com.pat.portfolio.core.constants.Icons.FRAMER_ICON
import com.pat.portfolio.core.constants.Icons.GITHUB_ICON
import com.pat.portfolio.core.constants.Icons.GOOGLE_CLOUD_ICON
import com.pat.portfolio.core.constants.Icons.GREENSOCK_ICON
import com.pat.portfolio.core.constants.Icons.HTML_ICON
import com.pat.portfolio.core.constants.Icons.INTELLIJ_ICON
import com.pat.portfolio.core.constants.Icons.JAVASCRIPT_ICON
import com.pat.portfolio.core.constants.Icons.KOBWEB_ICON
import com.pat.portfolio.core.constants.Icons.KOTLIN_ICON
import com.pat.portfolio.core.constants.Icons.LINKEDIN_ICON
import com.pat.portfolio.core.constants.Icons.NEXT_JS_ICON
import com.pat.portfolio.core.constants.Icons.REACT_ICON
import com.pat.portfolio.core.constants.Icons.REDUX_ICON
import com.pat.portfolio.core.constants.Icons.TYPESCRIPT_ICON
import com.pat.portfolio.core.constants.Icons.VERCEL_ICON
import com.pat.portfolio.core.constants.Icons.VS_CODE_ICON

enum class IconLinks(
    val itemName: String,
    val iconPath: String,
    val url: String,
) {
    // Programming languages & frameworks
    Kotlin(
        itemName = "Kotlin",
        iconPath = KOTLIN_ICON,
        url = KOTLIN_URL
    ),
    Kobweb(
        itemName = "Kobweb",
        iconPath = KOBWEB_ICON,
        url = KOBWEB_URL
    ),
    ComposeHtml(
        itemName = "Compose HTML",
        iconPath = COMPOSE_HTML_ICON,
        url = COMPOSE_HTML_URL
    ),
    CSS(
        itemName = "CSS",
        iconPath = CSS_ICON,
        url = CSS_URL
    ),
    Dart(
        itemName = "Dart",
        iconPath = DART_ICON,
        url = DART_URL
    ),
    Flutter(
        itemName = "Flutter",
        iconPath = FLUTTER_ICON,
        url = FLUTTER_URL
    ),
    Framer(
        itemName = "Framer Motion",
        iconPath = FRAMER_ICON,
        url = FRAMER_URL
    ),
    GSAP(
        itemName = "GSAP",
        iconPath = GREENSOCK_ICON,
        url = GREENSOCK_URL
    ),
    HTML(
        itemName = "HTML",
        iconPath = HTML_ICON,
        url = HTML_URL
    ),
    JavaScript(
        itemName = "JavaScript",
        iconPath = JAVASCRIPT_ICON,
        url = JAVASCRIPT_URL
    ),
    NextJs(
        itemName = "Next.js",
        iconPath = NEXT_JS_ICON,
        url = NEXT_JS_URL
    ),
    React(
        itemName = "React",
        iconPath = REACT_ICON,
        url = REACT_URL
    ),
    Redux(
        itemName = "Redux",
        iconPath = REDUX_ICON,
        url = REDUX_URL
    ),
    Typescript(
        itemName = "TypeScript",
        iconPath = TYPESCRIPT_ICON,
        url = TYPESCRIPT_URL
    ),

    // Tools
    AffinityDesigner(
        itemName = "Affinity Designer",
        iconPath = AFFINITY_DESIGNER_ICON,
        url = AFFINITY_DESIGNER_URL
    ),
    AndroidStudio(
        itemName = "Android Studio",
        iconPath = ANDROID_STUDIO_ICON,
        url = ANDROID_STUDIO_URL
    ),
    Azure(
        itemName = "Microsoft Azure",
        iconPath = AZURE_ICON,
        url = AZURE_URL
    ),
    CosmosDb(
        itemName = "Azure Cosmos DB",
        iconPath = COSMOSDB_ICON,
        url = COSMOSDB_URL
    ),
    Figma(
        itemName = "Figma",
        iconPath = FIGMA_ICON,
        url = FIGMA_URL
    ),
    Admob(
        itemName = "Google AdMob",
        iconPath = ADMOB_ICON,
        url = GOOGLE_ADMOB_URL
    ),
    GoogleCloud(
        itemName = "Google Cloud",
        iconPath = GOOGLE_CLOUD_ICON,
        url = GOOGLE_CLOUD_URL
    ),
    IntelliJ(
        itemName = "IntelliJ",
        iconPath = INTELLIJ_ICON,
        url = INTELLIJ_URL
    ),
    Vercel(
        itemName = "Vercel",
        iconPath = VERCEL_ICON,
        url = VERCEL_URL
    ),
    VsCode(
        itemName = "Visual Studio Code",
        iconPath = VS_CODE_ICON,
        url = VS_CODE_URL
    ),

    // External Links
    Linkedin(
        itemName = "LinkedIn",
        iconPath = LINKEDIN_ICON,
        url = LINKEDIN_CONTACT_URL
    ),
    Github(
        itemName = "Github",
        iconPath = GITHUB_ICON,
        url = GITHUB_CONTACT_URL
    )
}