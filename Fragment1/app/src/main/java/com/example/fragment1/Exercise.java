package com.example.fragment1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Objects;


public class Exercise extends Fragment  {

    View view;
    RecyclerView recView;
    ArrayList<Exercise_model> dataholder;
    //Exercise_adapter.ClickListener listener;
//    ArrayList<Exercise2_model> holder;
//    ArrayList<Exercise2_model> holder1;
//    ArrayList<Exercise2_model> holder2;
//    Exercise fragment;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_exercise, container, false);
        recView = view.findViewById(R.id.recView);
        recView.setLayoutManager(new LinearLayoutManager(getContext()));
        dataholder = new ArrayList<>();

        Exercise_model obj1 = new Exercise_model(R.mipmap.home, "Home Workout");

        dataholder.add(obj1);
        Exercise_model obj2 = new Exercise_model(R.mipmap.gym, "GYM Workout");
        dataholder.add(obj2);
        Exercise_model obj3 = new Exercise_model(R.mipmap.core, "Core Workout");
        dataholder.add(obj3);

        recView.setAdapter(new Exercise_adapter(dataholder,getActivity()));

        return view;
    }

//    @Override
//    public void onSlotClick(int position) {
//
//       // listener.onSlotClick();
//        Exercise2fragment fragment = new Exercise2fragment();
//        Bundle bundle = new Bundle();
//        bundle.putInt("position",position);
//        fragment.setArguments(bundle);
//        getActivity().getSupportFragmentManager().beginTransaction().add(R.id.container, fragment).addToBackStack(null).commit();
//    }
}