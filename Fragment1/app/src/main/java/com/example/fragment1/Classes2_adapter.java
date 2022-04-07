package com.example.fragment1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Classes2_adapter extends RecyclerView.Adapter<myviewholder> {

    ArrayList<Exercise2_model> data;

    public Classes2_adapter(ArrayList<Exercise2_model> data) {
        this.data = data;
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
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
