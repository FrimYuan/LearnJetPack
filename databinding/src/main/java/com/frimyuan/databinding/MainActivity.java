package com.frimyuan.databinding;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.frimyuan.databinding.databinding.ActivityMainBinding;
import com.frimyuan.databinding.part1.Part1Activity;

public class MainActivity extends AppCompatActivity {
    private Context mContext;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.part1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, Part1Activity.class);
                startActivity(intent);
            }
        });
    }
}
