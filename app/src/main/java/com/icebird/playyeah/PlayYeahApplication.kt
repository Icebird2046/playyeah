package com.icebird.playyeah

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import com.icebird.common.CommonUtils

class PlayYeahApplication: Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        CommonUtils.init(this)
    }
}