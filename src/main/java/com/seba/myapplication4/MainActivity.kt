package com.seba.myapplication4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val usernameEditText: EditText = findViewById(R.id.usernameEditText)
        val passwordEditText: EditText = findViewById(R.id.passwordEditText)
        val loginButton: Button = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val username = usernameEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            when {
                username.isEmpty() -> {
                    Toast.makeText(this, "Por favor, ingrese su nombre de usuario", Toast.LENGTH_SHORT).show()
                }
                password.isEmpty() -> {
                    Toast.makeText(this, "Por favor, ingrese su contraseña", Toast.LENGTH_SHORT).show()
                }
                username != "x" && password != "1" -> {
                    Toast.makeText(this, "Nombre de usuario y contraseña incorrectos", Toast.LENGTH_SHORT).show()
                }
                username != "x" -> {
                    Toast.makeText(this, "Nombre de usuario incorrecto", Toast.LENGTH_SHORT).show()
                }
                password != "1" -> {
                    Toast.makeText(this, "Contraseña incorrecta", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    // Navegar al MenuActivity
                    val intent = Intent(this, MenuActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}
