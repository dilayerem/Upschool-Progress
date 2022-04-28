package com.example.androidtweenanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView=findViewById(R.id.imageView)
        button=findViewById(R.id.button)
        val anim=AnimationUtils.loadAnimation(this,R.anim.animation)
        button.setOnClickListener{
            imageView.startAnimation(anim)
        }
    }
}