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

import java.util.ArrayList;

public class gym2adaptor extends RecyclerView.Adapter {
    ArrayList<Gym2> hammad1;
    Context m1;

    public gym2adaptor(ArrayList<Gym2> hammad1, Context m1) {
        this.hammad1 = hammad1;
        this.m1 = m1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.gym2, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {

        ((ViewHolder)holder).name.setText(hammad1.get(position).getClub_name());
        ((ViewHolder)holder).since.setText(hammad1.get(position).getSince());
        ((ViewHolder)holder).img.setImageResource(hammad1.get(position).getImage());
//        ((ViewHolder)holder).howtojoin.setText(hammad1.get(position).getHowtojoin());
//        ((ViewHolder)holder).location.setText(hammad1.get(position).getLocation());
        ((ViewHolder)holder).iew.setOnClickListener(new View.OnClickListener() {



                @Override
                public void onClick(View v) {
                    Intent j = new Intent(m1, MainActivity6.class);
                    j.putExtra("gym2",hammad1.get(position));
                    m1.startActivity(j);
                }

        });

    }
    @Override
    public int getItemCount() {
        return hammad1.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public ImageView img;
        public TextView name;
        public TextView since;
        public View iew;
        public TextView howtojoin;
        public TextView location;

        public ViewHolder(@NonNull View itemView) {

            super(itemView);
            iew =itemView;
            name = itemView.findViewById(R.id.TV2);
            img = itemView.findViewById(R.id.IV2);
            since = itemView.findViewById(R.id.TV3);
            location = itemView.findViewById(R.id.textView40);
            howtojoin = itemView.findViewById(R.id.textView3);


        }
    }
}