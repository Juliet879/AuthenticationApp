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
    lateinit var email:EditText
    lateinit var password:EditText
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
        email = findViewById(R.id.editEmail)
        password = findViewById(R.id.editPassword)
    }
    fun onClick() {

        tvcreateNew.setOnClickListener {

            var intent = Intent(baseContext, SignupActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            if (email.text.toString().isEmpty() || password.text.toString().isEmpty()) {
                email.setError("email  required")
                password.setError("password required")
            } else {
                var welcome = "Welcome back"
                Toast.makeText(baseContext, welcome, Toast.LENGTH_LONG).show()
                var intent = Intent(baseContext, DashboardActivity::class.java)
                startActivity(intent)

            }
        }


    }
}