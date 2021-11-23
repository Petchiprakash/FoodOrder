package com.example.orders

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btOrder.setOnClickListener{
            val checkMeatIdButton = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkMeatIdButton)
            val cheese = cbCheese.isChecked
            val salad = cbSalad.isChecked
            val onions = cbOnions.isChecked
            val ordersString = "You Ordered a Burger with\n:" +
            "${meat.text}" +
                    (if (cheese) "\nCheese" else "")+
                    (if (salad) "\nSalad" else "")+
                    (if(onions) "\nOnions" else "")
            tvViewOrder.text=ordersString
            Toast.makeText(this,"THANK YOU! Your Order is Placed",Toast.LENGTH_SHORT).show()
        }
        btnFstNxt.setOnClickListener{
            Intent(this,SecondActivity::class.java).also {
                startActivity(it)
            }
        }

    }

}