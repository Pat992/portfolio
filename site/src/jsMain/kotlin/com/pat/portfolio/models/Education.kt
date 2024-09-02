package com.pat.portfolio.models

import kotlin.js.Date

enum class Education(
    val school: String,
    val dateFrom: Date,
    val dateTo: Date?,
    val educationTitle: String,
    val technologies: List<IconLinks>,
    val tools: List<IconLinks>
) {
    ilsAndroid(
        school = "ILS - Institute for Learning Systems",
        educationTitle = "Android developer",
        dateFrom = Date(year = 2023, month = 5),
        dateTo = null,
        technologies = listOf(
            IconLinks.Java,
            IconLinks.Kotlin,
            IconLinks.XML
        ),
        tools = listOf(
            IconLinks.AndroidStudio,
            IconLinks.IntelliJ
        )
    ),
    efz(
        school = "ZLI - Zurich",
        educationTitle = "Computer science EFZ / Swiss federal certificate of competence",
        dateFrom = Date(year = 2019, month = 7),
        dateTo = Date(year = 2021, month = 7),
        technologies = listOf(
            IconLinks.C,
            IconLinks.CSS,
            IconLinks.Flutter,
            IconLinks.HTML,
            IconLinks.Java,
            IconLinks.JavaScript,
            IconLinks.PHP,
            IconLinks.React,
            IconLinks.SQL,
            IconLinks.VBA
        ),
        tools = listOf(
            IconLinks.AndroidStudio,
            IconLinks.Eclipse,
            IconLinks.VisualStudio,
            IconLinks.NotepadPP,
            IconLinks.VsCode
        )
    ),
    haf(
        school = "Hamburg Academy for distance learning",
        educationTitle = "Computer science HAF",
        dateFrom = Date(year = 2017, month = 6),
        dateTo = Date(year = 2020, month = 5),
        technologies = listOf(
            IconLinks.CPP,
            IconLinks.CSharp,
            IconLinks.CSS,
            IconLinks.HTML,
            IconLinks.PHP,
            IconLinks.SQL
        ),
        tools = listOf(
            IconLinks.NotepadPP,
            IconLinks.VisualStudio
        )
    )
}