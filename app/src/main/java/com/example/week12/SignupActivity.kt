package com.example.week12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SignupActivity : AppCompatActivity() {
    lateinit var name :EditText
    lateinit var tvBackToLogin :TextView
    lateinit var getStarted :Button
    lateinit var spGender :Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }

    fun castViews(){
        name = findViewById(R.id.editName)
        tvBackToLogin = findViewById(R.id.tvbackToLogin)
        getStarted = findViewById(R.id.btnStart)
        spGender = findViewById(R.id.spnGender)

        var genders = arrayOf("Male","Female","Other")
        var genderAdapter = ArrayAdapter<String>(baseContext,android.R.layout.simple_dropdown_item_1line,genders)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spGender.adapter = genderAdapter

    }
    fun clicked(){
        spGender.setOnClickListener {
            var gender = spGender.selectedItem.toString()
        }
        tvBackToLogin.setOnClickListener {
            var intent = Intent(baseContext,MainActivity::class.java)
                startActivity(intent)
        }
        getStarted.setOnClickListener {
            var welcome = "Welcome ${name}"
            Toast.makeText(baseContext,welcome,Toast.LENGTH_LONG).show()
            var intent = Intent(baseContext,DashboardActivity::class.java)
                startActivity(intent)
        }

    }
}