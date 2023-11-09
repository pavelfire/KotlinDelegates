package com.vk.directop.kotlindelegates

import android.content.Intent
import androidx.core.app.ComponentActivity

interface DeepLinkHandler {
    fun handleDeepLink(activity: ComponentActivity, intent: Intent?)
}