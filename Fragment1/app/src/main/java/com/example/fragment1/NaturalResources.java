package com.example.fragment1;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class NaturalResources extends Fragment {

    View view;
    RecyclerView recView;
    ArrayList<Natural_model> dataholder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_natural_resources, container, false);
        recView = view.findViewById(R.id.natural_recView);
        recView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        data();
        return view;
    }

    public void data(){
        dataholder = new ArrayList<>();

        Natural_model obj1 = new Natural_model(R.mipmap.fruits, "Fruits");
        dataholder.add(obj1);
        Natural_model obj2 = new Natural_model(R.mipmap.nuts, "Nuts");
        dataholder.add(obj2);
        Natural_model obj3 = new Natural_model(R.mipmap.n1, "Fruits");
        dataholder.add(obj3);
        Natural_model obj4 = new Natural_model(R.mipmap.n2, "Fruits");
        dataholder.add(obj4);
        Natural_model obj5 = new Natural_model(R.mipmap.n2, "Fruits");
        dataholder.add(obj5);
        Natural_model obj6 = new Natural_model(R.mipmap.n2, "Fruits");
        dataholder.add(obj6);
        recView.setAdapter(new Natural_adapter(dataholder, getActivity()));
    }
}