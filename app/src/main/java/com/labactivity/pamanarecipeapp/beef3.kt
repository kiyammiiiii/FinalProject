package com.labactivity.pamanarecipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.pamanarecipeapp.databinding.ActivityBeef3Binding

class beef3 : AppCompatActivity() {
    private lateinit var binding: ActivityBeef3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBeef3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener(){
            val intent = Intent(this, beefMenu::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}