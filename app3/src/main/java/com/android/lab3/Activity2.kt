package com.android.lab3

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.fragment_blank.*
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_2.*


class Activity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val intent = intent

       // intent.getParcelableArrayExtra("ExampleItem")


        val exampleItem = intent.getParcelableExtra<NewsModel>("ExampleItem")

        val line1 = exampleItem.title
        val line3 = exampleItem.text

        val textView1 = findViewById<TextView>(R.id.title_activity2)
        textView1.text = line1

        val textView3 = findViewById<TextView>(R.id.text_activity2)
        textView3.text = line3

        /*when(line4){
            "footbal" -> image2.setImageResource(R.drawable.footbal)
            "wifi" -> image2.setImageResource(R.drawable.wifi)
            "amazon" -> image2.setImageResource(R.drawable.news1)
            "uber" -> image2.setImageResource(R.drawable.uber)
        }*/

        image_button.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)

        }


        /* val intent = intent
         val exampleItem = intent.getParcelableExtra<NewsModel>("Example Item")

         val line1 = exampleItem.title
         val line2 = exampleItem.date


         val textView1 = findViewById<TextView>(R.id.title_activity2)
         textView1.text = line1

         val textView2 = findViewById<TextView>(R.id.date_activity2)
         textView1.text = line2*/

    }






























}
