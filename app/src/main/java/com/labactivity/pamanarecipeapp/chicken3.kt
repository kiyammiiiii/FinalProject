package com.labactivity.pamanarecipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.pamanarecipeapp.databinding.ActivityChicken3Binding

class chicken3 : AppCompatActivity() {
    private lateinit var binding: ActivityChicken3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChicken3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener(){
            val intent = Intent(this, chickenMenu::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}