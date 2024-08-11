package com.pat.portfolio.models

import kotlin.js.Date

enum class WorkExperience(
    val companyName: String,
    val dateFrom: Date,
    val dateTo: Date?,
    val jobTitle: String,
    val programmingLanguages: List<String>,
    val tools: List<String>
) {
    FamedlyFrontend(
        companyName = "Famedly",
        jobTitle = "Frontend Developer",
        programmingLanguages = listOf("Dart", "Flutter"),
        tools = listOf("Matrix", "FHIR", "Android Studio", "Git", "GitHub", "Notion", "Visual Studio Code"),
        dateFrom = Date(year = 2024, month = 1, day = 1),
        dateTo = null
    ),
    QuibiqArchitect(
        companyName = "QUIBIQ AG",
        jobTitle = "Solution Architect",
        programmingLanguages = quibiqLanguages,
        tools = quibiqTools,
        dateFrom = Date(year = 2023, month = 11, day = 1),
        dateTo = Date(year = 2023, month = 12, day = 31),
    ),
    QuibiqLeadDev(
        companyName = "QUIBIQ AG",
        jobTitle = "Lead Developer",
        programmingLanguages = quibiqLanguages,
        tools = quibiqTools,
        dateFrom = Date(year = 2023, month = 1, day = 1),
        dateTo = Date(year = 2023, month = 10, day = 31),
    ),
    QuibiqSeniorDev(
        companyName = "QUIBIQ AG",
        jobTitle = "Senior Developer",
        programmingLanguages = quibiqLanguages,
        tools = quibiqTools,
        dateFrom = Date(year = 2022, month = 7, day = 1),
        dateTo = Date(year = 2022, month = 12, day = 31),
    ),
    QuibiqDev3(
        companyName = "QUIBIQ AG",
        jobTitle = "Developer D3",
        programmingLanguages = quibiqLanguages,
        tools = quibiqTools,
        dateFrom = Date(year = 2021, month = 7, day = 1),
        dateTo = Date(year = 2022, month = 6, day = 30),
    ),
    QuibiqDev1(
        companyName = "QUIBIQ AG",
        jobTitle = "Developer D1",
        programmingLanguages = quibiqLanguages,
        tools = quibiqTools,
        dateFrom = Date(year = 2020, month = 3, day = 1),
        dateTo = Date(year = 2021, month = 6, day = 30),
    ),
    AndeoIntern(
        companyName = "Andeo AG",
        jobTitle = "Intern Web Developer",
        programmingLanguages = listOf("PHP", "JavaScript", "HTML", "CSS", "SCSS", "jQuery", "SQL"),
        tools = listOf("PHP Storm", "Maria DB"),
        dateFrom = Date(year = 2019, month = 8, day = 1),
        dateTo = Date(year = 2021, month = 2, day = 30),
    )
}

private val quibiqLanguages: List<String> = listOf(
    "Angular",
    "Bicep Templates",
    "C#",
    ".NET",
    "HTML",
    "JavaScript",
    "CSS",
    "JSON",
    "Liquid Templates",
    "PowerShell",
    "SQL",
    "TypeScript",
    "YAML",
    "XML",
    "XSLT"
)

private val quibiqTools: List<String> = listOf(
    "AZ CLI",
    "Azure PowerShell",
    "Confluence",
    "GitHub",
    "Git",
    "Microsoft 365 Suite",
    "Microsoft Azure DevOps",
    "Microsoft Azure",
    "Microsoft BizTalk Server",
    "Microsoft Visual Studio",
    "Visual Studio Code",
    "Microsoft SQL"
)