package com.example.fragment1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder {

    ImageView img;
    TextView txt;

    public myviewholder(@NonNull View itemView) {
        super(itemView);

        img = itemView.findViewById(R.id.image1);
        txt = itemView.findViewById(R.id.txt_homeWorkout);
    }
}
