package com.hasan.jetfasthub.screens.main.gists.gist_model

data class GistModel(
    val comments: Int,
    val comments_url: String,
    val commits_url: String,
    val created_at: String,
    val description: String?,
    val files: Map<String, GistFile>,
    val forks: List<Any>,
    val forks_url: String,
    val git_pull_url: String,
    val git_push_url: String,
    val history: List<History>,
    val html_url: String,
    val id: String,
    val node_id: String,
    val owner: Owner,
    val `public`: Boolean,
    val truncated: Boolean,
    val updated_at: String,
    val url: String,
    val user: Any
)