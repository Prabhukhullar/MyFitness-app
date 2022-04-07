package com.example.fragment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;


public class Natural2_fragment extends Fragment {

    View view;
    RecyclerView natural_recView;
    ArrayList<Naturaldetails_model> dataholder;
    Nautraldetails_adapter adapter;
    int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_natural2_fragment, container, false);
        natural_recView = view.findViewById(R.id.natural_recView);
        natural_recView.setLayoutManager(new LinearLayoutManager(getContext()));
        position = getArguments().getInt("position", 0);
        fillData();
        adapter = new Nautraldetails_adapter(dataholder);
        natural_recView.setAdapter(adapter);
        return view;
    }
    public void fillData(){
        dataholder = new ArrayList<>();
        if(position == 0){
            dataholder.add(R.string.fruits_protein, R.string.fruits_calories, R.string.fruits_description);
        }

    }
}