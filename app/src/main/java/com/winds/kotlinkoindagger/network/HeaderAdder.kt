package com.winds.kotlinkoindagger.network

import okhttp3.Interceptor
import okhttp3.Response
import java.io.IOException


//This interceptor adds auth token to all request dynamically
class HeaderAdder : Interceptor {
    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
            .addHeader("userType", "karyakarta")
            .addHeader("Content-Type", "application/json")
            .addHeader("Accept", "application/json")
            .addHeader("device-os", "Android")
           // .addHeader("lang", SharedPrefUtils.instance.checkLanguage!!)
           // .addHeader("Accept-Language", SharedPrefUtils.instance.checkLanguage!!)
           // .addHeader("app-version", BuildConfig.VERSION_NAME)
            .addHeader("device-build", android.os.Build.MODEL)
           // .addHeader("Authorization", "Bearer " + SharedPrefUtils.instance.authToken!!)
           .build()
        return chain.proceed(request)
    }
}
