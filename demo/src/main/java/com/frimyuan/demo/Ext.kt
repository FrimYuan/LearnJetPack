package com.frimyuan.demo

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * @author YuanGang
 * @date 2019/9/21.
 * description：
 */
inline fun <reified T : ViewModel> AppCompatActivity.obtainViewModel(factory: ViewModelProvider.Factory) =
        ViewModelProvider(this, factory).get(T::class.java)