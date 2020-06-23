package com.cleanmvvm.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cleanmvvm.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.AppTheme)
        setContentView(R.layout.main_activity)
    }
}
