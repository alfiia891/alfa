package com.example.iss

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.iss.components.Edittextactivity
import com.example.iss.components.buttons_activity
import com.example.iss.databinding.ActivityButtonsBinding
import com.example.iss.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bntButtons.setOnClickListener {
            startActivity(
                Intent(applicationContext,
                buttons_activity::class.java)
            )
        }
        binding.bntEdittext.setOnClickListener {
            startActivity(
                Intent(
                    applicationContext,
                    Edittextactivity::class.java
                )
            )
        }
    }
}