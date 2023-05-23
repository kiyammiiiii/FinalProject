package com.labactivity.pamanarecipeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.pamanarecipeapp.databinding.ActivityBeefMenuBinding
import com.labactivity.pamanarecipeapp.databinding.ActivityPorkMenuBinding

class beefMenu : AppCompatActivity() {

    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter

    private lateinit var binding: ActivityBeefMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityBeefMenuBinding.inflate(layoutInflater)
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

        foodList.add(Food(R.drawable.bulalo , "Beef Bulalo"))
        foodList.add(Food(R.drawable.tapa, "Beef Tapa"))
        foodList.add(Food(R.drawable.caldereta , "Beef Caldereta"))


        val destinationActivities = listOf(
            beef1::class.java,
            beef2::class.java,
            beef3::class.java
        )

        foodAdapter = FoodAdapter(foodList, destinationActivities)
        recyclerView.adapter = foodAdapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}
