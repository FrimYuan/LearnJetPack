package com.frimyuan.databinding.part3;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableField;
import android.databinding.ObservableList;
import android.databinding.ObservableMap;
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
    private ObservableArrayList<User> users = new ObservableArrayList<>();
    private ObservableArrayMap<String, User> arrayMap = new ObservableArrayMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding = DataBindingUtil.setContentView(this, R.layout.activity_part3);
        user2 = new User2();
        viewDataBinding.setUser2(user2);
        user2.firstName.set("大卫");
        user2.lastName.set("科波菲尔");
        name.set("哈哈哈哈");
        User user = new User("a", "b");
        users.add(user);
        arrayMap.put("first", user);
        learn2();
    }

    public void changeText(View view) {
        user2.firstName.set("乔治");
        user2.lastName.set("安安");
        name.set("呵呵呵");
    }

    private void learn2() {
        User user = new User("111", "222");
        User user1 = new User("222", "333");

        ObservableList<User> list = new ObservableArrayList<>();
        list.add(user);
        list.add(user1);
        viewDataBinding.setList(list);

        ObservableMap<String, User> map = new ObservableArrayMap<>();
        map.put("1", user);
        map.put("2", user1);
        viewDataBinding.setMap(map);

        viewDataBinding.setIndex(0);
        viewDataBinding.setKey("1");
    }


}
