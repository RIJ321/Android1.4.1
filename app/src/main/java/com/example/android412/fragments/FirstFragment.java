package com.example.android412.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.android412.RecycleData.Adapter;
import com.example.android412.RecycleData.Values;
import com.example.android412.databinding.FragmentFirstBinding;

import java.util.ArrayList;

public class FirstFragment extends Fragment {
    private Adapter adapter;
    private ArrayList<Values> list = new ArrayList<>();
    private FragmentFirstBinding binding;

    public FirstFragment() {
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        adapter = new Adapter();
        adapter.adds(list);
        binding.recycleContacts.setAdapter(adapter);
    }


    public void createList() {
        list.add(new Values("1", "Eminem", "41861681154"));
        list.add(new Values("1", "Eminem", "41861681154"));
        list.add(new Values("1", "Eminem", "41861681154"));
        list.add(new Values("1", "Eminem", "41861681154"));
        list.add(new Values("1", "Eminem", "41861681154"));
        list.add(new Values("1", "Eminem", "41861681154"));
        list.add(new Values("1", "Eminem", "41861681154"));
        list.add(new Values("1", "Eminem", "41861681154"));
        list.add(new Values("1", "Eminem", "41861681154"));
        list.add(new Values("1", "Eminem", "41861681154"));
        list.add(new Values("1", "Eminem", "41861681154"));
        list.add(new Values("1", "Eminem", "41861681154"));
        list.add(new Values("1", "Eminem", "41861681154"));
        list.add(new Values("1", "Eminem", "41861681154"));

    }

}