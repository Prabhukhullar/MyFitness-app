package com.example.myfitnessapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExerciseAdapter extends RecyclerView.Adapter<myviewholder> {

    ArrayList<Exercise_model> data;
    Context context;

    public ExerciseAdapter(ArrayList<Exercise_model> data, Context context) {
        this.data = data;
        this.context = context;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.exercises_layout, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        final Exercise_model temp = data.get(position);
        holder.image1.setImageResource(data.get(position).getImgname());
        holder.txt_homeWorkout.setText(data.get(position).getTxt());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Router.getInstance().setExercise_details(temp.getExercise_detail());
                Intent intent = new Intent(context, Exercise2.class);
//                intent.putExtra("text", temp.getTxt());

                intent.setFlags(intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
