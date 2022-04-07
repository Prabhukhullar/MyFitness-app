package com.example.fragment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class Supplement_Info extends Fragment {

    View view;
    TabLayout tabLayout;
    TabItem item1, item2;
    ViewPager viewPager;
    Supplement_Adapter supplement_adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_supplement__info, container, false);
        tabLayout = view.findViewById(R.id.tablayout);
        item1 = view.findViewById(R.id.tab1);
        item2 = view.findViewById(R.id.tab2);
        viewPager = view.findViewById(R.id.viewpage);
        supplement_adapter = new Supplement_Adapter(getChildFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(supplement_adapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 || tab.getPosition() == 1){
                    supplement_adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        return view;
    }
}