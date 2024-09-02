package com.pat.portfolio.dtos

import kotlinx.serialization.json.*

data class GithubReposDto(
    val languages: MutableList<GithubLanguageDto> = mutableListOf(),
    val ignoredLanguages: List<String> = listOf("C++", "CMake", "Swift", "Objective-C", "C", "Ruby")
) {
    fun addOrUpdateLanguage(res: String) {
        // parse to json
        val jsonRes = Json.parseToJsonElement(res)
        // get nodes
        val nodes = jsonRes.jsonObject["data"]?.jsonObject
            ?.get("user")?.jsonObject
            ?.get("repositories")?.jsonObject
            ?.get("nodes")?.jsonArray

        nodes?.forEach { node ->
            // get language nodes
            val languageNodes = node.jsonObject["languages"]?.jsonObject
                ?.get("nodes")?.jsonArray

            languageNodes?.forEach { languageObj ->
                val language = languageObj.jsonObject["name"]?.jsonPrimitive?.contentOrNull

                if (language != null && !ignoredLanguages.contains(language)) {
                    // check if language already in list
                    val existingLanguage = languages.firstOrNull { languageDto -> languageDto.language == language }
                    // if language in list, update count
                    if (existingLanguage != null) languages[languages.indexOf(existingLanguage)].count += 1
                    // else create new language
                    else languages.add(GithubLanguageDto(language = language, count = 1))
                }
            }
        }
    }

    fun sortLanguagesBySize() {
        languages.sortByDescending { it.count }
    }
}