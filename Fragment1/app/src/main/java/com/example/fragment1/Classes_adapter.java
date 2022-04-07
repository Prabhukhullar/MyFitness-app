package com.example.fragment1;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Classes_adapter extends RecyclerView.Adapter<myviewholder> {

    ArrayList<Exercise_model> data;
    FragmentActivity activity;

    public Classes_adapter(ArrayList<Exercise_model> data, FragmentActivity activity) {
        this.data = data;
        this.activity = activity;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.classes_cardview, parent, false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.img.setImageResource(data.get(position).getImg());
        holder.txt.setText(data.get(position).getTxt());
        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Classes2fragment classes2fragment = new Classes2fragment();
                Bundle bundle = new Bundle();
                bundle.putInt("position", (Integer) holder.itemView.getTag());
                classes2fragment.setArguments(bundle);
                activity.getSupportFragmentManager().beginTransaction().add(R.id.container, classes2fragment).addToBackStack(null).commit();
            }
        });
        }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
