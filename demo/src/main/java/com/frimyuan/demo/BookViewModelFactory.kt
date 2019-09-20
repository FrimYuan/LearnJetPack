package com.frimyuan.demo

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * @author YuanGang
 * @date 2019/9/18.
 * description：
 */
class BookViewModelFactory(private val repository: BookRepository) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>) = BookModel(repository) as T
}