package com.example.cse438_final_project.Network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiClient{
    const val BASE_URL = "https://api.sportsdata.io/v3/nba/"

    fun makeRetrofitService(): SportsioInterface{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build().create(SportsioInterface::class.java)
    }

}