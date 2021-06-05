package com.example.week12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var tvcreateNew:TextView
    lateinit var btnLogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        onClick()
    }
    fun castViews(){
        tvcreateNew = findViewById(R.id.tvNewAcc)
        btnLogin = findViewById(R.id.btnLogin)
    }
    fun onClick(){
        tvcreateNew.setOnClickListener {
            var intent = Intent(baseContext,SignupActivity::class.java)
                startActivity(intent)
        }
        btnLogin.setOnClickListener {
            var welcome = "Welcome back"
            Toast.makeText(baseContext,welcome,Toast.LENGTH_LONG).show()
            var intent = Intent(baseContext,DashboardActivity::class.java)
                startActivity(intent)
        }
    }
}