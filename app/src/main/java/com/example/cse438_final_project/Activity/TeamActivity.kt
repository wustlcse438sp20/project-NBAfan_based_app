package com.example.cse438_final_project.Activity

import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.cse438_final_project.Adapter.ActivePlayerAdapter
import com.example.cse438_final_project.DataType.Player
import com.example.cse438_final_project.R
import com.example.cse438_final_project.ViewModel.PlayerViewModel
import kotlinx.android.synthetic.main.activity_activeplayerlist.*
import kotlinx.android.synthetic.main.activity_mainpage.*
import kotlinx.android.synthetic.main.activity_signup.*
import kotlinx.android.synthetic.main.activity_team.*
import kotlinx.android.synthetic.main.activity_team.recyclerView

class TeamActivity : AppCompatActivity(){

    lateinit var viewModel: PlayerViewModel

    var playerList :ArrayList<Player> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team)

    }

    override fun onStart() {
        super.onStart()

        var playeradapter = ActivePlayerAdapter(playerList)

        recyclerView.adapter = playeradapter

        recyclerView.layoutManager = GridLayoutManager(this, 2)

        viewModel = ViewModelProvider(this).get(PlayerViewModel::class.java)

        viewModel.getTeam("LAL")

        viewModel!!.team.observe(this, Observer {
            playerList.clear()
            playerList.addAll(it)
            playeradapter.notifyDataSetChanged()
        })

        go.setOnClickListener {
            if (teamName.text.toString().isEmpty()) {
                teamName.error = "Invalid Team Name"
                signupE.requestFocus()
            }else{
                viewModel.getTeam(teamName.text.toString())
            }
        }

        addplayer.setOnClickListener {
            startActivity(Intent(this, ActivePlayerActivity::class.java))
        }

        back.setOnClickListener {
            startActivity(Intent(this, MainPageActivity::class.java))

        }
    }


}
