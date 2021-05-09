package com.example.login

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.View
import android.widget.Toast
import android.widget.Toast.*
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val usernameInfo = findViewById<TextInputEditText>(R.id.username_ed)
        val passwordInfo = findViewById<TextInputEditText>(R.id.password_ed)
        val buttonInfo = findViewById<MaterialButton>(R.id.login_button)

        buttonInfo.setOnClickListener() {
            when {
                (usernameInfo.toString().isNullOrEmpty() || passwordInfo.toString()
                        .isNullOrEmpty()
                        ) ->
                    Toast.makeText(this, "Username and Password is required", Toast.LENGTH_LONG).show()
                (usernameInfo.toString() == "nzechu@gmail.com" && passwordInfo.toString() == "nigeria") -> {
                    val intent = Intent(this, ViewActivity::class.java)
                    startActivity(intent)
                }
                else -> {
                    Toast.makeText(this, "Wrong Username or Password", Toast.LENGTH_LONG).show()
                }


            }
        }

    }


    fun MaterialButton.setOnClickListener() {
        TODO("Not yet implemented")
    }

    fun Activity.toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }
}
