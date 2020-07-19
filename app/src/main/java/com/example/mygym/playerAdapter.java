package com.example.mygym;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class playerAdapter extends RecyclerView.Adapter {

    ArrayList<player> F;
    Context F1;

    public playerAdapter(ArrayList<player> F, Context F1) {
        this.F = F;
        this.F1 = F1;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v10 = LayoutInflater.from(parent.getContext()).inflate(R.layout.hero, parent, false);
        playerAdapter.ViewHolder vh1 = new playerAdapter.ViewHolder(v10);
        return vh1;}




    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ((ViewHolder)holder).name_player.setText(F.get(position).getName1()+"");
        ((ViewHolder)holder).tall.setText(F.get(position).getHeight1()+"");
        ((ViewHolder)holder).birthday.setText(F.get(position).getBirthday1()+"");
//        ((ViewHolder)holder).Country.setText(F.get(position).getCountry());
        ((ViewHolder)holder).player_photo.setImageResource(F.get(position).getImage1());



    }

    @Override
    public int getItemCount() {
        return F.size();



    }
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView name_player;
        //public TextView Country;
        public TextView tall;
        public TextView birthday;
        public ImageView player_photo;
        public View view;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);


            view = itemView ;
            name_player = itemView.findViewById(R.id.name12);
            tall = itemView.findViewById(R.id.tall);
            birthday = itemView.findViewById(R.id.textView9);
            player_photo = itemView.findViewById(R.id.player_image);


        }
    }
}