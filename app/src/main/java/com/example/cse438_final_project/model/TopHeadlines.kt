package com.example.cse438_final_project.model

data class TopHeadlines(
    val status: String,
    val totalResults: Int,
    val articles: List<Article>
)