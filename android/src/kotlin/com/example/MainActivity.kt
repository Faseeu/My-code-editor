package com.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.navigation.NavigationManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize navigation components
        NavigationManager.initialize(this)
    }
}
