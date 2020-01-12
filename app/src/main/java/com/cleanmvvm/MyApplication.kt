package com.cleanmvvm

import android.app.Application
import net.danlew.android.joda.JodaTimeAndroid
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        JodaTimeAndroid.init(this)
        startKoin {
            androidContext(this@MyApplication)
        }
    }
}
