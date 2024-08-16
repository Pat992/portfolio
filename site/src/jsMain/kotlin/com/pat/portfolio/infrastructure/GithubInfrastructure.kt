package com.pat.portfolio.infrastructure

import com.pat.portfolio.core.constants.ApiKeys.GITHUB_PUBLIC_REPO_TOKEN
import com.pat.portfolio.core.constants.ExternalUrls.GITHUB_GRAPHQL_URL
import com.pat.portfolio.dtos.GithubReposDto
import com.varabyte.kobweb.browser.http.http
import kotlinx.browser.window
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

val query =
    mapOf("query" to "{ user(login: \"Pat992\") { repositories(first: 100) { nodes { name languages(first: 10) { nodes { name } } } } } }")

suspend fun githubInfrastructureGetLanguages(): GithubReposDto? {
    try {
        val headers: Map<String, Any> = mapOf("Authorization" to "Bearer $GITHUB_PUBLIC_REPO_TOKEN")
        val res = window.http.tryPost(
            resource = GITHUB_GRAPHQL_URL,
            headers = headers,
            body = Json.encodeToString(query).encodeToByteArray()
        )?.decodeToString() ?: return null

        val githubReposDto = GithubReposDto()
        githubReposDto.addOrUpdateLanguage(res)

        return githubReposDto
    } catch (e: Exception) {
        return null
    }
}