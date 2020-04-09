package com.example.cse438_final_project.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cse438_final_project.R
import kotlinx.android.synthetic.main.activity_mainpage.*

class MainPageActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)

    }

    override fun onStart() {
        super.onStart()

        myteambutton.setOnClickListener {
            startActivity(Intent(this,TeamActivity::class.java));
        }

        myleague.setOnClickListener {
            startActivity(Intent(this, LeagueActivity::class.java))
        }
    }
}