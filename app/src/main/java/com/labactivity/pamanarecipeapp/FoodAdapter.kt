package com.labactivity.pamanarecipeapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.labactivity.pamanarecipeapp.databinding.FoodListBinding

class FoodAdapter(
    private val foodList: List<Food>,
    private val destinationActivities: List<Class<out AppCompatActivity>>
) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    inner class FoodViewHolder(private val binding: FoodListBinding) :
        RecyclerView.ViewHolder(binding.root) {

        private var position: Int = 0

        init {
            binding.root.setOnClickListener {
                val clickedPosition = this.position
                if (clickedPosition != RecyclerView.NO_POSITION) {
                    val context = itemView.context
                    val destinationActivity = destinationActivities[clickedPosition]
                    val intent = Intent(context, destinationActivity)
                    context.startActivity(intent)
                }
            }
        }

        fun bind(chicken: Food, position: Int) {
            this.position = position
            with(binding) {
                imageView.setImageResource(chicken.image)
                textView.text = chicken.name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val binding = FoodListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FoodViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val chicken = foodList[position]
        holder.bind(chicken, position)
    }
}
