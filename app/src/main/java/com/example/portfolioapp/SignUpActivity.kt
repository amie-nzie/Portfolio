package com.example.portfolioapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class SignUpActivity : AppCompatActivity() {
    companion object{
        const val EMAIL="email"
        const val USERNAME="username"
        const val PASSWORD="password"
        const val USERDETAILS="userDetails"
        const val PREF_NAME=" com.example.portfolioapp.SharePreference"
    }

    lateinit var usernameTv: TextView
    lateinit var emailTv: TextView
    lateinit var passwordTv: TextView
    lateinit var signupbtn: Button
    lateinit var loginText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        usernameTv=findViewById(R.id.signUpUsername)
        emailTv=findViewById(R.id.signUpEmail)
        passwordTv=findViewById(R.id.signUpPassword)
        signupbtn=findViewById(R.id.signUpButton)
        loginText=findViewById(R.id.loginText)

        loginText.setOnClickListener {
            var sugar= Intent(this, LoginActivity::class.java)
            startActivity(sugar)        }

        signupbtn.setOnClickListener {
            signUpFun()

        }
    }

    private fun signUpFun() {
        var userName:String=usernameTv.text.toString()
        var email:String=emailTv.text.toString()
        var password:String=passwordTv.text.toString()

        val pref:SharedPreferences=getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
        val editor:SharedPreferences.Editor=pref.edit()
        editor.putString(USERNAME,userName)
        editor.putString(EMAIL,email)
        editor.putString(PASSWORD,password)
        editor.putString(USERDETAILS,email)
        editor.apply()
        var milk= Intent(this, LoginActivity::class.java)
        startActivity(milk)
        finish()
        Toast.makeText(this,"Congratulations",Toast.LENGTH_SHORT).show()
}}
