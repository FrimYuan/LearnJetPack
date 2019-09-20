package com.frimyuan.demo

/**
 * @author YuanGang
 * @date 2019/9/20.
 * description：
 */
object InjectorUtils {

    fun getBookRepository() = BookRepository.getInstance()

    fun provideBookViewModelFactory(): BookViewModelFactory {
        val repository = getBookRepository()
        return BookViewModelFactory(repository)
    }

}