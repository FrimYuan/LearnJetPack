package com.frimyuan.lifecycle.viewmodel;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.frimyuan.lifecycle.viewmodel.bean.User;

/**
 * @author YuanGang
 * @date 2019/5/15.
 * description：
 */
public class UserModel extends ViewModel {
    public final MutableLiveData<User> mUserMutableLiveData = new MutableLiveData<>();

    public UserModel() {
        mUserMutableLiveData.postValue(new User("大锦鲤", "123456"));
    }

    public void doSomething() {
        User user = mUserMutableLiveData.getValue();
        if (user != null) {
            user.name = "FrimYuan";
            user.password = "456789";
            mUserMutableLiveData.setValue(user);
        }
    }
}
