package com.example.android412;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.android412.fragments.FirstFragment;
import com.example.android412.fragments.SecondFragment;
import com.example.android412.fragments.ThirdFragment;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public ViewPagerAdapter(FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: {
                return new FirstFragment();
            }
            case 1: {
                return new SecondFragment();
            }
            case 2: {
                return new ThirdFragment();
            }
        }
        return new FirstFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: {
                return "Titles";
            }
            case 1: {
                return "Numbers";
            }
            case 2: {
                return "Images";
            }
        }
        return super.getPageTitle(position);
    }
}
