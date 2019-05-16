package com.frimyuan.lifecycle.viewmodel;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.frimyuan.lifecycle.R;
import com.frimyuan.lifecycle.databinding.ActivityViewModelBinding;
import com.frimyuan.lifecycle.viewmodel.bean.User;

public class ViewModelActivity extends AppCompatActivity {
    UserModel userModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityViewModelBinding activityViewModelBinding = DataBindingUtil.setContentView(this, R.layout.activity_view_model);
        userModel = ViewModelProviders.of(this).get(UserModel.class);
        userModel.getUserLiveData().observe(this, new Observer<User>() {
            @Override
            public void onChanged(@Nullable User user) {
                Log.d("YGG", "UI刷新 " + user.toString());
            }
        });
        activityViewModelBinding.setUserModel(userModel);
        activityViewModelBinding.setLifecycleOwner(this);
        activityViewModelBinding.setViewModelActivity(this);
        User user = new User("大锦鲤", "123456");
        userModel.doSomething(user);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                click();
            }
        }, 2000);
    }

    public void click() {
        User user = new User("FrimYuan", "456789");
        userModel.doSomething(user);
    }
}
