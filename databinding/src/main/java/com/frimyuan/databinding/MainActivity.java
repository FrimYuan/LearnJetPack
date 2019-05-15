package com.frimyuan.databinding;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.frimyuan.databinding.databinding.ActivityMainBinding;
import com.frimyuan.databinding.part1.Part1Activity;
import com.frimyuan.databinding.part3.Part3Activity;
import com.frimyuan.databinding.part4.Part4Activity;
import com.frimyuan.databinding.part5.Part5Activity;

public class MainActivity extends AppCompatActivity {
    private Context mContext;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public void jumpPart1(View view) {
        Intent intent = new Intent(mContext, Part1Activity.class);
        startActivity(intent);
    }

    public void jumpPart3(View view) {
        Intent intent = new Intent(mContext, Part3Activity.class);
        startActivity(intent);
    }

    public void jumpPart4(View view) {
        Intent intent = new Intent(mContext, Part4Activity.class);
        startActivity(intent);
    }

    public void jumpPart5(View view) {
        Intent intent = new Intent(mContext, Part5Activity.class);
        startActivity(intent);
    }
}
