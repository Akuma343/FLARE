package com.example.flare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup) // Make sure your XML filename is correct

        // Find the Sign Up button
        val signUpButton: Button = findViewById(R.id.signUpButton)

        // Navigate to LoginActivity when the button is clicked
        signUpButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
