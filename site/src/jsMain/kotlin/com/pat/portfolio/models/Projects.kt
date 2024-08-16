package com.pat.portfolio.models

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
        shortDescription = "With Flutter, I created several mobile apps and put them up on the Google Play Store.",
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
    )
}

enum class SubProjects(
    val id: String,
    val title: String,
    val description: String,
    val externalUrl: String,
    val icon: String,
    val images: List<String>,
    val technologies: List<IconLinks>
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
        technologies = listOf(),
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
        technologies = listOf(),
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
        technologies = listOf(),
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
        technologies = listOf(),
    ),

    // Data integration projects
    JobsApi(
        id = "jobs-api",
        title = "Jobs API",
        description = "Atlas is an app built to find work globally.<br>Instead of being bound to certain regions this app allows for global job search.<br>",
        externalUrl = "https://rapidapi.com/Pat92/api/jobs-api14",
        icon = "https://rapidapi.com/hub/_next/image?url=https%3A%2F%2Frapidapi-prod-apis.s3.amazonaws.com%2F45a489a1-f7de-45f9-8fa2-f735baa58fd2.png&w=1920&q=75",
        images = listOf(),
        technologies = listOf(),
    ),
    ForexApi(
        id = "forex-api",
        title = "Forex API",
        description = "Atlas is an app built to find work globally.<br>Instead of being bound to certain regions this app allows for global job search.<br>",
        externalUrl = "https://rapidapi.com/Pat92/api/forex-api2",
        icon = "https://rapidapi.com/hub/_next/image?url=https%3A%2F%2Frapidapi-prod-apis.s3.amazonaws.com%2Ffca6cad1-5c2e-4887-abf1-5750c062bacd.png&w=1920&q=75",
        images = listOf(),
        technologies = listOf(),
    ),
    SoundcloudApi(
        id = "soundcloud-api",
        title = "Soundcloud API",
        description = "Atlas is an app built to find work globally.<br>Instead of being bound to certain regions this app allows for global job search.<br>",
        externalUrl = "https://rapidapi.com/Pat92/api/soundcloud-api3",
        icon = "https://rapidapi.com/hub/_next/image?url=https%3A%2F%2Frapidapi-prod-apis.s3.amazonaws.com%2F0183b8c7-e5fe-464a-92f2-f5a5528c1f94.png&w=1920&q=75",
        images = listOf(),
        technologies = listOf(),
    ),
    GoogleTranslateApi(
        id = "google-translate-api",
        title = "Google Translate API",
        description = "Atlas is an app built to find work globally.<br>Instead of being bound to certain regions this app allows for global job search.<br>",
        externalUrl = "https://rapidapi.com/Pat92/api/google-translate-api9",
        icon = "https://rapidapi.com/hub/_next/image?url=https%3A%2F%2Frapidapi-prod-apis.s3.amazonaws.com%2F98ebf6f3-e615-446a-9e18-168a986576df.png&w=1920&q=75",
        images = listOf(),
        technologies = listOf(),
    ),

    // Website projects
    VolarinkWebsite(
        id = "volarink-website",
        title = "Volarink Tattoo Studio",
        description = "Atlas is an app built to find work globally.<br>Instead of being bound to certain regions this app allows for global job search.<br>",
        externalUrl = "https://www.volarink.no/",
        icon = "https://www.volarink.no/assets/images/main/logo-min.webp",
        images = listOf(),
        technologies = listOf(),
    ),
    PortfolioV2(
        id = "portfolio-v2-website",
        title = "Portfolio Website V2",
        description = "Atlas is an app built to find work globally.<br>Instead of being bound to certain regions this app allows for global job search.<br>",
        externalUrl = "",
        icon = "",
        images = listOf(),
        technologies = listOf(),
    ),
    PortfolioV1(
        id = "portfolio-v1-website",
        title = "Portfolio Website V1",
        description = "Atlas is an app built to find work globally.<br>Instead of being bound to certain regions this app allows for global job search.<br>",
        externalUrl = "",
        icon = "",
        images = listOf(),
        technologies = listOf(),
    ),

    // Open source projects
    DartAzureSignIn(
        id = "dart-azure-sign-in",
        title = "Dart package for Azure AD Sign In",
        description = "Atlas is an app built to find work globally.<br>Instead of being bound to certain regions this app allows for global job search.<br>",
        externalUrl = "https://pub.dev/packages/dart_azure_ad_sign_in",
        icon = "https://pub.dev/static/hash-95guep1u/img/pub-dev-logo.svg",
        images = listOf(),
        technologies = listOf(),
    ),
    DartCosmosDb(
        id = "dart-cosmos-db",
        title = "Dart package for the Azure Cosmos Database",
        description = "Atlas is an app built to find work globally.\nInstead of being bound to certain regions this app allows for global job search.<br>",
        externalUrl = "https://pub.dev/packages/dart_azure_cosmosdb",
        icon = "https://pub.dev/static/hash-95guep1u/img/pub-dev-logo.svg",
        images = listOf(),
        technologies = listOf(),
    ),
}