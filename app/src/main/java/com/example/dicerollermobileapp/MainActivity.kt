package com.example.dicerollermobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener() {

            val dice1: ImageView = findViewById(R.id.imageView1)
            val dice2: ImageView = findViewById(R.id.imageView2)
            val winTextResult: TextView = findViewById(R.id.winText)
            val diceRoll1 = (1..6).random()
            val diceRoll2 = (1..6).random()

            when (diceRoll1) {
                1 -> dice1.setImageResource(R.drawable.dice_1)
                2 -> dice1.setImageResource(R.drawable.dice_2)
                3 -> dice1.setImageResource(R.drawable.dice_3)
                4 -> dice1.setImageResource(R.drawable.dice_4)
                5 -> dice1.setImageResource(R.drawable.dice_5)
                6 -> dice1.setImageResource(R.drawable.dice_6)
            }
            when (diceRoll2) {
                1 -> dice2.setImageResource(R.drawable.dice_1)
                2 -> dice2.setImageResource(R.drawable.dice_2)
                3 -> dice2.setImageResource(R.drawable.dice_3)
                4 -> dice2.setImageResource(R.drawable.dice_4)
                5 -> dice2.setImageResource(R.drawable.dice_5)
                6 -> dice2.setImageResource(R.drawable.dice_6)
            }

            if (diceRoll1 > diceRoll2)
                winTextResult.text = "Dice 1 Won The Game"
            else if (diceRoll2 > diceRoll1)
                winTextResult.text = "Dice 2 Won The Game"
            else {
                winTextResult.text = "Game is Draw"
            }

        }

    }
}



