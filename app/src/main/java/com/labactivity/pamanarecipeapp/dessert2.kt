package com.labactivity.pamanarecipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.pamanarecipeapp.databinding.ActivityDessert1Binding
import com.labactivity.pamanarecipeapp.databinding.ActivityDessert2Binding

class dessert2 : AppCompatActivity() {
    private lateinit var binding: ActivityDessert2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDessert2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener(){
            val intent = Intent(this, dessertMenu::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}