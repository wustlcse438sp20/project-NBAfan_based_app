package com.example.cse438_final_project.RankingsInterface

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cse438_final_project.R
import com.example.cse438_final_project.StandingsE.*
import kotlinx.android.synthetic.main.eastselector.*

class eastselector:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.eastselector)
        e2010.setOnClickListener(){
            startActivity(Intent(this,Standings2010Activity::class.java))
        }
        e2011.setOnClickListener(){
            startActivity(Intent(this,Standings2011Activity::class.java))
        }
        e2012.setOnClickListener(){
            startActivity(Intent(this,Standings2012Activity::class.java))
        }
        e2013.setOnClickListener(){
            startActivity(Intent(this,Standings2013Activity::class.java))
        }
        e2014.setOnClickListener(){
            startActivity(Intent(this,Standings2014Activity::class.java))
        }
        e2015.setOnClickListener(){
            startActivity(Intent(this,Standings2015Activity::class.java))
        }
        e2016.setOnClickListener(){
            startActivity(Intent(this,Standings2016Activity::class.java))
        }
        e2017.setOnClickListener(){
            startActivity(Intent(this,Standings2017Activity::class.java))
        }
        e2018.setOnClickListener(){
            startActivity(Intent(this,Standings2018Activity::class.java))
        }
        e2019.setOnClickListener(){
            startActivity(Intent(this,Standings2019Activity::class.java))
        }

        backbt.setOnClickListener(){
            startActivity(Intent(this,selectEastWest::class.java))
        }
    }
}