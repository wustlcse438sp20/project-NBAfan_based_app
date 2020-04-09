package com.example.cse438_final_project.Activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cse438_final_project.Adapter.ActivePlayerAdapter
import com.example.cse438_final_project.DataType.Player
import com.example.cse438_final_project.R
import com.example.cse438_final_project.ViewModel.PlayerViewModel
import kotlinx.android.synthetic.main.activity_activeplayerlist.*

class ActivePlayerActivity : AppCompatActivity(){

    lateinit var viewModel: PlayerViewModel

    var playerList :ArrayList<Player> = ArrayList()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activeplayerlist)
    }

    override fun onStart() {
        super.onStart()

        var playeradapter = ActivePlayerAdapter(playerList)

        recyclerView.adapter = playeradapter

        recyclerView.layoutManager = GridLayoutManager(this, 2)

        viewModel = ViewModelProvider(this).get(PlayerViewModel::class.java)

        viewModel.getActivePlayer();

        viewModel!!.activePlayerList.observe(this, Observer {
            playerList.clear()
            playerList.addAll(it)
            playeradapter.notifyDataSetChanged()
        })


    }
}