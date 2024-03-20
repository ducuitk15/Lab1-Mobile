package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var showTimeButton: Button
    private lateinit var timeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showTimeButton = findViewById(R.id.showTimeButton)
        timeTextView = findViewById(R.id.timeTextView)

        showTimeButton.setOnClickListener {
            // Khi nhấn vào Button, hiển thị thời gian
            displayCurrentTime()
        }
    }

    private fun displayCurrentTime() {
        val sdf = SimpleDateFormat("MMM dd, yyyy h:mm:ss a", Locale.getDefault())
        val currentTime = sdf.format(Date())
        timeTextView.text = currentTime
        timeTextView.visibility = View.VISIBLE // Hiển thị TextView
    }
}