package com.example.fragment1;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Natural_adapter extends RecyclerView.Adapter<Natural_adapter.myviewholder1>{

    ArrayList<Natural_model> dataholder;
    FragmentActivity activity;

    public Natural_adapter(ArrayList<Natural_model> dataholder, FragmentActivity activity) {
        this.dataholder = dataholder;
        this.activity = activity;
    }

    @NonNull
    @Override
    public myviewholder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.supplement_cardview, parent, false);
        return new myviewholder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder1 holder, int position) {
        holder.img.setImageResource(dataholder.get(position).getImgN());
        holder.txt.setText(dataholder.get(position).getTxtN());
        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Natural2_fragment fragment = new Natural2_fragment();
                activity.getSupportFragmentManager().beginTransaction().add(R.id.container, fragment).addToBackStack(null).commit();
                }
        });
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }


    public class myviewholder1 extends RecyclerView.ViewHolder{

        ImageView img;
        TextView txt;

        public myviewholder1(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgN);
            txt = itemView.findViewById(R.id.txt_n);
        }
    }
}
