package com.example.android412.RecycleData;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android412.databinding.Recycle1Binding;
import com.example.android412.databinding.Reycle2Binding;

import java.util.ArrayList;

public class Adapter2 extends RecyclerView.Adapter<Adapter2.ViewHolder> {

    private ArrayList<Integer> list = new ArrayList<>();

    public void addNum(ArrayList<Integer> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(Reycle2Binding.inflate(LayoutInflater.from
                (parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(Adapter2.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private Reycle2Binding binding;


        public ViewHolder(@NonNull Reycle2Binding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(Integer values) {
            binding.tvNum.setText(String.valueOf(getAdapterPosition()+1));
        }
    }
}
