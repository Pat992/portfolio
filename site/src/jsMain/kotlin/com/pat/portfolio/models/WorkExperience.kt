package com.pat.portfolio.models

import kotlin.js.Date

enum class WorkExperience(
    val companyName: String,
    val positions: List<Position>,
    val technologies: List<IconLinks>,
    val tools: List<IconLinks>
) {
    Famedly(
        companyName = "Famedly",
        positions = listOf(Position.FamedlyFrontend),
        technologies = listOf(
            IconLinks.Dart,
            IconLinks.Flutter
        ),
        tools = listOf(
            IconLinks.Matrix,
            IconLinks.FHIR,
            IconLinks.AndroidStudio,
            IconLinks.Git,
            IconLinks.Github,
            IconLinks.Notion,
            IconLinks.VsCode
        ),
    ),
    Quibiq(
        companyName = "QUIBIQ AG",
        positions = listOf(
            Position.QuibiqArchitect,
            Position.QuibiqLeadDev,
            Position.QuibiqSeniorDev,
            Position.QuibiqDev3,
            Position.QuibiqDev1
        ),
        technologies = listOf(
            IconLinks.Angular,
            IconLinks.Bicep,
            IconLinks.CSharp,
            IconLinks.CSS,
            IconLinks.DotNet,
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
    AndeoIntern(
        companyName = "Andeo AG",
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
            IconLinks.MariaDB,
            IconLinks.PhpStorm
        ),
    )
}

enum class Position(
    jobTitle: String,
    val dateFrom: Date,
    val dateTo: Date?,
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
    ),
    QuibiqSeniorDev(
        jobTitle = "Senior Developer",
        dateFrom = Date(year = 2022, month = 7, day = 1),
        dateTo = Date(year = 2022, month = 12, day = 31),
    ),
    QuibiqDev3(
        jobTitle = "Developer D3",
        dateFrom = Date(year = 2021, month = 7, day = 1),
        dateTo = Date(year = 2022, month = 6, day = 30),
    ),
    QuibiqDev1(
        jobTitle = "Developer D1",
        dateFrom = Date(year = 2020, month = 3, day = 1),
        dateTo = Date(year = 2021, month = 6, day = 30),
    ),
    AndeoIntern(
        jobTitle = "Intern Web Developer",
        dateFrom = Date(year = 2019, month = 8, day = 1),
        dateTo = Date(year = 2021, month = 2, day = 30),
    )
}