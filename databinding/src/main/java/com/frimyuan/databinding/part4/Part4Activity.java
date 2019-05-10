package com.frimyuan.databinding.part4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.frimyuan.databinding.R;
import com.frimyuan.databinding.bean.User2;

import java.util.ArrayList;
import java.util.List;

public class Part4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_part4);
        List<Product> data = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Product product = new Product();
            product.name.set("名字 "+i);
            product.size.set(i);
            data.add(product);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(new MyAdapter(data));
    }
}
