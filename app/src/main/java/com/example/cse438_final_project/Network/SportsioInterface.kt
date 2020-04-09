package com.example.cse438_final_project.Network

import com.example.cse438_final_project.DataType.Player
import com.example.cse438_final_project.DataType.PlayerPayload
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface SportsioInterface {
    @GET("scores/json/Players?key=7789b0590d18495ebd33cd4da2cf5fd6")
    suspend fun getActivePlayer(): Response<List<Player>>

}