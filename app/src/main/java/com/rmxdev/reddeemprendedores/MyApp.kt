package com.rmxdev.reddeemprendedores

import android.app.Application
import com.google.firebase.FirebaseApp
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.crashlytics.ktx.crashlytics
import com.google.firebase.ktx.Firebase
import com.rmxdev.reddeemprendedores.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class MyApp: Application() {
    override fun onCreate() {
        super.onCreate()

        // Initialize Firebase
        FirebaseApp.initializeApp(this)
        val analytics = Firebase.analytics
        val crashlytics = Firebase.crashlytics

        // Initialize Koin
        startKoin {
            androidContext(this@MyApp)
            modules(appModule)
        }

    }
}