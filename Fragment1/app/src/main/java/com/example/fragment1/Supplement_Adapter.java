package com.example.fragment1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Supplement_Adapter extends FragmentPagerAdapter {

    int tabcount;

    public Supplement_Adapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new NaturalResources();
            case 1:
                return new Artifical_supplements();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
