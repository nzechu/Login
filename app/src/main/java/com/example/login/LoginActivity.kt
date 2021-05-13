package com.example.login


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText



class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val usernameInfo = findViewById<TextInputEditText>(R.id.username_ed)
        val passwordInfo = findViewById<TextInputEditText>(R.id.password_ed)
        val buttonInfo = findViewById<MaterialButton>(R.id.login_button)

        buttonInfo.setOnClickListener() {
            when {
                (usernameInfo.text.toString().isNullOrEmpty() || passwordInfo.text.toString()
                    .isNullOrEmpty()
                        ) ->
                    Toast.makeText(this, "Username and Password is required", Toast.LENGTH_LONG)
                        .show()
                (usernameInfo.text.toString() == "nzechu@gmail.com" && passwordInfo.text.toString() == "nigeria") -> {
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                else -> {
                    Toast.makeText(this, "Wrong Username or Password", Toast.LENGTH_LONG).show()
                }


            }
        }

    }
}

