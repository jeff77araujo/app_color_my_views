package com.app.colormyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var currentColor = R.color.grey

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setClickButtonColor()
    }

    private fun setClickButtonColor() {
        button_red.setOnClickListener { currentColor = R.color.red }
        button_yellow.setOnClickListener { currentColor = R.color.yellow }
        button_green.setOnClickListener { currentColor = R.color.green }
    }
}