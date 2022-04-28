package com.example.AprilNine

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.viewbinding.ViewBinding
import com.example.AprilNine.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewBinding: ViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        // setContentView(R.layout.activity_main)

        binding.button.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        val intent:Intent=Intent(this,StartActivity::class.java)
        startActivity(intent)
    }


}