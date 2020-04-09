package com.example.cse438_final_project.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cse438_final_project.R
import kotlinx.android.synthetic.main.activity_mainpage.*
import kotlinx.android.synthetic.main.activity_team.*

class TeamActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team)

    }

    override fun onStart() {
        super.onStart()

        addplayer.setOnClickListener {
            startActivity(Intent(this, ActivePlayerActivity::class.java))
        }
    }


}
