package com.frimyuan.databinding.part3;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableField;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.frimyuan.databinding.R;
import com.frimyuan.databinding.bean.User;
import com.frimyuan.databinding.bean.User2;
import com.frimyuan.databinding.databinding.ActivityPart3Binding;

public class Part3Activity extends AppCompatActivity {
    private ActivityPart3Binding viewDataBinding;
    private User2 user2;
    public final ObservableField<String> name = new ObservableField<>();
    public ObservableArrayList<User> users = new ObservableArrayList<>();
    public ObservableArrayMap<String, User> arrayMap = new ObservableArrayMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_part3);
        user2 = new User2();
        viewDataBinding.setUser(user2);
        viewDataBinding.setPart3Activity(this);
        user2.firstName.set("大卫");
        user2.lastName.set("科波菲尔");
        name.set("哈哈哈哈");
        User user = new User("a", "b");
        users.add(user);
        arrayMap.put("first", user);
    }

    public void changeText(View view) {
        user2.firstName.set("乔治");
        user2.lastName.set("安安");
        name.set("呵呵呵");
    }

}
