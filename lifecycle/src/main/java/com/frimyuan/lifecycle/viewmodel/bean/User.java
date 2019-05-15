package com.frimyuan.lifecycle.viewmodel.bean;

/**
 * @author YuanGang
 * @date 2019/5/15.
 * description：
 */
public class User {
    public String name;
    public String password;

    public User(String name, String password) {
        this.name = name;
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
