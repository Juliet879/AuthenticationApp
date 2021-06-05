package com.example.week12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class SignupActivity : AppCompatActivity() {
    lateinit var name :EditText
    lateinit var email:EditText
    lateinit var phone:EditText
    lateinit var password:EditText
    lateinit var tvBackToLogin :TextView
    lateinit var btnStarted :Button
    lateinit var spGender :Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        castViews()
        clicked()
    }

    fun castViews(){
        name = findViewById(R.id.editName)
        phone = findViewById(R.id.editPhone)
        email = findViewById(R.id.editEmail)
        password = findViewById(R.id.editPassword)
        tvBackToLogin = findViewById(R.id.tvbackToLogin)
        btnStarted = findViewById(R.id.btnStart)
        spGender = findViewById(R.id.spnGender)

        var genders = arrayOf("Male","Female","Other")
        var genderAdapter = ArrayAdapter<String>(baseContext,android.R.layout.simple_dropdown_item_1line,genders)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spGender.adapter = genderAdapter

    }
    fun clicked(){

            var gender = spGender.selectedItem.toString()

        tvBackToLogin.setOnClickListener {
            var intent = Intent(baseContext,MainActivity::class.java)
                startActivity(intent)
        }
        btnStarted.setOnClickListener {
            if (name.text.toString().isEmpty() || email.text.toString().isEmpty() || password.text.toString().isEmpty() || phone.text.toString().isEmpty()) {
                name.setError("Name required")
                email.setError("Email required")
                password.setError("password required")
                phone.setError("password required")
            }
            else {
                var welcome = "Welcome ${name}"
                Toast.makeText(baseContext, welcome, Toast.LENGTH_LONG).show()
                var intent = Intent(baseContext, DashboardActivity::class.java)
                startActivity(intent)
            }
        }

    }
}