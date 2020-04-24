package com.example.cse438_final_project.RankingsInterface

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cse438_final_project.R
import com.example.cse438_final_project.StandingsE.*
import com.example.cse438_final_project.StandingsW.*
import kotlinx.android.synthetic.main.eastselector.*

class westselector:AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.westselector)
        e2010.setOnClickListener(){
            startActivity(Intent(this, wst2010::class.java))
        }
        e2011.setOnClickListener(){
            startActivity(Intent(this, wst2011::class.java))
        }
        e2012.setOnClickListener(){
            startActivity(Intent(this, wst2012::class.java))
        }
        e2013.setOnClickListener(){
            startActivity(Intent(this, wst2013::class.java))
        }
        e2014.setOnClickListener(){
            startActivity(Intent(this, wst2014::class.java))
        }
        e2015.setOnClickListener(){
            startActivity(Intent(this, wst2015::class.java))
        }
        e2016.setOnClickListener(){
            startActivity(Intent(this, wst2016::class.java))
        }
        e2017.setOnClickListener(){
            startActivity(Intent(this, wst2017::class.java))
        }
        e2018.setOnClickListener(){
            startActivity(Intent(this, wst2018::class.java))
        }
        e2019.setOnClickListener(){
            startActivity(Intent(this, wst2019::class.java))
        }

        backbt.setOnClickListener(){
            startActivity(Intent(this,selectEastWest::class.java))
        }
    }
}
