package com.example.fragment1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Classes extends Fragment {

    View view;
    RecyclerView recViewClass;
    ArrayList<Exercise_model> dataholder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_classes, container, false);
        recViewClass = view.findViewById(R.id.recViewClass);
        recViewClass.setLayoutManager(new LinearLayoutManager(getContext()));

        dataholder = new ArrayList<>();

        Exercise_model obj1 = new Exercise_model(R.mipmap.yoga1, "Yoga classes");

        dataholder.add(obj1);
        Exercise_model obj2 = new Exercise_model(R.mipmap.cardio2, "Cardio classes");
        dataholder.add(obj2);
        Exercise_model obj3 = new Exercise_model(R.mipmap.gain2, "Wheight Gain");
        dataholder.add(obj3);

        recViewClass.setAdapter(new Classes_adapter(dataholder, getActivity()));
        return view;
    }
}