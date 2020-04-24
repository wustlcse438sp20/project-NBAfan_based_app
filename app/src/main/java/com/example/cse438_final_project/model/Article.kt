package com.example.cse438_final_project.model

////credit to fahrican on RxJavaNewsAPI
data class Article(
    val source: Source,
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String
)