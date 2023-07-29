package com.example.noobcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btnDivide
import kotlinx.android.synthetic.main.activity_main.btnMinus
import kotlinx.android.synthetic.main.activity_main.btnMultiply
import kotlinx.android.synthetic.main.activity_main.btnPlus
import kotlinx.android.synthetic.main.activity_main.num1
import kotlinx.android.synthetic.main.activity_main.num2
import kotlinx.android.synthetic.main.activity_main.tvAnswer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener {
            val input1 = num1.text.toString().toInt()
            val input2 = num2.text.toString().toInt()

            tvAnswer.text=(input1+input2).toString()
        }

        btnDivide.setOnClickListener {

            val input1=num1.text.toString().toInt()
            val input2= num2.text.toString().toInt()

            tvAnswer.text=(input1/input2).toString()
        }

        btnMinus.setOnClickListener {

            val input1=  num1.text.toString().toInt()
            val input2 = num2.text.toString().toInt()

            tvAnswer.text=(input1-input2).toString()
        }

        btnMultiply.setOnClickListener {

            val input1 = num1.text.toString().toInt()
            val input2= num2.text.toString().toInt()

            tvAnswer.text = (input1*input2).toString()
        }
    }
}