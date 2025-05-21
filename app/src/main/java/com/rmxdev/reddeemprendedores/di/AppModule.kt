package com.rmxdev.reddeemprendedores.di

import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.auth.ktx.auth
import com.google.firebase.crashlytics.ktx.crashlytics
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.ktx.storage
import org.koin.dsl.module

val appModule = module {
    //Firebase instances
    single { Firebase.auth }
    single { Firebase.firestore }
    single { Firebase.storage }
    single { Firebase.analytics }
    single { Firebase.crashlytics }
}