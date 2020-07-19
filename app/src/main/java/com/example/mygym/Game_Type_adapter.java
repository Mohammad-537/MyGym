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

public class Game_Type_adapter extends RecyclerView.Adapter {
    ArrayList<game_type> h10;
    Context m10;

    public Game_Type_adapter(ArrayList<game_type> h10, Context m10) {


        this.h10 = h10;
        this.m10 = m10;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v10 = LayoutInflater.from(parent.getContext()).inflate(R.layout.gamercl, parent, false);
        ViewHolder vh1 = new ViewHolder(v10);
        return vh1;}


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).name1.setText(h10.get(position).getGame_type());
        ((ViewHolder) holder).gameimage.setImageResource(h10.get(position).getGame_type_image());
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {




            @Override
            public void onClick(View v) {
                Intent NEXT = new Intent(m10,MainActivity4.class);
                NEXT.putExtra("hi1", h10.get(position));
                m10.startActivity(NEXT);

            }

        });

    }

    @Override
    public int getItemCount() {

        return h10.size();

    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView gameimage;
        public TextView name1;
        public View view;
        public TextView TV;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            TV =  itemView.findViewById(R.id.TV);
            name1 = itemView.findViewById(R.id.name);
            gameimage = itemView.findViewById(R.id.gameimage);


        }

    }

}
