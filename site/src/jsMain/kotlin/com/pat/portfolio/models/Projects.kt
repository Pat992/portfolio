package com.pat.portfolio.models

import com.pat.portfolio.core.constants.SvgPaths

enum class Projects(
    val id: String,
    val title: String,
    val shortDescription: String,
    val description: String,
    val svgPath: String,
    val projects: List<SubProjects>
) {
    Api(
        id = "data-integration",
        title = "API & DATA INTEGRATION",
        shortDescription = "Gathering, combining, and cleaning data from multiple sources to publish it in a JSON format via APIs.",
        description = "",
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
        description = "",
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
        description = "",
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
        description = "",
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
    val externalUrl: String,
    val icon: String,
    val images: List<String>,
    val technologies: List<IconLinks>
) {
    // Mobile projects
    Atlas(
        id = "atlas",
        title = "ATLAS Job-board",
        externalUrl = "https://play.google.com/store/apps/details?id=htth.atlas.jobboard",
        icon = "https://play-lh.googleusercontent.com/qSinVFuam313Uj5xPph-5KgcuVjt-ms4G7o3WhaBYqfpds1ulLOvvcUFyqtXLuHvBZVt=w240-h480",
        images = listOf(
            "https://play-lh.googleusercontent.com/-WkvFgIPVbMb53YYwjxy1BFjhU8pKFA4h4TJlyfsHkET5WmBKidoyz-F7DoW4s_X3w=w560-h560",
            "https://play-lh.googleusercontent.com/3lCwrU5C-9Gtq1BshpZk1_4D5DCK3abYy3jRtYgE_C-e0s03sR6vVkItdOBZhfJ8oUOp=w560-h560",
            "https://play-lh.googleusercontent.com/V8avjPMBzjGmem5tSt1hFWlQW6eopjK_cNf9p6FMmCmwU7Pk9OACHVNRw8iQrDBGlLE=w560-h560",
            "https://play-lh.googleusercontent.com/P6o6ug7JAqHuXaZHTZtzuLc4IZt9WjwV_yiMqjO1Gwl9_ojMMOd4wYm3M_JSki5jmCM=w560-h560",
            "https://play-lh.googleusercontent.com/70FFS-7RaesvMSi0R9NlFBV1Qt5QCKX2HTyKth0a1MWSxXbx-BKK9KCP4UtZJvgLazM=w560-h560",
            "https://play-lh.googleusercontent.com/Edm0yRC73EOH1FalkpMJloLuVVwCkpTNGmABcLHerZsXCbgXAZbDH1a5W_269n0AsoFO=w560-h560",
            "https://play-lh.googleusercontent.com/CTccRWydsb20I0yiPrc0YJYh2n3P6I7EGmkuOgzt0du5H5O3KVv9XcNDFe1i9f9y0s8=w560-h560",
            "https://play-lh.googleusercontent.com/z7HHBHsdJe8pEEMbtVLnk78ZNS8zTsIQYJtnaRrLsE8TpHjI7gqB5UfUMr4Wkrk686o=w560-h560"
        ),
        technologies = listOf(),
    ),
    RemoteXpress(
        id = "remote-xpress",
        title = "RemoteXpress SSH & SFTP & FTP",
        externalUrl = "https://play.google.com/store/apps/details?id=htth.multiclient.ssh_sftp_ftp",
        icon = "https://play-lh.googleusercontent.com/cFSq8zDb6xEUCfhMJ1TanmgYVOeGl8sjuKSI5SLfKRy-JUxwHXZwpTSdv3iy690fiGEI=w240-h480",
        images = listOf(
            "https://play-lh.googleusercontent.com/tx3AMMAlsV5KC4_kE4ZcBRvDbhr-QhCf6QCmUQTg7yaFAxKkotJsTtv98O7WPvnDrw=w560-h560",
            "https://play-lh.googleusercontent.com/oj9n7nXFPPRH0SAktqLM5rrTPoo23s93IsJbxL0DGgy7nUne4IiDOLPe3wXiqArcrwJT=w560-h560",
            "https://play-lh.googleusercontent.com/ZKeaSMGjJqEzGRxtQ4QERTqLGomHROFMqA68f_9_YvLYgkiGg7Ee0zuzC4Rw66fzKBE=w560-h560",
            "https://play-lh.googleusercontent.com/9i9Lp1x4HxFr_FqeHKDbdVBMlcSCk4USQ4-_8-essskELl-gadBIZYJZ3xZWXfzxG2E=w560-h560",
            "https://play-lh.googleusercontent.com/Rd7v2CA3GViJtA-1tFPuyOuQ3SWxj7V3B5cYogWMufBJ1e_7-7Lapt5qLRjryKc9mA=w560-h560",
            "https://play-lh.googleusercontent.com/vfh1rc3oefaYJSwRqUaC5DK-BfJr-cuJa-uGpUmlza2maan9I-_4BjwoE5q60X9ZMQC6=w560-h560",
            "https://play-lh.googleusercontent.com/V4wxpWVf-AhpHLzlwYHFgmSdlkDvOxnlUYLabSu8MhB1YvT8LCBZ41sbUiPfkFwpVVF6=w560-h560"
        ),
        technologies = listOf(),
    ),
    AdWave(
        id = "adwave",
        title = "AdWave - Console for AdMob",
        externalUrl = "https://play.google.com/store/apps/details?id=htth.admob.android.AdWave",
        icon = "https://play-lh.googleusercontent.com/fiNgboz1eIrYSy5NHB2FeMJtoIo55Jls7tJPYvBAQJkAJeYf-8Dtn49eo760qoWDrFHf=w240-h480",
        images = listOf(
            "https://play-lh.googleusercontent.com/fsXfMqklly-FMQOrAeOIkShqC4l8FAS-9CTWg8rqGdVfItlFB9yk4wNhVzwIuA7CvMs=w560-h560",
            "https://play-lh.googleusercontent.com/MYGYzLzhzcYqZV6mYpqlsmOOEpKOQbsDDOJnCO1QRt2yk5SEbrWqXo4RvErRvTkYLQ=w560-h560",
            "https://play-lh.googleusercontent.com/AF3KBL3KFYajCiz9gNLexCq-S7FYzM-Y6UHkPSFLbq6q28LWGo9rfdXAF6G9u_ycUeo=w560-h560",
            "https://play-lh.googleusercontent.com/MM867C_p-O-cKtP1QNZsH7QXPKcJEBpKDwEYFsnbdXyrPCg9j-r0MOxkX_7ZCkD1Rcww=w560-h560",
            "https://play-lh.googleusercontent.com/ioG8JpkCCySdYgCQgVsaj37xDMFHFDFmTWWDjo_6f98NnwaOS1qcq0AtUM1_bKULBek=w560-h560",
            "https://play-lh.googleusercontent.com/rOhIlR7LR6yTPVfgWfHxD5BZR1HEExFFFyjrICYaq7hPgBlU6ElU5gV9P95O05rC82I=w560-h560",
            "https://play-lh.googleusercontent.com/lPqd5olVprUnQrkp3z3Wt8pQXlosedWxswRKN6GJzNIHkAM_7zZgJug70ahYwarTlDw=w560-h560",
            "https://play-lh.googleusercontent.com/pueZ2cpZreoxlUBDtHGO4aQ4yJXEtDtI4Mun48pJRbo3JSuG9-bSPEh06_XUMb32X8M=w560-h560"
        ),
        technologies = listOf(),
    ),
    AndFm(
        id = "andfm",
        title = "andFM - Radio online FM",
        externalUrl = "https://play.google.com/store/apps/details?id=com.htth.and_fm",
        icon = "https://play-lh.googleusercontent.com/gjB9hinll_gj5iEGSf5g8d26R9G_HRPIRQQHwCIS98lvj5ozJRtt1GZJwgLZ-bGUzoY-=w240-h480",
        images = listOf(
            "https://play-lh.googleusercontent.com/o3VxsZ5s1_afjBEZPZNQV-78k3i4cj_3WbenDkxXxsn2ZIRV3LIL7nQNC35fYJcLxCDs=w526-h296",
            "https://play-lh.googleusercontent.com/NoDNcY1pZNNiYrNe0c6EXD7qPyEK7PmXyMhZQJsF5j03pOXrn9a1SbBIxPkyn4QWdw=w526-h296",
            "https://play-lh.googleusercontent.com/tI3XlVfKRLjxHIxzOlaVBDjHyvEqkb7PFxFdaSvSPhxw6C0ZOloXrT4E_ZJgPaclXbI=w526-h296",
            "https://play-lh.googleusercontent.com/rEzc3xR1rRJ1GyNJaTj5lrl1S0etBeuNSGY9YtTpmZbfzLP0dPK__yuOwstKd11p1w=w526-h296",
            "https://play-lh.googleusercontent.com/7AtLZrwCZDHPoNUoJQMkfFU02IR_I5-IPliVSKndBLye_pPiB3GBs5IVhKrp7EkFpSbm=w526-h296"
        ),
        technologies = listOf(),
    ),

    // Data integration projects
    JobsApi(
        id = "jobs-api",
        title = "Jobs API",
        externalUrl = "https://rapidapi.com/Pat92/api/jobs-api14",
        icon = "https://rapidapi.com/hub/_next/image?url=https%3A%2F%2Frapidapi-prod-apis.s3.amazonaws.com%2F45a489a1-f7de-45f9-8fa2-f735baa58fd2.png&w=1920&q=75",
        images = listOf(),
        technologies = listOf(),
    ),
    ForexApi(
        id = "forex-api",
        title = "Forex API",
        externalUrl = "https://rapidapi.com/Pat92/api/forex-api2",
        icon = "https://rapidapi.com/hub/_next/image?url=https%3A%2F%2Frapidapi-prod-apis.s3.amazonaws.com%2Ffca6cad1-5c2e-4887-abf1-5750c062bacd.png&w=1920&q=75",
        images = listOf(),
        technologies = listOf(),
    ),
    SoundcloudApi(
        id = "soundcloud-api",
        title = "Soundcloud API",
        externalUrl = "https://rapidapi.com/Pat92/api/soundcloud-api3",
        icon = "https://rapidapi.com/hub/_next/image?url=https%3A%2F%2Frapidapi-prod-apis.s3.amazonaws.com%2F0183b8c7-e5fe-464a-92f2-f5a5528c1f94.png&w=1920&q=75",
        images = listOf(),
        technologies = listOf(),
    ),
    GoogleTranslateApi(
        id = "google-translate-api",
        title = "Google Translate API",
        externalUrl = "https://rapidapi.com/Pat92/api/google-translate-api9",
        icon = "https://rapidapi.com/hub/_next/image?url=https%3A%2F%2Frapidapi-prod-apis.s3.amazonaws.com%2F98ebf6f3-e615-446a-9e18-168a986576df.png&w=1920&q=75",
        images = listOf(),
        technologies = listOf(),
    ),

    // Website projects
    VolarinkWebsite(
        id = "volarink-website",
        title = "Volarink Tattoo Studio",
        externalUrl = "https://www.volarink.no/",
        icon = "https://www.volarink.no/assets/images/main/logo-min.webp",
        images = listOf(),
        technologies = listOf(),
    ),
    PortfolioV2(
        id = "portfolio-v2-website",
        title = "Portfolio Website V2",
        externalUrl = "",
        icon = "",
        images = listOf(),
        technologies = listOf(),
    ),
    PortfolioV1(
        id = "portfolio-v1-website",
        title = "Portfolio Website V1",
        externalUrl = "",
        icon = "",
        images = listOf(),
        technologies = listOf(),
    ),

    // Open source projects
    DartAzureSignIn(
        id = "dart-azure-sign-in",
        title = "Dart package for Azure AD Sign In",
        externalUrl = "https://pub.dev/packages/dart_azure_ad_sign_in",
        icon = "https://pub.dev/static/hash-95guep1u/img/pub-dev-logo.svg",
        images = listOf(),
        technologies = listOf(),
    ),
    DartCosmosDb(
        id = "dart-cosmos-db",
        title = "Dart package for the Azure Cosmos Database",
        externalUrl = "https://pub.dev/packages/dart_azure_cosmosdb",
        icon = "https://pub.dev/static/hash-95guep1u/img/pub-dev-logo.svg",
        images = listOf(),
        technologies = listOf(),
    ),
}