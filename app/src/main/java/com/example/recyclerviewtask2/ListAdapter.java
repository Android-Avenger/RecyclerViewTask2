package com.example.recyclerviewtask2;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewtask2.databinding.ListItemLayoutBinding;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    ListItemLayoutBinding mBinding;



    public List<Model> listData = new ArrayList<>();

    @NonNull
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(ListItemLayoutBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {

        mBinding.name.setText(listData.get(position).getName());
        mBinding.itemId.setText(listData.get(position).getId());
        mBinding.phone.setText(listData.get(position).getPhone());
        mBinding.wallet.setText(listData.get(position).getWallet());

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public void setData(List<Model> list) {
        this.listData = list;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(ListItemLayoutBinding binding) {
            super(binding.getRoot());
            mBinding = binding;
        }
    }
}
