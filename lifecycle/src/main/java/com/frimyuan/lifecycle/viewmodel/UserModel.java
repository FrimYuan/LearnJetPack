package com.frimyuan.lifecycle.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.frimyuan.lifecycle.viewmodel.bean.User;

/**
 * @author YuanGang
 * @date 2019/5/15.
 * description：
 */
public class UserModel extends ViewModel {
    public MutableLiveData<User> mUserMutableLiveData;

    public LiveData<User> getUserLiveData() {
        if (mUserMutableLiveData == null) {
            mUserMutableLiveData = new MutableLiveData<>();
        }
        return mUserMutableLiveData;
    }

    public void doSomething(User user) {
        mUserMutableLiveData.postValue(user);
    }
}
