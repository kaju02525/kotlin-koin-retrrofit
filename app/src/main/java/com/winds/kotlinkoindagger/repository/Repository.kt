package com.winds.kotlinkoindagger.repository

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.winds.kotlinkoindagger.model.ApiResponse
import com.winds.kotlinkoindagger.network.ApiService
import com.winds.kotlinkoindagger.network.RxSingleSchedulers
import com.winds.kotlinkoindagger.utils.log
import io.reactivex.schedulers.Schedulers

class Repository(val apiService: ApiService, val schedulers: RxSingleSchedulers) {

    val userList = MutableLiveData<List<ApiResponse>>()


    @SuppressLint("CheckResult")
    fun fetchUsers() {
        apiService.getAllUsers()
            .subscribeOn(Schedulers.io())
            .compose(schedulers.applySchedulers())
            .subscribe({
                userList.postValue(it)
            },
                {
                    log("Error: ${it.printStackTrace()}")
                })

    }

    fun getMessage(): MutableLiveData<List<ApiResponse>> {
        return userList;
    }
}