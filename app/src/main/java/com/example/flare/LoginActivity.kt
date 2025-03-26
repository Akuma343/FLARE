package com.example.flare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login) // Ensure this matches your XML filename

        // Find login and sign-up buttons
        val loginButton: Button = findViewById(R.id.login_btn)
        val signUpButton: Button = findViewById(R.id.create_btn)

        // Handle Login Button Click
        loginButton.setOnClickListener {
            // Add login logic here
        }

        // Handle Sign-Up Button Click
        signUpButton.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java) // Navigate to SignUpActivity
            startActivity(intent)
        }
    }
}
