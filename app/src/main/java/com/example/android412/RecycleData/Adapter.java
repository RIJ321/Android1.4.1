package com.example.android412.RecycleData;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android412.databinding.Recycle1Binding;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Values> list = new ArrayList<>();

    public void adds(ArrayList<Values> values) {
        this.list.addAll(values);
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(Recycle1Binding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private Recycle1Binding binding;


        public ViewHolder(@NonNull Recycle1Binding itemView) {
            super(itemView.getRoot());
            binding = itemView;
        }

        public void onBind(Values values) {
            binding.id.setText(values.getId());
            binding.west.setText(values.getTitle());
            binding.description.setText(values.getDescription());
        }
    }
}
