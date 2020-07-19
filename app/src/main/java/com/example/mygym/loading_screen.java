package com.example.mygym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class loading_screen extends AppCompatActivity {

    ImageView N1;
    ImageView N2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        N1 = findViewById(R.id.N1);

        N1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(loading_screen.this,gym1.class);
                startActivity(i);
            }
        });

        N2 = findViewById(R.id.N2);

        N2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(loading_screen.this,MainActivity5.class);
                startActivity(i1);
            }
        });




    }
}