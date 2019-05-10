package com.frimyuan.databinding.part1;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.frimyuan.databinding.BR;
import com.frimyuan.databinding.R;
import com.frimyuan.databinding.bean2.User;
import com.frimyuan.databinding.databinding.ActivityPart1Binding;

public class Part1Activity extends AppCompatActivity {
    private static final String TAG = "YGG";
    ActivityPart1Binding binding;
    public String mActivityName = "你大爷";
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_part1);
        user = new User("名字1", "密码1");
//        user.setImageUrl("https://upload.jianshu.io/users/upload_avatars/1810812/78b8d55caf76.jpg?imageMogr2/auto-orient/strip|imageView2/1/w/120/h/120");
        binding.setUser2(user);
        //代码中直接获取控件
        //binding.tvUserName.setText("Barnett");
        binding.setPart1(this);
        binding.setMyClick(new MyClick());
    }

    @BindingAdapter({"imageUrl"})
    public static void showImage(ImageView imageView, String url) {
        Glide.with(imageView).load(url).into(imageView);
    }

    public void click(View view) {
        Log.d(TAG, "点击按钮");
    }

    public class MyClick {
        public void click1(View view) {
            Log.d(TAG, "click1 ");
            user.setName("我是新名字");
            user.notifyPropertyChanged(BR.name);
        }

        public void click2(View view) {
            user.setName("我是新名字");
            user.setPassword("我是新密码");
            user.notifyChange();
        }
    }

}
