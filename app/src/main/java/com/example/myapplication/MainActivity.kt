package com.example.myapplication

import android.app.AlertDialog
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var inputEditText: EditText
    private lateinit var displayButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputEditText = findViewById(R.id.inputEditText)
        displayButton = findViewById(R.id.displayButton)

        displayButton.setOnClickListener {
            val inputText = inputEditText.text.toString()
            if (inputText.isNotEmpty()) {
                displayAlertDialog(inputText)
            }
        }
    }

    private fun displayAlertDialog(text: String) {
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Thông báo")
        alertDialogBuilder.setMessage("Bạn vừa nhập: $text")
        alertDialogBuilder.setPositiveButton("OK") { dialog, _ ->
            dialog.dismiss()
        }
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}