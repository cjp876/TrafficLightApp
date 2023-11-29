package com.purcell.msu.activitytrafficlightmarkii

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private lateinit var redLight: ImageView
    private lateinit var yellowLight: ImageView
    private lateinit var greenLight: ImageView
    private lateinit var switchButton: Button

    private var currentLight: Int = R.id.redLight

    fun switchLight(view: View) {
        when (currentLight) {
            R.id.redLight -> {
                redLight.visibility = View.INVISIBLE
                yellowLight.visibility = View.INVISIBLE
                greenLight.visibility = View.VISIBLE
                switchButton.text = "Go"
                currentLight = R.id.greenLight
            }
            R.id.greenLight -> {
                redLight.visibility = View.INVISIBLE
                yellowLight.visibility = View.VISIBLE
                greenLight.visibility = View.INVISIBLE
                switchButton.text = "Wait"
                currentLight = R.id.yellowLight
            }
            R.id.yellowLight -> {
                redLight.visibility = View.VISIBLE
                yellowLight.visibility = View.INVISIBLE
                greenLight.visibility = View.INVISIBLE
                switchButton.text = "Stop"
                currentLight = R.id.redLight
            }
        }
    }
}