package com.example.cse438_final_project.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.cse438_final_project.Activity.NewsActivity
import com.example.cse438_final_project.Activity.PlayerInfo
import com.example.cse438_final_project.DataType.News
import com.example.cse438_final_project.DataType.Player
import com.example.cse438_final_project.R
import com.squareup.picasso.Picasso

class NewsViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.layout_news, parent,false)){
    private val time : TextView
    private val title : TextView





    init {
        time = itemView.findViewById(R.id.time)
        title = itemView.findViewById(R.id.title)

    }


    fun bind(news: News){
        title?.text = news.Title
        time?.text = news.TimeAgo
        title.setOnClickListener {
            val intent = Intent(title.context, NewsActivity::class.java)
            intent.putExtra("content", news.Content.toString())
            ContextCompat.startActivity(title.context, intent, null)
        }

    }

}

class NewsAdapter ( private val list : ArrayList<News>) : RecyclerView.Adapter<NewsViewHolder>(){
    private var listEvents : ArrayList<News>? = list


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return NewsViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news: News = listEvents!!.get(position)
        holder.bind(news)
    }

    override fun getItemCount(): Int = list!!.size




}