package com.pat.portfolio.models

import kotlin.js.Date

enum class WorkExperience(
    val companyName: String,
    val shortDescription: String,
    val positions: List<Position>,
    val technologies: List<IconLinks>,
    val tools: List<IconLinks>
) {
    Famedly(
        companyName = "Famedly",
        shortDescription = "Famedly is building software using Matrix and FHIR to make communication and data exchange in the healthcare industry better.",
        positions = listOf(Position.FamedlyFrontend),
        technologies = listOf(
            IconLinks.Dart,
            IconLinks.Flutter
        ),
        tools = listOf(
            IconLinks.AndroidStudio,
            IconLinks.FHIR,
            IconLinks.Git,
            IconLinks.Github,
            IconLinks.Matrix,
            IconLinks.Notion,
            IconLinks.VsCode
        ),
    ),
    Quibiq(
        companyName = "QUIBIQ AG",
        shortDescription = "QUIBIQ is the leading Microsoft partner for integration solutions (EAI, EDI, PM and ESB) based on the Microsoft technologies BizTalk Server, Azure, API management, LogicApps and .Net.",
        positions = listOf(
            Position.QuibiqArchitect,
            Position.QuibiqLeadDev,
            Position.QuibiqSeniorDev,
            Position.QuibiqDev3,
            Position.QuibiqDev1
        ),
        technologies = listOf(
            IconLinks.DotNet,
            IconLinks.Angular,
            IconLinks.Bicep,
            IconLinks.CSharp,
            IconLinks.CSS,
            IconLinks.HTML,
            IconLinks.JavaScript,
            IconLinks.Json,
            IconLinks.Liquid,
            IconLinks.PowerShell,
            IconLinks.SQL,
            IconLinks.Typescript,
            IconLinks.XML,
            IconLinks.XSLT,
            IconLinks.YAML
        ),
        tools = listOf(
            IconLinks.AzureCLI,
            IconLinks.AzureDevOps,
            IconLinks.AzurePowershell,
            IconLinks.Confluence,
            IconLinks.Git,
            IconLinks.Github,
            IconLinks.Azure,
            IconLinks.BizTalk,
            IconLinks.MSSQL,
            IconLinks.MSSuite,
            IconLinks.VisualStudio,
            IconLinks.VsCode
        ),
    ),
    Andeo(
        companyName = "Andeo AG",
        shortDescription = "Andeo AG is a small IT company that has been developing applications, websites and mobile apps since 2006. It also offers IT infrastructure operation and training and further education.",
        positions = listOf(Position.AndeoIntern),
        technologies = listOf(
            IconLinks.CSS,
            IconLinks.HTML,
            IconLinks.JavaScript,
            IconLinks.JQuery,
            IconLinks.PHP,
            IconLinks.SQL
        ),
        tools = listOf(
            IconLinks.Git,
            IconLinks.MariaDB,
            IconLinks.PhpStorm
        ),
    )
}

enum class Position(
    val jobTitle: String,
    val dateFrom: Date,
    val dateTo: Date?,
    val showCompany: Boolean = true
) {
    FamedlyFrontend(
        jobTitle = "Frontend Developer",
        dateFrom = Date(year = 2024, month = 1, day = 1),
        dateTo = null
    ),
    QuibiqArchitect(
        jobTitle = "Solution Architect",
        dateFrom = Date(year = 2023, month = 11, day = 1),
        dateTo = Date(year = 2023, month = 12, day = 31),
    ),
    QuibiqLeadDev(
        jobTitle = "Lead Developer",
        dateFrom = Date(year = 2023, month = 1, day = 1),
        dateTo = Date(year = 2023, month = 10, day = 31),
        showCompany = false
    ),
    QuibiqSeniorDev(
        jobTitle = "Senior Developer",
        dateFrom = Date(year = 2022, month = 7, day = 1),
        dateTo = Date(year = 2022, month = 12, day = 31),
        showCompany = false
    ),
    QuibiqDev3(
        jobTitle = "Developer D3",
        dateFrom = Date(year = 2021, month = 7, day = 1),
        dateTo = Date(year = 2022, month = 6, day = 30),
        showCompany = false
    ),
    QuibiqDev1(
        jobTitle = "Developer D1",
        dateFrom = Date(year = 2020, month = 3, day = 1),
        dateTo = Date(year = 2021, month = 6, day = 30),
        showCompany = false
    ),
    AndeoIntern(
        jobTitle = "Intern Web Developer",
        dateFrom = Date(year = 2019, month = 8, day = 1),
        dateTo = Date(year = 2021, month = 2, day = 30),
    )
}