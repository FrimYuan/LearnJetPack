package com.frimyuan.databinding.part1;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.frimyuan.databinding.R;
import com.frimyuan.databinding.bean.User;
import com.frimyuan.databinding.databinding.ActivityPart1Binding;

public class Part1Activity extends AppCompatActivity {
    ActivityPart1Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_part1);
        User user = new User("大锦鲤", "123456", true);
        user.setImageUrl("https://upload.jianshu.io/users/upload_avatars/1810812/78b8d55caf76.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/120/h/120");
        binding.setUser(user);
        //代码中直接获取控件
        //binding.tvUserName.setText("Barnett");
    }

    @BindingAdapter({"imageUrl"})
    public static void showImage(ImageView imageView, String url) {
        Glide.with(imageView).load(url).into(imageView);
    }
}
