package com.winds.kotlinkoindagger.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.google.gson.Gson
import com.winds.kotlinkoindagger.R
import com.winds.kotlinkoindagger.mvvm.MainViewModel
import com.winds.kotlinkoindagger.utils.SharedPrefUtils
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    // we get our viewModel from Koin
    private val mainViewModel: MainViewModel by viewModel()
    private val preferences: SharedPrefUtils by inject()
    private val gson: Gson by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv.append(preferences.userName)

        mainViewModel.getUserData().observe(this, Observer {
            for (res in it) {
                tv.append("\n")
                tv.append(res.publisher)
                preferences.userName = res.publisher
            }
        })
    }

    fun btn(view: View) {
        mainViewModel.fetchUsers()
    }
}
