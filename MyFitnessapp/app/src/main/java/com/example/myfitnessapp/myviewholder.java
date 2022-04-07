package com.example.myfitnessapp;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder {

    ImageView image1;
    TextView txt_homeWorkout;

    public myviewholder(@NonNull View itemView) {
        super(itemView);
        image1 = itemView.findViewById(R.id.image1);
        txt_homeWorkout = itemView.findViewById(R.id.txt_homeWorkout);
    }
}
