package com.frimyuan.lifecycle;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.frimyuan.lifecycle.databinding.ActivityMainBinding;
import com.frimyuan.lifecycle.lifecycle.LifeCycleActivity;
import com.frimyuan.lifecycle.viewmodel.ViewModelActivity;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setMyclick(new MyClick());
    }

    public class MyClick {
        public void jump1(View view) {
            Intent intent = new Intent(MainActivity.this, LifeCycleActivity.class);
            startActivity(intent);
        }

        public void jump2(View view) {
            Intent intent = new Intent(MainActivity.this, ViewModelActivity.class);
            startActivity(intent);
        }

    }
}
