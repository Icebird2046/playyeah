package com.icebird.common

import android.content.Context

object CommonUtils {

    private var appContext: Context? = null

    fun init(context: Context) {
        appContext = context
    }

    fun getContext(): Context {
        return appContext!!
    }
}