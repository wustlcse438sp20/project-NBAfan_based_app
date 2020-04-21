package com.example.cse438_final_project.ViewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.cse438_final_project.DataType.News
import com.example.cse438_final_project.DataType.Player
import com.example.cse438_final_project.Network.SportsioRepository

public class NewsViewModel (application: Application): AndroidViewModel(application){
    public var newsList : MutableLiveData<List<News>> = MutableLiveData()
    public var sportsioRepository : SportsioRepository = SportsioRepository()

    fun getNews(){
        sportsioRepository.getNews(newsList)
    }

}