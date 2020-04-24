package com.example.cse438_final_project.RankingsInterface

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cse438_final_project.Activity.MainPageActivity
import com.example.cse438_final_project.R
import com.example.cse438_final_project.StandingsE.Standings2019Activity
import kotlinx.android.synthetic.main.selecteastwest.*

class selectEastWest : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.selecteastwest)
        easternlogo.setOnClickListener(){
            startActivity(Intent(this,eastselector::class.java))
        }
        westernlogo.setOnClickListener(){
            startActivity(Intent(this,westselector::class.java))
        }
        backbt.setOnClickListener(){
            startActivity(Intent(this,MainPageActivity::class.java))
        }
    }
}
