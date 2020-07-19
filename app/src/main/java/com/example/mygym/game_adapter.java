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

import java.io.Serializable;
import java.util.ArrayList;


public class game_adapter extends RecyclerView.Adapter {
    ArrayList<Game> h1;
    Context m1;

    public game_adapter(ArrayList<Game> h, Context m2) {
        this.h1 = h;
        this.m1 = m2;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v10 = LayoutInflater.from(parent.getContext()).inflate(R.layout.gamercl, parent, false);
      ViewHolder vh1 = new ViewHolder(v10);
        return vh1;}


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).name1.setText(h1.get(position).getGameType());
        ((ViewHolder) holder).gameimage.setImageResource(h1.get(position).getImage());
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {



            @Override
            public void onClick(View v) {
                Intent NEXT = new Intent(m1,MainActivity3.class);
                NEXT.putExtra("hi",h1.get(position));
                m1.startActivity(NEXT);

            }

        });

    }

                @Override
    public int getItemCount() {

        return h1.size();

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView gameimage;
        public TextView name1;
        public View view;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            name1 = itemView.findViewById(R.id.name);
            gameimage = itemView.findViewById(R.id.gameimage);


            }

    }

}
