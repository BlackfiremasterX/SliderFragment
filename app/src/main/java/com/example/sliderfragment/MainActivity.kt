package com.example.sliderfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Slide
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2

class MainActivity : FragmentActivity() {

    private lateinit var adapter:SliderAdapter
    private lateinit var slider:ViewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = SliderAdapter(this)
        slider = findViewById(R.id.main_slider)

        slider.adapter = adapter
    }
}