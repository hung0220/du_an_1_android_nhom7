package com.example.du_an_1_android;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import org.jetbrains.annotations.NotNull;

public class PageAdapter extends FragmentStatePagerAdapter {
    public PageAdapter(@NonNull @NotNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new com.example.du_an_1_android.HomeTabFragment();
            case 1:
                return new com.example.du_an_1_android.IbTabFragment();
            case 2:
                return new com.example.du_an_1_android.IamTabFragment();
            default:
                return new com.example.du_an_1_android.HomeTabFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
