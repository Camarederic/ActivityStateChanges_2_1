package com.example.activitystatechanges_2_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            textViewHello.text = editTextEnter.text
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.run {
            putString("KEY", textViewHello.text.toString())
        }

        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        textViewHello.text = savedInstanceState.getString("KEY")
    }
}