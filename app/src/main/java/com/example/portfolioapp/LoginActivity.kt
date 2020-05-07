package com.example.portfolioapp

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    lateinit var emailEdt:EditText
    lateinit var passwordEdt:EditText
    lateinit var loginBtn:Button
    lateinit var signUpTxt:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        emailEdt=findViewById(R.id.loginEmail)
        passwordEdt=findViewById(R.id.loginPassword)
        loginBtn=findViewById(R.id.loginButton)
        signUpTxt=findViewById(R.id.signUpText)

        signUpTxt.setOnClickListener {
            var tea=Intent(this,SignUpActivity::class.java)
            startActivity(tea)



    }
    loginBtn.setOnClickListener {
        loginFun()
    }

}

    private fun loginFun() {

        var email:String=emailEdt.text.toString()
        var password:String=passwordEdt.text.toString()
        var pref:SharedPreferences=getSharedPreferences(SignUpActivity.PREF_NAME, Context.MODE_PRIVATE)
        var getEmail: String? =pref.getString(SignUpActivity.EMAIL,null)
        var getPassword:String?=pref.getString(SignUpActivity.PASSWORD,null)


        var editor:SharedPreferences.Editor=pref.edit()
        editor.putString("usermail",getEmail)
        editor.apply()
        var tea=Intent(this,SignUpActivity::class.java)
        startActivity(tea)
        finish()
        Toast.makeText(this,"Welcome",Toast.LENGTH_SHORT).show()
    }
}
