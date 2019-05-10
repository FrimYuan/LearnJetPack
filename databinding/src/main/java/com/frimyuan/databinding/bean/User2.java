package com.frimyuan.databinding.bean;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * @author YuanGang
 * @date 2019/5/10.
 * description：
 */
public class User2 {
    public ObservableField<String> firstName = new ObservableField<>();
    public ObservableField<String> lastName = new ObservableField<>();
    public ObservableInt age = new ObservableInt();
    public ObservableBoolean isStudent = new ObservableBoolean();

}
