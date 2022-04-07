package com.example.fragment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class Exercise2fragment extends Fragment {

   View view;
   RecyclerView rec2;
   ArrayList<Exercise2_model> dataholder;
   Exercise2_adapter adapter;
   int position;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_exercise2fragment, container, false);
        rec2 = view.findViewById(R.id.rec2);
        rec2.setLayoutManager(new LinearLayoutManager(getContext()));
        position = getArguments().getInt("position", 0);
        fillData();
        adapter = new Exercise2_adapter(dataholder);
        rec2.setAdapter(adapter);
        //getChildFragmentManager().beginTransaction().replace(R.id.container, new Exercise2fragment()).addToBackStack(null).commit();

        return view;
    }

    public void fillData(){
        dataholder = new ArrayList<>();
        if(position == 0){
            dataholder.add(new Exercise2_model(R.mipmap.gym,"Chest"));
            dataholder.add(new Exercise2_model(R.mipmap.core,"Back"));
        } else if(position == 1){
            dataholder.add(new Exercise2_model(R.mipmap.home,"Chest"));
            dataholder.add(new Exercise2_model(R.mipmap.home,"Back"));
        } else{
            dataholder.add(new Exercise2_model(R.mipmap.gym,"Upper ABS"));
            dataholder.add(new Exercise2_model(R.mipmap.gym,"Lower ABS"));
        }

    }
}