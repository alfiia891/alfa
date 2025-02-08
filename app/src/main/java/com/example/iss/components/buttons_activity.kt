package com.example.iss.components

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.iss.R
import com.example.iss.databinding.ActivityButtonsBinding

class buttons_activity : AppCompatActivity() {

    private lateinit var binding: ActivityButtonsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButtonsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        clicks()
    }

private fun clicks() {
//  Видимость текста
    binding.visible.setOnCheckedChangeListener { _, isChecked ->
        binding.textView.visibility = if (isChecked) View.VISIBLE else View.GONE
    }

    binding.radioGroup.setOnCheckedChangeListener { _, checkedId ->
        when (checkedId) {
            binding.radioButton1.id -> binding.textView.text = "Какой-то текст"
            binding.radioButton2.id -> binding.textView.text = "Другой текст"
        }
    }
    binding.color.setOnCheckedChangeListener { _, isChecked ->
        binding.textView.setTextColor(
            if (isChecked) Color.rgb(255, 0, 0)
            else Color.rgb(0, 255, 0)
        )
    }
//    Смена жирности текста
    binding.bold.setOnCheckedChangeListener { _, isChecked ->
        binding.textView.typeface = if (isChecked) Typeface.DEFAULT_BOLD
        else Typeface.DEFAULT
    }
    // Добавление текста/ символы
    binding.floating.setOnClickListener {
        binding.textView.text = "${binding.textView.text} 123"
    }
}
}

