package com.frimyuan.databinding.bean2;


import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

/**
 * @author YuanGang
 * @date 2019/4/17.
 * description：
 */
public class User extends BaseObservable {
    @Bindable
    private String name;
    @Bindable
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
