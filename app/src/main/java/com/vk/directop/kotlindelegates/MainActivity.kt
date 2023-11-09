package com.vk.directop.kotlindelegates

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.reflect.KProperty

class MainActivity : AppCompatActivity(),
    AnalyticsLogger by AnalyticsLoggerImpl(),
    DeepLinkHandler by DeepLinkHandlerImpl() {

    private val myObj by lazy{
        println("Hello world")
        5
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        registerLifecycleOwner(this)
        setContentView(R.layout.activity_main)

        println(myObj)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        handleDeepLink(this, intent)
    }
}

class MyLazy<out T: Any>(
    private val myInitiaize: () -> T
){
    private var value: T? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>):T{
        return if(value == null){
            value = myInitiaize()
            value!!
        }else value!!
    }
}

