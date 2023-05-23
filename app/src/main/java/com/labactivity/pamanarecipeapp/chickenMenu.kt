package com.labactivity.pamanarecipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.pamanarecipeapp.databinding.ActivityChickenMenuBinding

class chickenMenu : AppCompatActivity() {

    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    private lateinit var binding: ActivityChickenMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityChickenMenuBinding.inflate(layoutInflater)
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

        foodList.add(Food(R.drawable.adobo , "Chicken Adobo"))
        foodList.add(Food(R.drawable.pastel , "Chicken Pastel"))
        foodList.add(Food(R.drawable.afritada , "Chicken Afritada"))


        val destinationActivities = listOf(
            chicken1::class.java,
            chicken2::class.java,
            chicken3::class.java
        )

        foodAdapter = FoodAdapter(foodList, destinationActivities)
        recyclerView.adapter = foodAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)




    }
}