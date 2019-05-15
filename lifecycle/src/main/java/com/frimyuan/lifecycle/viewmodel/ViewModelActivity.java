package com.frimyuan.lifecycle.viewmodel;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.frimyuan.lifecycle.R;
import com.frimyuan.lifecycle.databinding.ActivityViewModelBinding;

public class ViewModelActivity extends AppCompatActivity {
    UserModel userModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityViewModelBinding activityViewModelBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_model);
        userModel = ViewModelProviders.of(this).get(UserModel.class);
        activityViewModelBinding.setUserModel(userModel);
        activityViewModelBinding.setLifecycleOwner(this);
        activityViewModelBinding.setViewModelActivity(this);
    }

    public void click() {
        userModel.doSomething();
    }
}
