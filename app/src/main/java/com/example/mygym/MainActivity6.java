package com.example.mygym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        ImageView BACKBUTTON;


        BACKBUTTON = findViewById(R.id.BACKBUTTON);

        BACKBUTTON.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity6.this,MainActivity5.class);
                startActivity(i);
            }

        });




        Bundle v = getIntent().getExtras();
        Gym2 M10 = (Gym2) v.getSerializable("gym2");

        TextView howtojoin = findViewById(R.id.textView30);
        TextView location = findViewById(R.id.textView40);
        TextView name = findViewById(R.id.name10);
        ImageView image = findViewById(R.id.IV3);


        howtojoin.setText(M10.getHowtojoin());
        location.setText(M10.getLocation());
        name.setText(M10.getClub_name());
        image.setImageResource(M10.getImage());

    }
}