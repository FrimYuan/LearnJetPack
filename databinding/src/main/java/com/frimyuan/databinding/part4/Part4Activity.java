package com.frimyuan.databinding.part4;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.frimyuan.databinding.R;
import com.frimyuan.databinding.databinding.ActivityPart4Binding;

import java.util.ArrayList;
import java.util.List;

public class Part4Activity extends AppCompatActivity {
    ActivityPart4Binding activityPart4Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityPart4Binding = DataBindingUtil.setContentView(this, R.layout.activity_part4);
        List<Product> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Product product = new Product();
            product.name.set("名字 " + i);
            product.size.set(i);
            data.add(product);
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        activityPart4Binding.recyclerView.setLayoutManager(layoutManager);
        final Part4Adapter myAdapter = new Part4Adapter(data);
        activityPart4Binding.recyclerView.setAdapter(myAdapter);
    }

}
