package com.frimyuan.databinding.part4;

import android.databinding.ObservableArrayList;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

/**
 * @author YuanGang
 * @date 2019/5/10.
 * description：
 */
public class Product {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableInt size = new ObservableInt();
    public final ObservableArrayList<String> price = new ObservableArrayList<>();
}
