package com.example.demoapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class ScreenActiviy2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_activiy2)

        val listView: ListView = findViewById(R.id.listView)
        val listItems = arrayOf("Read a book" ,
            "Create a Project" ,
            "Learn Kotlin" ,
            "Go for shopping" ,
            "Attend a seminar")


        val listAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listItems)
        listView.adapter = listAdapter

   listView.setOnItemClickListener{parent, view, position, id ->
       val selectedItem = parent.getItemAtPosition(position) as String
       Toast.makeText(this,"You have clicked on: $selectedItem", Toast.LENGTH_SHORT).show()
   }
    }
}