package com.pat.portfolio.models

enum class Section(
    val id: String,
    val title: String,
    val subtitle: String,
    val path: String
) {
    Main(
        id = "home",
        title = "HOME",
        subtitle = "",
        path = "#home"
    ),
    Languages(
        id = "languages",
        title = "PROGRAMMING LANGUAGES",
        subtitle = "Most used languages in my public GitHub repositories.",
        path = "#languages"
    ),
    Projects(
        id = "projects",
        title = "PROJECTS",
        subtitle = "",
        path = "#projects"
    ),
    Work(
        id = "work",
        title = "WORK EXPERIENCE",
        subtitle = "",
        path = "#work"
    ),
    Education(
        id = "education",
        title = "EDUCATION",
        subtitle = "",
        path = "#education"
    ),
    Contact(
        id = "contact",
        title = "CONTACT",
        subtitle = "",
        path = "#contact"
    ),
    Footer(
        id = "footer",
        title = "FOOTER",
        subtitle = "",
        path = "#footer"
    )
}