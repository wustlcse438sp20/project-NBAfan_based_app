package com.example.cse438_final_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.firebase.ui.auth.AuthUI
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth = FirebaseAuth.getInstance()

        signup.setOnClickListener{
            startActivity(Intent(this,SignUp::class.java))
        }

        loginButton.setOnClickListener {
            login()
        }
    }

    override fun onStart() {
        super.onStart()
        val currentUser = auth.currentUser
    }

    private fun login(){
        if(loginE.text.toString().isEmpty()){
            loginE.error = "Please enter your email."
            loginE.requestFocus()
            return
        }
        if(loginP.text.toString().isEmpty()){
            loginP.error = "Please enter your password."
            loginP.requestFocus()
            return
        }
        auth.signInWithEmailAndPassword(loginE.text.toString(), loginP.text.toString())
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    // Sign in success, update UI with the signed-in user's information
                    val user = auth.currentUser
                    updateUI(user)
                } else {
                    // If sign in fails, display a message to the user.

                    updateUI(null)
                }

                // ...
            }

    }

    private fun updateUI(currentuser : FirebaseUser?){
        if(currentuser != null){
            startActivity(Intent(this,TeamActivity::class.java))
        }else{
            Toast.makeText(baseContext, "Authentication failed. Please try with different Email",
                Toast.LENGTH_SHORT).show()
        }
    }



}

