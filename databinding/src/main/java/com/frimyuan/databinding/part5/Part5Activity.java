package com.frimyuan.databinding.part5;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.frimyuan.databinding.R;
import com.frimyuan.databinding.bean.User2;
import com.frimyuan.databinding.bean2.User;
import com.frimyuan.databinding.databinding.ActivityPart5Binding;

public class Part5Activity extends AppCompatActivity {
    ActivityPart5Binding activityPart5Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityPart5Binding= DataBindingUtil.setContentView(this, R.layout.activity_part5);
        User2 user = new User2();
        user.firstName.set("1");
        activityPart5Binding.setUser2(user);
    }
}
