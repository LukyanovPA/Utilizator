package com.pavellukyanov.utilizator.core

import android.app.Application
import com.google.android.datatransport.BuildConfig
import com.pavellukyanov.utilizator.utils.Const.MAP_KEY
import com.pavellukyanov.utilizator.utils.SecretValues
import com.yandex.mapkit.MapKitFactory
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber
import javax.inject.Inject

@HiltAndroidApp
class App : Application() {
    @Inject
    lateinit var secret: SecretValues

    override fun onCreate() {
        super.onCreate()
        initLogger()
        initMapKit()
    }

    private fun initLogger() {
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }

    private fun initMapKit() {
        MapKitFactory.setApiKey(secret.getValue(MAP_KEY))
        MapKitFactory.initialize(applicationContext)
    }
}