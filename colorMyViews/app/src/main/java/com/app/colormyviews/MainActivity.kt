package com.app.colormyviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var currentColor = R.color.grey
//    var box1 = box_one_text.setBackgroundResource(currentColor)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setClickButtonColor()
        setClickBoxColor()
        setDefaultColor()
    }

    private fun setClickButtonColor() {
        // button's são os id's
        button_red.setOnClickListener { currentColor = R.color.red }
        button_yellow.setOnClickListener { currentColor = R.color.yellow }
        button_green.setOnClickListener { currentColor = R.color.green }
    }

    private fun setClickBoxColor() {
        box_one_text.setOnClickListener { it.setBackgroundResource(currentColor) }
        box_two_text.setOnClickListener { it.setBackgroundResource(currentColor) }
        box_three_text.setOnClickListener { it.setBackgroundResource(currentColor) }
        box_four_text.setOnClickListener { it.setBackgroundResource(currentColor) }
        box_five_text.setOnClickListener { it.setBackgroundResource(currentColor) }
    }

    private fun setDefaultColor() {
        button_grey.setOnClickListener {
            currentColor = R.color.grey

            box_one_text.setBackgroundResource(currentColor)
            box_two_text.setBackgroundResource(currentColor)
            box_three_text.setBackgroundResource(currentColor)
            box_four_text.setBackgroundResource(currentColor)
            box_five_text.setBackgroundResource(currentColor)
        }
    }
}