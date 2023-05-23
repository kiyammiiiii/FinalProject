package com.labactivity.pamanarecipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.pamanarecipeapp.databinding.ActivityMainMenuBinding

class MainMenu : AppCompatActivity() {

    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    private lateinit var binding: ActivityMainMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainMenuBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.infobtn.setOnClickListener(){
            val intent = Intent(this, aboutapp::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)
        }

        val recyclerView = binding.recyclerView

        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)


        foodList = ArrayList()

        foodList.add(Food(R.drawable.adobo , "Chicken Recipes"))
        foodList.add(Food(R.drawable.sinigang, "Pork Recipes"))
        foodList.add(Food(R.drawable.caldereta , "Beef Recipes"))
        foodList.add(Food(R.drawable.maja , "Dessert Recipes"))


        val destinationActivities = listOf(
            chickenMenu::class.java,
            porkMenu::class.java,
            beefMenu::class.java,
            dessertMenu::class.java
        )

        foodAdapter = FoodAdapter(foodList, destinationActivities)
        recyclerView.adapter = foodAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)


    }
}