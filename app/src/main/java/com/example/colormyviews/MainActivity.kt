package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        var clickableViews = listOf<View>(
                findViewById(R.id.box_one_text),
                findViewById(R.id.box_two_text),
                findViewById(R.id.box_three_text),
                findViewById(R.id.box_foure_text),
                findViewById(R.id.box_five_text))

        for (view in clickableViews) {
            view.setOnClickListener { setViewColor(it) }
        }
    }

    private fun setViewColor(view: View) {
        when(view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_foure_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            else -> view.setBackgroundColor(Color.GRAY)
        }
    }
}