package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvMyTextView = findViewById<TextView>(R.id.textView2);
        var timesClicked = 0;
        val btnClickMe = findViewById<Button>(R.id.myButton);
        btnClickMe.setOnClickListener{
            timesClicked += 1;
            tvMyTextView.text = timesClicked.toString();
        };
    }
}