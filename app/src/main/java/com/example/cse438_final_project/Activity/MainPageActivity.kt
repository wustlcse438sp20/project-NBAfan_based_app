package com.example.cse438_final_project.Activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cse438_final_project.Activity.Login.MainActivity
import com.example.cse438_final_project.Adapter.NewsAdapter
import com.example.cse438_final_project.DataType.News
import com.example.cse438_final_project.R
import com.example.cse438_final_project.RankingsInterface.selectEastWest
import com.example.cse438_final_project.ViewModel.NewsViewModel
import com.example.cse438_final_project.ui.MainActivityNews
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_mainpage.*
import kotlinx.android.synthetic.main.activity_mainpage.myleague
import kotlinx.android.synthetic.main.activity_mainpage.myteambutton

class MainPageActivity : AppCompatActivity(){

    lateinit var viewModel: NewsViewModel

    var newslist :ArrayList<News> = ArrayList()

    private lateinit var auth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainpage)

        auth = FirebaseAuth.getInstance()


    }

    override fun onStart() {
        super.onStart()


        var newsadapter = NewsAdapter(newslist)

        newsRecyclerView.adapter = newsadapter

        newsRecyclerView.layoutManager = LinearLayoutManager(this)

        viewModel = ViewModelProvider(this).get(NewsViewModel::class.java)

        viewModel.getNews();

        viewModel!!.newsList.observe(this, Observer {
            newslist.clear()
            newslist.addAll(it)
            newsadapter.notifyDataSetChanged()
        })


        myteambutton.setOnClickListener {
            startActivity(Intent(this,TeamActivity::class.java));
        }

        myleague.setOnClickListener {
            startActivity(Intent(this, selectEastWest::class.java))
        }

        morenews.setOnClickListener(){
            startActivity(Intent(this, MainActivityNews::class.java))
        }
        signout.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this, MainActivity::class.java))
        }

    }
}