package com.example.cse438_final_project.Activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.cse438_final_project.DataType.Player
import com.example.cse438_final_project.DataType.User
import com.example.cse438_final_project.R
import com.example.cse438_final_project.ViewModel.PlayerViewModel
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreSettings
import com.google.firebase.firestore.QuerySnapshot
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_playerinfo.*

class PlayerInfo : AppCompatActivity(){

    private lateinit var auth: FirebaseAuth

    lateinit var db : FirebaseFirestore

    lateinit var viewModel: PlayerViewModel

    lateinit var curPlayer : Player

    var documentId = ""

    var currentUser = User("","", listOf());


    var myid : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playerinfo)
        viewModel = ViewModelProvider(this).get(PlayerViewModel::class.java)

        auth = FirebaseAuth.getInstance()

        db = FirebaseFirestore.getInstance()
        val settings = FirebaseFirestoreSettings.Builder()
            .setTimestampsInSnapshotsEnabled(true)
            .build()
        db.setFirestoreSettings(settings)

        var bundle :Bundle ?=intent.extras
        if(bundle != null){
            myid = bundle!!.getString("id","3135556")
        }

        viewModel.getPlayer(myid);

        viewModel!!.requestPlayer.observe(this, Observer {

            curPlayer = it
            name?.text = it.FirstName + " " + it.LastName
            Picasso.get().load(it.PhotoUrl).into(playerphoto)
            team?.text = "Team: " + it.Team
            position?.text = "Position: "+it.Position
            number?.text ="Number: " +it.Jersy.toString()



        })
    }
    override fun onStart() {
        super.onStart()

        Back.setOnClickListener {
            var intent = Intent(this,TeamActivity::class.java)
            startActivity(intent)
        }

        Add.setOnClickListener {
            Toast.makeText(this, "Function not completed yet :)", Toast.LENGTH_LONG)
//            db.collection("userTest")
//                .get()
//                .addOnCompleteListener(OnCompleteListener<QuerySnapshot> { task ->
//
//                    if (task.isSuccessful) {
//                        for (document in task.result!!) {
////                        System.out.println("--------------------------------"+document.get("userEmail").toString())
//                            //                       System.out.println("-------------------------------------------"+auth.currentUser!!.email.toString())
//
//                            if(document.get("userEmail").toString() == auth.currentUser!!.email.toString()){
//                                documentId = document.id
//                                currentUser.userName = document.get("userName").toString()
//                                currentUser.userEmail = document.get("userEmail").toString()
//
//                            }
//                        }
//
//                    } else {
//                        println("failed to get data")
//                    }
//                })
//            db.collection("userTest").document(documentId)
//                .set(hashMapOf(
//                    "userEmail" to currentUser.userEmail,
//                    "userName" to currentUser.userName,
//                    "player" to curPlayer
//
//                ))

        }









    }
}