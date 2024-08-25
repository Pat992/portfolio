package com.pat.portfolio.models

import com.pat.portfolio.core.constants.Icons.PORTFOLIO_V1_ICON
import com.pat.portfolio.core.constants.Icons.PORTFOLIO_V2_ICON
import com.pat.portfolio.core.constants.SvgPaths

private const val ICONS_BASE_PATH = "/icons"
private const val IMAGES_BASE_PATH = "/images"

enum class Projects(
    val id: String,
    val title: String,
    val shortDescription: String,
    val svgPath: String,
    val projects: List<SubProjects>
) {
    Api(
        id = "data-integration",
        title = "API & DATA INTEGRATION",
        shortDescription = "Gathering, combining, and cleaning data from multiple sources to publish it in a JSON format via APIs.",
        svgPath = SvgPaths.API_PATH,
        projects = listOf(
            SubProjects.JobsApi,
            SubProjects.ForexApi,
            SubProjects.SoundcloudApi,
            SubProjects.GoogleTranslateApi
        )
    ),
    Mobile(
        id = "mobile",
        title = "MOBILE",
        shortDescription = "Several mobile apps created with Flutter and put them up on the Google Play Store.",
        svgPath = SvgPaths.PLAY_STORE_PATH,
        projects = listOf(
            SubProjects.Atlas,
            SubProjects.RemoteXpress,
            SubProjects.AdWave,
            SubProjects.AndFm
        )
    ),
    Web(
        id = "web",
        title = "WEB",
        shortDescription = "Created and released landing pages using different technologies.",
        svgPath = SvgPaths.WEBSITE_PATH,
        projects = listOf(
            SubProjects.VolarinkWebsite,
            SubProjects.PortfolioV2,
            SubProjects.PortfolioV1
        )
    ),
    OpenSource(
        id = "open-source",
        title = "DART OPEN SOURCE PACKAGES",
        shortDescription = "Created open-source Dart packages for Azure.",
        svgPath = SvgPaths.BRACKETS_PATH,
        projects = listOf(
            SubProjects.DartAzureSignIn,
            SubProjects.DartCosmosDb
        )
    ),
}

enum class SubProjects(
    val id: String,
    val title: String,
    val description: String,
    val externalUrl: String,
    val icon: String,
    val images: List<String>,
    val technologies: List<IconLinks>,
    val tools: List<IconLinks>
) {
    // Mobile projects
    Atlas(
        id = "atlas",
        title = "ATLAS Job-board",
        description = "Atlas provides multiple language options and customizable themes, making it easy to tailor the app to your preferences." +
                "|With Atlas, you can search for jobs worldwide by company names or job titles, and filter results by employment types such as full-time, part-time, contractor, or intern." +
                "|You can also narrow down your search to only remote jobs, and save job opportunities or share them directly from the app" +
                "|I developed Atlas because I found that most other job search apps were either limited by location or required account creation, which often felt restrictive.",
        externalUrl = "https://play.google.com/store/apps/details?id=htth.atlas.jobboard",
        icon = "$ICONS_BASE_PATH/mobile/atlas.webp",
        images = listOf(
            "$IMAGES_BASE_PATH/atlas/image1.webp",
            "$IMAGES_BASE_PATH/atlas/image2.webp",
            "$IMAGES_BASE_PATH/atlas/image3.webp",
            "$IMAGES_BASE_PATH/atlas/image4.webp",
            "$IMAGES_BASE_PATH/atlas/image5.webp",
            "$IMAGES_BASE_PATH/atlas/image6.webp",
            "$IMAGES_BASE_PATH/atlas/image7.webp",
            "$IMAGES_BASE_PATH/atlas/image8.webp"
        ),
        technologies = listOf(
            IconLinks.Dart,
            IconLinks.Flutter,
        ),
        tools = listOf(
            IconLinks.AffinityDesigner,
            IconLinks.AndroidStudio,
        )
    ),
    RemoteXpress(
        id = "remote-xpress",
        title = "RemoteXpress SSH & SFTP & FTP",
        description = "RemoteXpress lets you connect to SFTP, FTP, FTPES, or FTPS servers, allowing you to create, modify, and delete files and folders remotely. If the server supports it, you can also use a terminal directly on the remote machine." +
                "|The app allows you to create accounts and connections for quick server access, and you can customize the theme to your preference." +
                "|I developed RemoteXpress based on my experience in data integration. I often needed to check files and folders when I wasn't at my computer, so I built this app to make that process easier.",
        externalUrl = "https://play.google.com/store/apps/details?id=htth.multiclient.ssh_sftp_ftp",
        icon = "$ICONS_BASE_PATH/mobile/remotexpress.webp",
        images = listOf(
            "$IMAGES_BASE_PATH/remotexpress/Ad-1.webp",
            "$IMAGES_BASE_PATH/remotexpress/Ad-2.webp",
            "$IMAGES_BASE_PATH/remotexpress/Ad-3.webp",
            "$IMAGES_BASE_PATH/remotexpress/Ad-4.webp",
            "$IMAGES_BASE_PATH/remotexpress/Ad-5.webp",
            "$IMAGES_BASE_PATH/remotexpress/Ad-6.webp",
            "$IMAGES_BASE_PATH/remotexpress/Ad-7.webp"
        ),
        technologies = listOf(
            IconLinks.Dart,
            IconLinks.Flutter,
        ),
        tools = listOf(
            IconLinks.AffinityDesigner,
            IconLinks.AndroidStudio,
        )
    ),
    AdWave(
        id = "adwave",
        title = "AdWave - Console for AdMob",
        description = "I created AdWave as a simple solution to easily access and monitor my AdMob account, allowing me to track earnings and identify the top-performing apps." +
                "|The app provides insights into AdMob income, broken down by apps and countries, with adjustable timeframes for a more detailed analysis." +
                "|AdWave is built using the Google Cloud AdMob API and Google Sign-In for access to your AdMob data.",
        externalUrl = "https://play.google.com/store/apps/details?id=htth.admob.android.AdWave",
        icon = "$ICONS_BASE_PATH/mobile/adwave.webp",
        images = listOf(
            "$IMAGES_BASE_PATH/adwave/Ad-1.webp",
            "$IMAGES_BASE_PATH/adwave/Ad-2.webp",
            "$IMAGES_BASE_PATH/adwave/Ad-3.webp",
            "$IMAGES_BASE_PATH/adwave/Ad-4.webp",
            "$IMAGES_BASE_PATH/adwave/Ad-5.webp",
            "$IMAGES_BASE_PATH/adwave/Ad-6.webp",
            "$IMAGES_BASE_PATH/adwave/Ad-7.webp",
            "$IMAGES_BASE_PATH/adwave/Ad-8.webp"
        ),
        technologies = listOf(
            IconLinks.Dart,
            IconLinks.Flutter,
            IconLinks.Admob,
            IconLinks.GoogleCloud
        ),
        tools = listOf(
            IconLinks.AffinityDesigner,
            IconLinks.AndroidStudio,
        )
    ),
    AndFm(
        id = "andfm",
        title = "andFM - Radio online FM",
        description = "andFM started as a school project, but I wanted to rebuild it with a better architecture and a more polished design." +
                "|It’s a radio app that connects to an internet radio API, offering access to over 28,000 stations." +
                "|Users can search and listen to stations by name, country, or genre, and favorite stations can be easily saved for quick access.",
        externalUrl = "https://play.google.com/store/apps/details?id=com.htth.and_fm",
        icon = "$ICONS_BASE_PATH/mobile/andfm.webp",
        images = listOf(
            "$IMAGES_BASE_PATH/andfm/Ad-1.webp",
            "$IMAGES_BASE_PATH/andfm/Ad-2.webp",
            "$IMAGES_BASE_PATH/andfm/Ad-3.webp",
            "$IMAGES_BASE_PATH/andfm/Ad-4.webp",
            "$IMAGES_BASE_PATH/andfm/Ad-5.webp"
        ),
        technologies = listOf(
            IconLinks.Dart,
            IconLinks.Flutter,
        ),
        tools = listOf(
            IconLinks.AffinityDesigner,
            IconLinks.AndroidStudio,
        )
    ),

    // Data integration projects
    JobsApi(
        id = "jobs-api",
        title = "Jobs API",
        description = "Jobs API searches for job postings across Google, aggregating results from providers like LinkedIn, Indeed, Jooble, ZipRecruiter, Glassdoor, and many others. The collected data is unified and converted into JSON format for easy integration." +
                "|Users can search for jobs globally using criteria, like job title, company, location, distance, remote-only options, posting date, and employment type. Additionally, the API provides endpoints to retrieve job details by ID or to find salary ranges for specific job titles and locations.",
        externalUrl = "https://rapidapi.com/Pat92/api/jobs-api14",
        icon = "https://rapidapi.com/hub/_next/image?url=https%3A%2F%2Frapidapi-prod-apis.s3.amazonaws.com%2F45a489a1-f7de-45f9-8fa2-f735baa58fd2.png&w=1920&q=75",
        images = listOf(),
        technologies = listOf(
            IconLinks.Json,
            IconLinks.NextJs,
            IconLinks.NodeJs,
            IconLinks.Typescript,
        ),
        tools = listOf(
            IconLinks.AffinityDesigner,
            IconLinks.Vercel,
            IconLinks.VsCode,
        )
    ),
    ForexApi(
        id = "forex-api",
        title = "Forex API",
        description = "Forex API gathers sentiment data, including trader sentiment (the ratio of traders currently selling versus buying) and technical sentiment based on various indicators. Additionally, the API offers an economic calendar endpoint, allowing users to track upcoming economic events and speeches that could impact currency pairs." +
                "|The data is sourced from multiple resources, unified into a consistent JSON format, and accessible through user-friendly endpoints.",
        externalUrl = "https://rapidapi.com/Pat92/api/forex-api2",
        icon = "https://rapidapi.com/hub/_next/image?url=https%3A%2F%2Frapidapi-prod-apis.s3.amazonaws.com%2Ffca6cad1-5c2e-4887-abf1-5750c062bacd.png&w=1920&q=75",
        images = listOf(),
        technologies = listOf(
            IconLinks.Json,
            IconLinks.NextJs,
            IconLinks.NodeJs,
            IconLinks.Typescript,
        ),
        tools = listOf(
            IconLinks.AffinityDesigner,
            IconLinks.Vercel,
            IconLinks.VsCode,
        )
    ),
    SoundcloudApi(
        id = "soundcloud-api",
        title = "Soundcloud API",
        description = "The Soundcloud API allows users to search for albums, artists, tracks, and playlists. Each of these search endpoints is complemented by a \"get\" endpoint, which retrieves detailed information for a specific item using its unique ID." +
                "|Additionally, there’s an endpoint that provides the streaming or download URL for any specific track.",
        externalUrl = "https://rapidapi.com/Pat92/api/soundcloud-api3",
        icon = "https://rapidapi.com/hub/_next/image?url=https%3A%2F%2Frapidapi-prod-apis.s3.amazonaws.com%2F0183b8c7-e5fe-464a-92f2-f5a5528c1f94.png&w=1920&q=75",
        images = listOf(),
        technologies = listOf(
            IconLinks.Json,
            IconLinks.NextJs,
            IconLinks.NodeJs,
            IconLinks.Typescript,
        ),
        tools = listOf(
            IconLinks.AffinityDesigner,
            IconLinks.Vercel,
            IconLinks.VsCode,
        )
    ),
    GoogleTranslateApi(
        id = "google-translate-api",
        title = "Google Translate API",
        description = "The Google Translate API is relatively straightforward. It features a simplified \"Translate\" endpoint that takes a word or sentence and an output language, with an optional input language (if not provided, Google will automatically detect the input language). The endpoint then returns the translated word or sentence." +
                "|Additionally, there's a more advanced \"Translate\" endpoint that accepts the same input but provides a richer response. This includes translation alternatives, synonyms for both the input and output languages, and a definition of the input term.",
        externalUrl = "https://rapidapi.com/Pat92/api/google-translate-api9",
        icon = "https://rapidapi.com/hub/_next/image?url=https%3A%2F%2Frapidapi-prod-apis.s3.amazonaws.com%2F98ebf6f3-e615-446a-9e18-168a986576df.png&w=1920&q=75",
        images = listOf(),
        technologies = listOf(
            IconLinks.Json,
            IconLinks.NextJs,
            IconLinks.NodeJs,
            IconLinks.Typescript,
        ),
        tools = listOf(
            IconLinks.AffinityDesigner,
            IconLinks.Vercel,
            IconLinks.VsCode,
        )
    ),

    // Website projects
    VolarinkWebsite(
        id = "volarink-website",
        title = "Volarink Tattoo Studio",
        description = "I revamped the landing page for Volarink Tattoo Studio, using vanilla JavaScript for core functionality, SCSS for styling, Alpine.js for dynamic content changes (like translations), and GSAP for smooth animations." +
                "|The original site was a basic HTML page with just text and a link to the Instagram profile. Now, it features a rich user experience with images, animations, a tattoo gallery, an about section, a contact section with links to Instagram, a Google Maps location, and an FAQ section. The site is also available in both English and Norwegian.",
        externalUrl = "https://www.volarink.no/",
        icon = "https://www.volarink.no/assets/images/main/logo-min.webp",
        images = listOf(),
        technologies = listOf(
            IconLinks.CSS,
            IconLinks.GSAP,
            IconLinks.HTML,
            IconLinks.JavaScript,
        ),
        tools = listOf(
            IconLinks.Figma,
            IconLinks.VsCode,
        )
    ),
    PortfolioV2(
        id = "portfolio-v2-website",
        title = "Portfolio Website V2",
        description = "I decided to rewrite my portfolio website because the original version was built with React, which isn’t very SEO-friendly." +
                "|Since I have some experience with Jetpack Compose and Kotlin, I wanted to use a similar approach for the rebuild. After some research, I found Kobweb to be the perfect solution. Kobweb uses HTML Compose to create static websites, offering a development experience similar to Jetpack Compose.",
        externalUrl = "https://pat992.github.io/portfolio/",
        icon = PORTFOLIO_V2_ICON,
        images = listOf(),
        technologies = listOf(
            IconLinks.ComposeHtml,
            IconLinks.Kobweb,
            IconLinks.Kotlin,
        ),
        tools = listOf(
            IconLinks.Figma,
            IconLinks.IntelliJ,
        )
    ),
    PortfolioV1(
        id = "portfolio-v1-website",
        title = "Portfolio Website V1",
        description = "The initial version of my portfolio website was built using React, with Redux handling state management, Framer Motion powering animations, and EmailJS enabling the contact form functionality.",
        externalUrl = "https://github.com/Pat992/portfolio/tree/master/_V1-React",
        icon = PORTFOLIO_V1_ICON,
        images = listOf(),
        technologies = listOf(
            IconLinks.CSS,
            IconLinks.Framer,
            IconLinks.HTML,
            IconLinks.React,
            IconLinks.Redux,
            IconLinks.NodeJs,
            IconLinks.Typescript,
        ),
        tools = listOf(
            IconLinks.AffinityDesigner,
            IconLinks.VsCode,
        )
    ),

    // Open source projects
    DartAzureSignIn(
        id = "dart-azure-sign-in",
        title = "Dart package for Azure AD Sign In",
        description = "I developed a Dart package that allows users to sign in to Azure with a Microsoft account, using the same default scopes as the Azure CLI, if not configured." +
                "|I created this package while planning to build a tool for configuring and managing Azure resources, but I wanted to avoid the hassle of registering an app. After a deep dive into the Azure CLI code, I discovered the scopes and settings it uses for authentication." +
                "|Although I never ended up creating the tool, I was happy with the package and decided to release it. An intern later used it to develop a Flutter app for Azure cost analysis.",
        externalUrl = "https://pub.dev/packages/dart_azure_ad_sign_in",
        icon = "https://pub.dev/static/hash-95guep1u/img/pub-dev-logo.svg",
        images = listOf(),
        technologies = listOf(
            IconLinks.Dart,
        ),
        tools = listOf(
            IconLinks.AndroidStudio,
            IconLinks.Azure,
        )
    ),
    DartCosmosDb(
        id = "dart-cosmos-db",
        title = "Dart package for the Azure Cosmos Database",
        description = "I developed another Dart package for a project that never saw the light of day, but since I was satisfied with the outcome, I decided to release the package anyway. This package uses the Azure API but significantly simplifies its usage." +
                "|The package includes functionality for managing databases, collections, documents, stored procedures, user-defined functions, triggers, users, and permissions, all with full CRUD (Create, Read, Update, Delete) operations. " +
                "|It also supports the execution of stored procedures and user-defined functions.",
        externalUrl = "https://pub.dev/packages/dart_azure_cosmosdb",
        icon = "https://pub.dev/static/hash-95guep1u/img/pub-dev-logo.svg",
        images = listOf(),
        technologies = listOf(
            IconLinks.Dart,
        ),
        tools = listOf(
            IconLinks.AndroidStudio,
            IconLinks.Azure,
            IconLinks.CosmosDb,
        )
    ),
}