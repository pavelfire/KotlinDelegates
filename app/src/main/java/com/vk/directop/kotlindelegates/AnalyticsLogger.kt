package com.vk.directop.kotlindelegates

import androidx.lifecycle.LifecycleOwner

interface AnalyticsLogger{
    fun registerLifecycleOwner(owner: LifecycleOwner)
}