package com.example.cse438_final_project.DataType

data class Player(
    val PlayerID: Int,
    val Team : String,
    val Jersy : Int,
    val Position: String,
    val FirstName : String,
    val LastName : String,
    val PhotoUrl : String
    //val Salary : Int

)

data class PlayerPayload(
    val playList : List<Player>
)