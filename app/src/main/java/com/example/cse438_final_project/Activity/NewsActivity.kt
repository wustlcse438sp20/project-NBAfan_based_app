package com.example.cse438_final_project.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.cse438_final_project.R
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity(){

    public var title: String = "";
    public var content: String = ""




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

    }

    override fun onStart() {
        super.onStart()

        var bundle1 :Bundle ?=intent.extras
        if(bundle1 != null){
            title= bundle1!!.getString("title")
            content= bundle1!!.getString("content")

        }

        titleView.text = title;
        contentView.text = content;



        Back.setOnClickListener {
            startActivity(Intent(this,MainPageActivity::class.java));
        }

    }




}