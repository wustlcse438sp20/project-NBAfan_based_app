package com.example.cse438_final_project.Adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.cse438_final_project.Activity.PlayerInfo
import com.example.cse438_final_project.DataType.Player
import com.example.cse438_final_project.R
import com.squareup.picasso.Picasso

class PlayerViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.layout_player, parent,false)){
    private val playerPhoto : ImageView
    private val playerName : TextView
    private val playerSalary : TextView





    init {
        playerPhoto = itemView.findViewById(R.id.playerphoto)
        playerSalary = itemView.findViewById(R.id.playersalary)
        playerName = itemView.findViewById(R.id.playername)

    }


    fun bind(player: Player){
        playerName?.text = player.FirstName + " " + player.LastName
        Picasso.get().load(player.PhotoUrl).into(playerPhoto)
        playerPhoto.setOnClickListener {
            val intent = Intent(playerPhoto.context, PlayerInfo::class.java)

            intent.putExtra("id", player.PlayerID.toString())
            ContextCompat.startActivity(playerPhoto.context, intent, null)
        }

    }

}


class ActivePlayerAdapter ( private val list : ArrayList<Player>) : RecyclerView.Adapter<PlayerViewHolder>(){
    private var listEvents : ArrayList<Player>? = list


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return PlayerViewHolder(inflater, parent)
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val player: Player = listEvents!!.get(position)
        holder.bind(player)
    }

    override fun getItemCount(): Int = list!!.size




}