package com.frimyuan.databinding.part4;


import androidx.databinding.ObservableArrayList;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;

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
