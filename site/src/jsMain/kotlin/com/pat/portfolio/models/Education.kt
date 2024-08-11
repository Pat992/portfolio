package com.pat.portfolio.models

import kotlin.js.Date

enum class Education(
    val school: String,
    val dateFrom: Date,
    val dateTo: Date?,
    val educationTitle: String,
    val programmingLanguages: List<String>,
    val tools: List<String>
) {
    ilsAndroid(
        school = "ILS - Institute for Learning Systems",
        educationTitle = "Android developer",
        dateFrom = Date(year = 2023, month = 6, day = 1),
        dateTo = null,
        programmingLanguages = listOf("Kotlin", "Java", "XML"),
        tools = listOf("Android Studio")
    ),
    efz(
        school = "ZLI - Zurich",
        educationTitle = "Computer science EFZ / Swiss federal certificate of competence",
        dateFrom = Date(year = 2019, month = 8, day = 1),
        dateTo = Date(year = 2021, month = 8, day = 1),
        programmingLanguages = listOf(
            "Java",
            "PHP",
            "HTML",
            "JavaScript",
            "React",
            "Flutter",
            "VBA",
            "C",
            "CSS",
            "SQL"
        ),
        tools = listOf(
            "Android Studio",
            "Eclipse",
            "Notepad++",
            "Visual Studio Code",
            "VMWare",
            "Microsoft Visual Studio"
        )
    ),
    haf(
        school = "Hamburg Academy for distance learning",
        educationTitle = "Computer science HAF",
        dateFrom = Date(year = 2017, month = 7, day = 12),
        dateTo = Date(year = 2020, month = 6, day = 6),
        programmingLanguages = listOf("C++", "C#", "PHP", "SQL", "CSS", "HTML"),
        tools = listOf("VMWare", "Code::Blocks", "Microsoft Visual Studio")
    )
}