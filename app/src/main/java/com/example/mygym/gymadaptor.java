package com.example.mygym;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mygym.Gym;
import com.example.mygym.MainActivity2;
import com.example.mygym.R;

import java.util.ArrayList;
import java.util.logging.Handler;

public class gymadaptor extends RecyclerView.Adapter {
    ArrayList<Gym> hammad;
    Context m;

    public gymadaptor(ArrayList<Gym> hammad, Context m) {
        this.hammad = hammad;
        this.m = m;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.gym_list, parent, false);
        gymadaptor.ViewHolder vh = new gymadaptor.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {

        ((ViewHolder)holder).name.setText(hammad.get(position).getClub_name());
        ((ViewHolder)holder).since.setText(hammad.get(position).getSince());
        ((ViewHolder)holder).img.setImageResource(hammad.get(position).getImage());
        ((ViewHolder)holder).iew.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent j = new Intent(m, MainActivity2.class);
                j.putExtra("club1",hammad.get(position));
                m.startActivity(j);
            }

        });

    }
    @Override
    public int getItemCount() {
        return hammad.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView img;
        public TextView name;
        public TextView since;
        public View iew;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iew =itemView;
            name = itemView.findViewById(R.id.textview10);
            img = itemView.findViewById(R.id.imageView);
            since = itemView.findViewById(R.id.textView3);


        }
    }
}
