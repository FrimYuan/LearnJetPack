package com.frimyuan.databinding.bean;

/**
 * @author YuanGang
 * @date 2019/4/17.
 * description：
 */
public class User {
    private String name;
    private String password;
    private boolean isStudent;
    private String imageUrl;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, boolean isStudent) {
        this.name = name;
        this.password = password;
        this.isStudent = isStudent;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
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
}
