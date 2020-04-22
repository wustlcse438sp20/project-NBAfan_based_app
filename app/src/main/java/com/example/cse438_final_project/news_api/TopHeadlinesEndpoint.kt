package com.example.cse438_final_project.news_api

import com.example.cse438_final_project.model.TopHeadlines
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface TopHeadlinesEndpoint {

    @GET("everything")
    fun getTopHeadlines(
        @Query("q") q: String,
        @Query("apiKey") apiKey: String
    ): Observable<TopHeadlines>

    @GET("everything")
    fun getUserSearchInput(
        @Query("apiKey") apiKey: String,
        @Query("q") q: String
    ): Observable<TopHeadlines>
}