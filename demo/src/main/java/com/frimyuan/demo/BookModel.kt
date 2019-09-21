package com.frimyuan.demo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author YuanGang
 * @date 2019/9/18.
 * description：
 */
class BookModel(private val bookRepository: BookRepository) : ViewModel() {

    val book = MutableLiveData<String>()

    fun setData(num: String) {
        book.value = num
    }

    fun getData() {
        book.postValue(bookRepository.getData())
    }
}