package com.winds.kotlinkoindagger.di

import android.content.Context
import com.google.gson.Gson
import com.winds.kotlinkoindagger.App
import com.winds.kotlinkoindagger.mvvm.MainViewModel
import com.winds.kotlinkoindagger.network.RxSingleSchedulers
import com.winds.kotlinkoindagger.network.createBasicAuthService
import com.winds.kotlinkoindagger.network.provideOkhttpClient
import com.winds.kotlinkoindagger.repository.Repository
import com.winds.kotlinkoindagger.utils.SharedPrefUtils
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.koinApplication
import org.koin.dsl.module

val appModule = module {

    // a single instance for Repository class
    single { Repository(get(), get()) }

    single { Gson() }

    single { SharedPrefUtils(androidApplication()) }

}


val networkModule = module {
    single { provideOkhttpClient() }
    single { createBasicAuthService(get()) }
    single { RxSingleSchedulers.DEFAULT }
}

val viewModelModule = module {

    viewModel {
        MainViewModel(get())
    }
}