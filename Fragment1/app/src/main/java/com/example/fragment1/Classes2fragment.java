package com.example.fragment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Classes2fragment extends Fragment {

    View view;
    RecyclerView recyclerView;
    ArrayList<Exercise2_model> dataholder;
    Classes2_adapter classes2_adapter;
    int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_classes2fragment, container, false);
        recyclerView = view.findViewById(R.id.recViewClass2);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        position = getArguments().getInt("position", 0);
        fillData();
        classes2_adapter = new Classes2_adapter(dataholder);
        recyclerView.setAdapter(classes2_adapter);
        return view;
    }
    public void fillData(){
        dataholder = new ArrayList<>();
        if(position == 0){
            dataholder.add(new Exercise2_model(R.mipmap.yoga1,"Yoga"));
            dataholder.add(new Exercise2_model(R.mipmap.yoga2,"Yoga"));
        } else if(position == 1){
            dataholder.add(new Exercise2_model(R.mipmap.cardio1,"Cardio"));
            dataholder.add(new Exercise2_model(R.mipmap.cardio2,"Cardio"));
        } else {
            dataholder.add(new Exercise2_model(R.mipmap.gain1,"muscular gain"));
            dataholder.add(new Exercise2_model(R.mipmap.gain2,"bulky gain"));
        }

    }
}