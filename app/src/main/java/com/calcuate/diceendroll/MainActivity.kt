package com.calcuate.diceendroll

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var btnRoll: Button
    lateinit var btnReset: Button
    lateinit var diceOne: ImageView
    lateinit var diceTwo: ImageView
    lateinit var diceThree: ImageView
    lateinit var diceFour: ImageView
    lateinit var diceFive: ImageView
    lateinit var diceSix: ImageView
    lateinit var screenView: ImageView
    private lateinit var listDice: List<ImageView>
    private lateinit var listDice1: List<ImageView>

    lateinit var diceOne1: ImageView
    lateinit var diceTwo1: ImageView
    lateinit var diceThree1: ImageView
    lateinit var diceFour1: ImageView
    lateinit var diceFive1: ImageView
    lateinit var diceSix1: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRoll = findViewById(R.id.btn_roll)
        btnReset = findViewById(R.id.btn_reset)
        screenView = findViewById(R.id.screen)

        diceOne = findViewById(R.id.dice_one)
        diceTwo = findViewById(R.id.dice_two)
        diceThree = findViewById(R.id.dice_three)
        diceFour = findViewById(R.id.dice_four)
        diceFive = findViewById(R.id.dice_five)
        diceSix = findViewById(R.id.dice_six)


        diceOne1 = findViewById(R.id.dice1_one)
        diceTwo1 = findViewById(R.id.dice1_two)
        diceThree1 = findViewById(R.id.dice1_three)
        diceFour1 = findViewById(R.id.dice1_four)
        diceFive1 = findViewById(R.id.dice1_five)
        diceSix1 = findViewById(R.id.dice1_six)

        listDice = listOf(diceSix, diceOne, diceTwo, diceThree, diceFour, diceFive)
        listDice1 = listOf(diceSix1, diceOne1, diceTwo1,  diceThree1, diceFour1, diceFive1)

        btnRoll.setOnClickListener(this)
        btnReset.setOnClickListener(this)


    }

    override fun onClick(view: View) {

        val rolling = listDice.random()
        val rolling1 = listDice1.random()

        when (view.id) {
            btnRoll.id -> {
                screenView.visibility = ImageView.INVISIBLE
                rolling.visibility = ImageView.VISIBLE
                rolling1.visibility = ImageView.VISIBLE
                Toast.makeText(this,"Rolled",Toast.LENGTH_LONG).show()
                btnReset.visibility = ImageView.VISIBLE
            }
            btnReset.id -> {
                screenView.visibility = ImageView.VISIBLE
                rolling.visibility = ImageView.INVISIBLE
                rolling1.visibility = ImageView.INVISIBLE
                Toast.makeText(this,"Reset",Toast.LENGTH_LONG).show()
            }

        }

    }
}

