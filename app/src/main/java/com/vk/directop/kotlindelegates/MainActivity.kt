package com.vk.directop.kotlindelegates

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), AnalyticsLogger by AnalyticsLoggerImpl(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerLifecycleOwner(this)
        setContentView(R.layout.activity_main)

    }
}

