package com.labactivity.pamanarecipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.pamanarecipeapp.databinding.ActivityPorkMenuBinding

class porkMenu : AppCompatActivity() {
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    private lateinit var binding: ActivityPorkMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityPorkMenuBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backbtn.setOnClickListener(){
            val intent = Intent(this, MainMenu::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        val recyclerView = binding.recyclerView

        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        foodList = ArrayList()

        foodList.add(Food(R.drawable.sinigang , "Pork Sinigang"))
        foodList.add(Food(R.drawable.sisig, "Pork Sisig"))
        foodList.add(Food(R.drawable.menudo , "Pork Menudo"))


        val destinationActivities = listOf(
            pork1::class.java,
            pork2::class.java,
            pork3::class.java
        )

        foodAdapter = FoodAdapter(foodList, destinationActivities)
        recyclerView.adapter = foodAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}