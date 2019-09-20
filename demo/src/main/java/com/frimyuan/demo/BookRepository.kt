package com.frimyuan.demo

/**
 * @author YuanGang
 * @date 2019/9/18.
 * description：
 */
class BookRepository private constructor() {
    fun getData() = "111"

    companion object {
        @Volatile
        private var instance: BookRepository? = null

        fun getInstance() = instance ?: synchronized(this) {
            instance ?: BookRepository().also { instance = it }
        }
    }
}