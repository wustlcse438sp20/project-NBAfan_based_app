package com.example.cse438_final_project.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.cse438_final_project.DataType.Player
import com.example.cse438_final_project.DataType.PlayerPayload
import com.example.cse438_final_project.Network.SportsioRepository

public class PlayerViewModel (application: Application):AndroidViewModel(application){
    public var activePlayerList : MutableLiveData<List<Player>> = MutableLiveData()
    public var requestPlayer : MutableLiveData<Player> = MutableLiveData()
    public var team : MutableLiveData<List<Player>> = MutableLiveData()


    public var sportsioRepository : SportsioRepository = SportsioRepository()

    fun getActivePlayer(){
        sportsioRepository.getActivePlayer(activePlayerList)
    }

    fun getPlayer(Id : String){
        sportsioRepository.getPlayer(requestPlayer,Id)
    }

    fun getTeam(id: String){
        sportsioRepository.getTeam(team,id)
    }



}