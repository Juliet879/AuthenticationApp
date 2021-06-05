package com.example.week12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var tvcreateNew:TextView
    lateinit var login:Button
    lateinit var email:EditText
    lateinit var password:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castViews()
        onClick()
    }
    fun castViews(){
        tvcreateNew = findViewById(R.id.tvNewAcc)
        login = findViewById(R.id.btnLogin)
    }
    fun onClick(){
        tvcreateNew.setOnClickListener {
            var intent = Intent(baseContext,SignupActivity::class.java)
                startActivity(intent)
        }
        login.setOnClickListener {
            var intent = Intent(baseContext,DashboardActivity::class.java)
                startActivity(intent)
        }
    }
}