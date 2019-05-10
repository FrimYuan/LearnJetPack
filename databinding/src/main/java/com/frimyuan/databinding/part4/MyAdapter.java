package com.frimyuan.databinding.part4;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.frimyuan.databinding.R;
import com.frimyuan.databinding.databinding.ItemViewBinding;

import java.util.List;

/**
 * @author YuanGang
 * @date 2019/5/10.
 * description：
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {
    private List<Product> mData;

    public MyAdapter(List<Product> data) {
        this.mData = data;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return MyHolder.create(LayoutInflater.from(parent.getContext()), parent);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.bindTo(mData.get(position));
    }

    @Override
    public int getItemCount() {
        if (mData == null) {
            return 0;
        }
        return mData.size();
    }


    static class MyHolder extends RecyclerView.ViewHolder {

        private ItemViewBinding mBinding;

        static MyHolder create(LayoutInflater inflater, ViewGroup parent) {
//            ItemViewBinding binding = DataBindingUtil.inflate(inflater, R.layout.item_view, parent, false);
            ItemViewBinding binding = ItemViewBinding.inflate(inflater, parent, false);
            return new MyHolder(binding);
        }

        private MyHolder(ItemViewBinding binding) {
            super(binding.getRoot());
            this.mBinding = binding;
        }

        public void bindTo(Product product) {
            mBinding.setProduct(product);
            mBinding.executePendingBindings();
        }
    }
}
