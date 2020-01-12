package com.winds.kotlinkoindagger

import android.app.Application
import com.winds.kotlinkoindagger.di.appModule
import com.winds.kotlinkoindagger.di.networkModule
import com.winds.kotlinkoindagger.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        val context = this
        val moduleList=listOf(appModule, networkModule, viewModelModule)
        startKoin { modules(moduleList).androidContext(context) }
    }

}