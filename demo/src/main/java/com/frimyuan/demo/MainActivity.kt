package com.frimyuan.demo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: BookModel

    val str by lazy {"sadas" }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = obtainViewModel(InjectorUtils.provideBookViewModelFactory())
        viewModel.book.observe(this, Observer {
            Log.d("YGG", "数据变化 $it")
        })
        test.setOnClickListener {
            viewModel.getData()
        }

    }
}
