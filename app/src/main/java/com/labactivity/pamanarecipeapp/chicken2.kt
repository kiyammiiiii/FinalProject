package com.labactivity.pamanarecipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.pamanarecipeapp.databinding.ActivityChicken2Binding

class chicken2 : AppCompatActivity() {
    private lateinit var binding: ActivityChicken2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChicken2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener(){
            val intent = Intent(this, chickenMenu::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}