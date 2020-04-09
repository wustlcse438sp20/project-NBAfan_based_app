package com.example.cse438_final_project.Network

import androidx.lifecycle.MutableLiveData
import com.example.cse438_final_project.DataType.Player
import com.example.cse438_final_project.DataType.PlayerPayload
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.HttpException

class SportsioRepository {
    val service = ApiClient.makeRetrofitService()

    fun getActivePlayer(resBody: MutableLiveData<List<Player>>){
        CoroutineScope(Dispatchers.IO).launch {
            val response = service.getActivePlayer()
            withContext(Dispatchers.Main) {
                try{
                    if(response.isSuccessful) {
                        resBody.value = response.body()
                    }
                } catch (e: HttpException) {
                    println("Http error")
                }
            }
        }
    }

}