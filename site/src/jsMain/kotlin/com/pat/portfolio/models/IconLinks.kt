package com.pat.portfolio.models

import com.pat.portfolio.core.constants.ExternalUrls.AFFINITY_DESIGNER_URL
import com.pat.portfolio.core.constants.ExternalUrls.ANDROID_STUDIO_URL
import com.pat.portfolio.core.constants.ExternalUrls.ANGULAR_URL
import com.pat.portfolio.core.constants.ExternalUrls.AZURE_DEVOPS_URL
import com.pat.portfolio.core.constants.ExternalUrls.AZURE_POWERSHELL_URL
import com.pat.portfolio.core.constants.ExternalUrls.AZURE_URL
import com.pat.portfolio.core.constants.ExternalUrls.AZ_CLI_URL
import com.pat.portfolio.core.constants.ExternalUrls.BICEP_URL
import com.pat.portfolio.core.constants.ExternalUrls.BIZTALK_URL
import com.pat.portfolio.core.constants.ExternalUrls.COMPOSE_HTML_URL
import com.pat.portfolio.core.constants.ExternalUrls.CONFLUENCE_URL
import com.pat.portfolio.core.constants.ExternalUrls.COSMOSDB_URL
import com.pat.portfolio.core.constants.ExternalUrls.CPP_URL
import com.pat.portfolio.core.constants.ExternalUrls.CSHARP_URL
import com.pat.portfolio.core.constants.ExternalUrls.CSS_URL
import com.pat.portfolio.core.constants.ExternalUrls.C_URL
import com.pat.portfolio.core.constants.ExternalUrls.DART_URL
import com.pat.portfolio.core.constants.ExternalUrls.DOTNET_URL
import com.pat.portfolio.core.constants.ExternalUrls.ECLIPSE_URL
import com.pat.portfolio.core.constants.ExternalUrls.FHIR_URL
import com.pat.portfolio.core.constants.ExternalUrls.FIGMA_URL
import com.pat.portfolio.core.constants.ExternalUrls.FLUTTER_URL
import com.pat.portfolio.core.constants.ExternalUrls.FRAMER_URL
import com.pat.portfolio.core.constants.ExternalUrls.GITHUB_CONTACT_URL
import com.pat.portfolio.core.constants.ExternalUrls.GIT_URL
import com.pat.portfolio.core.constants.ExternalUrls.GOOGLE_ADMOB_URL
import com.pat.portfolio.core.constants.ExternalUrls.GOOGLE_CLOUD_URL
import com.pat.portfolio.core.constants.ExternalUrls.GREENSOCK_URL
import com.pat.portfolio.core.constants.ExternalUrls.HTML_URL
import com.pat.portfolio.core.constants.ExternalUrls.INTELLIJ_URL
import com.pat.portfolio.core.constants.ExternalUrls.JAVASCRIPT_URL
import com.pat.portfolio.core.constants.ExternalUrls.JAVA_URL
import com.pat.portfolio.core.constants.ExternalUrls.JQUERY_URL
import com.pat.portfolio.core.constants.ExternalUrls.JSON_URL
import com.pat.portfolio.core.constants.ExternalUrls.KOBWEB_URL
import com.pat.portfolio.core.constants.ExternalUrls.KOTLIN_URL
import com.pat.portfolio.core.constants.ExternalUrls.LINKEDIN_CONTACT_URL
import com.pat.portfolio.core.constants.ExternalUrls.LIQUID_URL
import com.pat.portfolio.core.constants.ExternalUrls.MARIADB_URL
import com.pat.portfolio.core.constants.ExternalUrls.MATRIX_URL
import com.pat.portfolio.core.constants.ExternalUrls.MSSQL_URL
import com.pat.portfolio.core.constants.ExternalUrls.MS_SUITE_URL
import com.pat.portfolio.core.constants.ExternalUrls.NEXT_JS_URL
import com.pat.portfolio.core.constants.ExternalUrls.NODEJS_URL
import com.pat.portfolio.core.constants.ExternalUrls.NOTEPAD_PP_URL
import com.pat.portfolio.core.constants.ExternalUrls.NOTION_URL
import com.pat.portfolio.core.constants.ExternalUrls.PHPSTORM_URL
import com.pat.portfolio.core.constants.ExternalUrls.PHP_URL
import com.pat.portfolio.core.constants.ExternalUrls.POWERSHELL_URL
import com.pat.portfolio.core.constants.ExternalUrls.REACT_URL
import com.pat.portfolio.core.constants.ExternalUrls.REDUX_URL
import com.pat.portfolio.core.constants.ExternalUrls.SQL_URL
import com.pat.portfolio.core.constants.ExternalUrls.TYPESCRIPT_URL
import com.pat.portfolio.core.constants.ExternalUrls.VBA_URL
import com.pat.portfolio.core.constants.ExternalUrls.VERCEL_URL
import com.pat.portfolio.core.constants.ExternalUrls.VS_CODE_URL
import com.pat.portfolio.core.constants.ExternalUrls.VS_URL
import com.pat.portfolio.core.constants.ExternalUrls.XML_URL
import com.pat.portfolio.core.constants.ExternalUrls.XSLT_URL
import com.pat.portfolio.core.constants.ExternalUrls.YAML_URL
import com.pat.portfolio.core.constants.Icons.ADMOB_ICON
import com.pat.portfolio.core.constants.Icons.AFFINITY_DESIGNER_ICON
import com.pat.portfolio.core.constants.Icons.ANDROID_STUDIO_ICON
import com.pat.portfolio.core.constants.Icons.ANGULAR_ICON
import com.pat.portfolio.core.constants.Icons.AZURE_DEVOPS_ICON
import com.pat.portfolio.core.constants.Icons.AZURE_ICON
import com.pat.portfolio.core.constants.Icons.AZURE_POWERSHELL_ICON
import com.pat.portfolio.core.constants.Icons.AZ_CLI_ICON
import com.pat.portfolio.core.constants.Icons.BICEP_ICON
import com.pat.portfolio.core.constants.Icons.COMPOSE_HTML_ICON
import com.pat.portfolio.core.constants.Icons.CONFLUENCE_ICON
import com.pat.portfolio.core.constants.Icons.COSMOSDB_ICON
import com.pat.portfolio.core.constants.Icons.CPP_ICON
import com.pat.portfolio.core.constants.Icons.CSHARP_ICON
import com.pat.portfolio.core.constants.Icons.CSS_ICON
import com.pat.portfolio.core.constants.Icons.C_ICON
import com.pat.portfolio.core.constants.Icons.DART_ICON
import com.pat.portfolio.core.constants.Icons.DOTNET_ICON
import com.pat.portfolio.core.constants.Icons.ECLIPSE_ICON
import com.pat.portfolio.core.constants.Icons.FHIR_ICON
import com.pat.portfolio.core.constants.Icons.FIGMA_ICON
import com.pat.portfolio.core.constants.Icons.FLUTTER_ICON
import com.pat.portfolio.core.constants.Icons.FRAMER_ICON
import com.pat.portfolio.core.constants.Icons.GITHUB_ICON
import com.pat.portfolio.core.constants.Icons.GIT_ICON
import com.pat.portfolio.core.constants.Icons.GOOGLE_CLOUD_ICON
import com.pat.portfolio.core.constants.Icons.GREENSOCK_ICON
import com.pat.portfolio.core.constants.Icons.HTML_ICON
import com.pat.portfolio.core.constants.Icons.INTELLIJ_ICON
import com.pat.portfolio.core.constants.Icons.JAVASCRIPT_ICON
import com.pat.portfolio.core.constants.Icons.JAVA_ICON
import com.pat.portfolio.core.constants.Icons.JQUERY_ICON
import com.pat.portfolio.core.constants.Icons.JSON_ICON
import com.pat.portfolio.core.constants.Icons.KOBWEB_ICON
import com.pat.portfolio.core.constants.Icons.KOTLIN_ICON
import com.pat.portfolio.core.constants.Icons.LINKEDIN_ICON
import com.pat.portfolio.core.constants.Icons.LIQUID_ICON
import com.pat.portfolio.core.constants.Icons.MARIADB_ICON
import com.pat.portfolio.core.constants.Icons.MATRIX_ICON
import com.pat.portfolio.core.constants.Icons.MSSQL_ICON
import com.pat.portfolio.core.constants.Icons.MS_SUITE_ICON
import com.pat.portfolio.core.constants.Icons.NEXT_JS_ICON
import com.pat.portfolio.core.constants.Icons.NODEJS_ICON
import com.pat.portfolio.core.constants.Icons.NOTEPAD_PP_ICON
import com.pat.portfolio.core.constants.Icons.NOTION_ICON
import com.pat.portfolio.core.constants.Icons.PHPSTORM_ICON
import com.pat.portfolio.core.constants.Icons.PHP_ICON
import com.pat.portfolio.core.constants.Icons.POWERSHELL_ICON
import com.pat.portfolio.core.constants.Icons.REACT_ICON
import com.pat.portfolio.core.constants.Icons.REDUX_ICON
import com.pat.portfolio.core.constants.Icons.SQL_ICON
import com.pat.portfolio.core.constants.Icons.TYPESCRIPT_ICON
import com.pat.portfolio.core.constants.Icons.VBA_ICON
import com.pat.portfolio.core.constants.Icons.VERCEL_ICON
import com.pat.portfolio.core.constants.Icons.VS_CODE_ICON
import com.pat.portfolio.core.constants.Icons.VS_ICON
import com.pat.portfolio.core.constants.Icons.XML_ICON
import com.pat.portfolio.core.constants.Icons.XSLT_ICON
import com.pat.portfolio.core.constants.Icons.YAML_ICON

enum class IconLinks(
    val itemName: String,
    val iconPath: String,
    val url: String,
) {
    // Programming languages & frameworks
    Angular(
        itemName = "Angular",
        iconPath = ANGULAR_ICON,
        url = ANGULAR_URL
    ),
    Bicep(
        itemName = "Azure Bicep",
        iconPath = BICEP_ICON,
        url = BICEP_URL
    ),
    C(
        itemName = "C",
        iconPath = C_ICON,
        url = C_URL
    ),
    CSharp(
        itemName = "C#",
        iconPath = CSHARP_ICON,
        url = CSHARP_URL
    ),
    CPP(
        itemName = "C++",
        iconPath = CPP_ICON,
        url = CPP_URL
    ),
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
    DotNet(
        itemName = ".NET",
        iconPath = DOTNET_ICON,
        url = DOTNET_URL
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
    Java(
        itemName = "Java",
        iconPath = JAVA_ICON,
        url = JAVA_URL
    ),
    JavaScript(
        itemName = "JavaScript",
        iconPath = JAVASCRIPT_ICON,
        url = JAVASCRIPT_URL
    ),
    JQuery(
        itemName = "jQuery",
        iconPath = JQUERY_ICON,
        url = JQUERY_URL
    ),
    Json(
        itemName = "JSON",
        iconPath = JSON_ICON,
        url = JSON_URL
    ),
    Liquid(
        itemName = "Liquid template",
        iconPath = LIQUID_ICON,
        url = LIQUID_URL
    ),
    NextJs(
        itemName = "Next.js",
        iconPath = NEXT_JS_ICON,
        url = NEXT_JS_URL
    ),
    NodeJs(
        itemName = "Node.js",
        iconPath = NODEJS_ICON,
        url = NODEJS_URL
    ),
    PHP(
        itemName = "PHP",
        iconPath = PHP_ICON,
        url = PHP_URL
    ),
    PowerShell(
        itemName = "PowerShell",
        iconPath = POWERSHELL_ICON,
        url = POWERSHELL_URL
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
    SQL(
        itemName = "SQL",
        iconPath = SQL_ICON,
        url = SQL_URL
    ),
    Typescript(
        itemName = "TypeScript",
        iconPath = TYPESCRIPT_ICON,
        url = TYPESCRIPT_URL
    ),
    VBA(
        itemName = "VBA",
        iconPath = VBA_ICON,
        url = VBA_URL
    ),
    XML(
        itemName = "XML",
        iconPath = XML_ICON,
        url = XML_URL
    ),
    XSLT(
        itemName = "XSLT",
        iconPath = XSLT_ICON,
        url = XSLT_URL
    ),
    YAML(
        itemName = "YAML",
        iconPath = YAML_ICON,
        url = YAML_URL
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
    AzureCLI(
        itemName = "Azure CLI",
        iconPath = AZ_CLI_ICON,
        url = AZ_CLI_URL
    ),
    AzureDevOps(
        itemName = "Azure DevOps",
        iconPath = AZURE_DEVOPS_ICON,
        url = AZURE_DEVOPS_URL
    ),
    AzurePowershell(
        itemName = "Azure PowerShell",
        iconPath = AZURE_POWERSHELL_ICON,
        url = AZURE_POWERSHELL_URL
    ),
    BizTalk(
        itemName = "Microsoft BizTalk Server",
        iconPath = MSSQL_ICON,
        url = BIZTALK_URL
    ),
    Confluence(
        itemName = "Confluence",
        iconPath = CONFLUENCE_ICON,
        url = CONFLUENCE_URL
    ),
    CosmosDb(
        itemName = "Azure Cosmos DB",
        iconPath = COSMOSDB_ICON,
        url = COSMOSDB_URL
    ),
    Eclipse(
        itemName = "Eclipse",
        iconPath = ECLIPSE_ICON,
        url = ECLIPSE_URL
    ),
    FHIR(
        itemName = "FHIR",
        iconPath = FHIR_ICON,
        url = FHIR_URL
    ),
    Figma(
        itemName = "Figma",
        iconPath = FIGMA_ICON,
        url = FIGMA_URL
    ),
    Git(
        itemName = "git",
        iconPath = GIT_ICON,
        url = GIT_URL
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
    MariaDB(
        itemName = "MariaDB",
        iconPath = MARIADB_ICON,
        url = MARIADB_URL
    ),
    Matrix(
        itemName = "Matrix",
        iconPath = MATRIX_ICON,
        url = MATRIX_URL
    ),
    MSSQL(
        itemName = "Microsoft SQL Server",
        iconPath = MSSQL_ICON,
        url = MSSQL_URL
    ),
    MSSuite(
        itemName = "Microsoft 365 Suite",
        iconPath = MS_SUITE_ICON,
        url = MS_SUITE_URL
    ),
    NotepadPP(
        itemName = "Notepad++",
        iconPath = NOTEPAD_PP_ICON,
        url = NOTEPAD_PP_URL
    ),
    Notion(
        itemName = "Notion",
        iconPath = NOTION_ICON,
        url = NOTION_URL
    ),
    PhpStorm(
        itemName = "PhpStorm",
        iconPath = PHPSTORM_ICON,
        url = PHPSTORM_URL
    ),
    Vercel(
        itemName = "Vercel",
        iconPath = VERCEL_ICON,
        url = VERCEL_URL
    ),
    VisualStudio(
        itemName = "Microsoft Visual Studio",
        iconPath = VS_ICON,
        url = VS_URL
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