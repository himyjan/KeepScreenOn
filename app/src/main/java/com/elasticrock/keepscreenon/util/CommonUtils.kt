package com.elasticrock.keepscreenon.util

import android.content.ContentResolver
import android.provider.Settings

class CommonUtils {
    
    fun readScreenTimeout(contentResolver: ContentResolver) : Int {
        return Settings.System.getInt(contentResolver, Settings.System.SCREEN_OFF_TIMEOUT)
    }

    fun setScreenTimeout(contentResolver: ContentResolver, screenTimeout: Int) {
        Settings.System.putInt(contentResolver, Settings.System.SCREEN_OFF_TIMEOUT, screenTimeout)
    }
}