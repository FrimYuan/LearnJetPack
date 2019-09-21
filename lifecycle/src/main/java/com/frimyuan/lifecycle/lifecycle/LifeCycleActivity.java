package com.frimyuan.lifecycle.lifecycle;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.frimyuan.lifecycle.R;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        MyObserver myObserver = new MyObserver();
        getLifecycle().addObserver(myObserver);

    }
}
