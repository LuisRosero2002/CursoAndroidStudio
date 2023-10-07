package com.example.myapplication.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.widget.AppCompatEditText
import com.example.myapplication.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)

        val btnSaludar = findViewById<Button>(R.id.btnSaludar)
        val etName = findViewById<AppCompatEditText>(R.id.etName)

        btnSaludar.setOnClickListener{
            val name = etName.text.toString()
            if (name.isNotEmpty()){
                Log.i("first","se dio Click...$name")
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("extra_name", name)
                startActivity(intent)
            }
        }



    }
}