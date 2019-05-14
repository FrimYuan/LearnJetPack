package com.frimyuan.databinding.part4;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.frimyuan.databinding.databinding.ItemViewBinding;

import java.util.List;

/**
 * @author YuanGang
 * @date 2019/5/10.
 * description：
 */
public class Part4Adapter extends RecyclerView.Adapter<Part4Adapter.MyHolder> {
    private List<Product> mData;

    public Part4Adapter(List<Product> data) {
        this.mData = data;
    }

    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyHolder(ItemViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {
        holder.mBinding.setProduct(mData.get(position));
        holder.mBinding.executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    static class MyHolder extends RecyclerView.ViewHolder {

        private ItemViewBinding mBinding;

        private MyHolder(ItemViewBinding binding) {
            super(binding.getRoot());
            this.mBinding = binding;
        }
    }

    public void upDataList(List<Product> data) {
        mData.clear();
        mData.addAll(data);
        notifyDataSetChanged();
    }
}
