package com.labactivity.pamanarecipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.labactivity.pamanarecipeapp.databinding.ActivityChicken1Binding
import com.labactivity.pamanarecipeapp.databinding.ActivityPork1Binding

class pork1 : AppCompatActivity() {
    private lateinit var binding: ActivityPork1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPork1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener(){
            val intent = Intent(this, porkMenu::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }
    }
}