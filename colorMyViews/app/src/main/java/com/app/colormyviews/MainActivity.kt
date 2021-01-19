package com.app.colormyviews

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var currentColor = R.color.grey
    var boxOneColor = R.color.grey
    var boxTwoColor = R.color.grey
    var boxThreeColor = R.color.grey
    var boxFourColor = R.color.grey
    var boxFiveColor = R.color.grey
//    var box1 = box_one_text.setBackgroundResource(currentColor)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sharedPreferences = this.getSharedPreferences("colors", Context.MODE_PRIVATE)
        val color1 = sharedPreferences.getInt("color_box_one", R.color.grey) // se não tiver cor salvo, trás um cinza como padrão
        val color2 = sharedPreferences.getInt("color_box_two", R.color.grey) // se não tiver cor salvo, trás um cinza como padrão
        val color3 = sharedPreferences.getInt("color_box_three", R.color.grey) // se não tiver cor salvo, trás um cinza como padrão
        val color4 = sharedPreferences.getInt("color_box_four", R.color.grey) // se não tiver cor salvo, trás um cinza como padrão
        val color5 = sharedPreferences.getInt("color_box_five", R.color.grey) // se não tiver cor salvo, trás um cinza como padrão

        box_one_text.setBackgroundResource(color1)
        box_two_text.setBackgroundResource(color2)
        box_three_text.setBackgroundResource(color3)
        box_four_text.setBackgroundResource(color4)
        box_five_text.setBackgroundResource(color5)

        setClickButtonColor()
        setClickBoxColor()
        setDefaultColor()
    }

    // essa função é chamada quando o app é fechado, salvando os dados no sharedPreferences
    override fun onStop() { // onStop() é parecido com onDestroy()
        super.onStop()
        val sharedPreferences = this.getSharedPreferences("colors", Context.MODE_PRIVATE)
        val sharedPreferencesEditor = sharedPreferences.edit()
        sharedPreferencesEditor.putInt("color_box_one", boxOneColor)
        sharedPreferencesEditor.putInt("color_box_two", boxTwoColor)
        sharedPreferencesEditor.putInt("color_box_three", boxThreeColor)
        sharedPreferencesEditor.putInt("color_box_four", boxFourColor)
        sharedPreferencesEditor.putInt("color_box_five", boxFiveColor)
        sharedPreferencesEditor.apply() // apply() é igual o commit()
    }
    // função para escolher a cor
    private fun setClickButtonColor() {
        // button's são os id's
        button_red.setOnClickListener { currentColor = R.color.red }
        button_yellow.setOnClickListener { currentColor = R.color.yellow }
        button_green.setOnClickListener { currentColor = R.color.green }
    }
    // função para colorir as caixinhas
    private fun setClickBoxColor() {
        box_one_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
            boxOneColor = currentColor
        }
        box_two_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
            boxTwoColor = currentColor
        }
        box_three_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
            boxThreeColor = currentColor
        }
        box_four_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
            boxFourColor = currentColor
        }
        box_five_text.setOnClickListener {
            it.setBackgroundResource(currentColor)
            boxFiveColor = currentColor
        }
    }
    // deixa todas as caixinhas na cor padrão novamente
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