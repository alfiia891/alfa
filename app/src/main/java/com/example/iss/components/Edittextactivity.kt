package com.example.iss.components

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.iss.R
import com.example.iss.databinding.ActivityButtonsBinding
import com.example.iss.databinding.ActivityEdittextactivityBinding

class Edittextactivity : AppCompatActivity() {

    private lateinit var binding: ActivityEdittextactivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityEdittextactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            println("кнопка 'Войти' нажата")
                    if (binding.loginTIET.text!!.isEmpty()){
                        Toast.makeText(
                            context this,
                            text: "Поля ввода Логин пустое!",
                            Toast.LENGTH_SHORT
                        ).show()
                    }else if (binding.passwordTIET.text!!.isEmpty(){
                        Toast.makeText(
                            context this,
                            text
                        )
                    }
        }
    }
}