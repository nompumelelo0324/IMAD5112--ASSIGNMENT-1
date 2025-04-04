package com.example.assignment1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// get the button , Text View and Edit Text using the id we set on the user face.

        val submitbtn =findViewById<Button>(R.id.submitbtn)
        val resetbtn =findViewById<Button>(R.id.resetbtn)
        val editText =findViewById<EditText>(R.id.editName)
        val textDisplay=findViewById<TextView>(R.id.displaysuggestion)

        //add code to the button that happen when it is clicked
        submitbtn?.setOnClickListener {
            Toast.makeText(this@MainActivity ,
                    "Mpumi's fast food" , Toast.LENGTH_SHORT
            ).show()
        }

        //type of meal suggestions that are based on time of day
        val meals :Map<String,String> = mapOf(
            "morning" to "white bread with yucked egg,sausages with a tomato sauce and tea to drink , noddles , or cornflakes" ,
            "mid morning" to "fruits",
            "afternoon" to "burgers" ,
            "mid-afternoon" to "pizza",
            "dinner" to "green salad with mixed veg,grilled meat and a cold drink"
        )

        submitbtn.setOnClickListener {
            val inputText =
                editText.text.toString().trim().lowercase()

            if (inputText in meals ) {
                textDisplay.text = "meal: ${meals[inputText]}"

            }else  {
                textDisplay.text =
                    "Error: kindly enter a correct time of day (Morning , Mid-morning , Afternoon , Mid-afternoon ,Dinner)."
                Toast.makeText(
                    this , "Mpumi's fast food" ,
                    Toast.LENGTH_SHORT
                ).show()

            }
        }
        resetbtn.setOnClickListener {
            editText.text.clear()
            textDisplay.text= ""
        }
            }
        }