package com.example.fragment1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Nautraldetails_adapter extends RecyclerView.Adapter<Nautraldetails_adapter.myviewholder1>{

    ArrayList<Naturaldetails_model> data;

    public Nautraldetails_adapter(ArrayList<Naturaldetails_model> data) {
        this.data = data;
    }

    @NonNull
    @Override
    public myviewholder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater n = LayoutInflater.from(parent.getContext());
        View view = n.inflate(R.layout.naturaldetails_view, parent, false);
        return new myviewholder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder1 holder, int position) {
        holder.heading_txt.setText(data.get(position).getText1());
        holder.heading1_txt.setText(data.get(position).getText2());
        holder.calorie_txt.setText(data.get(position).getText3());
        holder.calorie1_txt.setText(data.get(position).getText4());
        holder.description_txt.setText(data.get(position).getText5());
        holder.description1_txt.setText(data.get(position).getText6());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class myviewholder1 extends RecyclerView.ViewHolder{

        TextView heading_txt, heading1_txt, calorie_txt, calorie1_txt, description_txt, description1_txt;

        public myviewholder1(@NonNull View itemView) {
            super(itemView);
            heading_txt = itemView.findViewById(R.id.protein_txt);
            heading1_txt = itemView.findViewById(R.id.protein1_txt);
            calorie_txt = itemView.findViewById(R.id.calorie_txt);
            calorie1_txt = itemView.findViewById(R.id.calorie1_txt);
            description_txt = itemView.findViewById(R.id.description_txt);
            description1_txt = itemView.findViewById(R.id.description1_txt);
        }
    }
}
