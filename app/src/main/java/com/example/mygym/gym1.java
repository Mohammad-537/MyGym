package com.example.mygym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.Filter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class gym1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym1);

        ImageView N1;
        ImageView search;
        EditText search_button2;

        N1 = findViewById(R.id.imageView2);

        N1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(gym1.this,loading_screen.class);
                startActivity(i);
            }
        });




//        EditText search_button = findViewById(R.id.search_button2);
//        search_button.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                Filter(s.toString());
//
//            }
//        });
//        private void Filter(String text) {
//            ArrayList<Gym> filterlist = new ArrayList<>();
//
//        }











        ArrayList<Gym> Mohammad = new ArrayList<>();
        Gym M = new Gym("Al-Arabi SC","1960",R.drawable.alarbie);
        Gym M1 = new Gym("kuwait club","1960",R.drawable.kuwaitflage);
        Gym M2 = new Gym("kuwait club","1960",R.drawable.kuwaitflage);
        Gym M3 = new Gym("kuwait club","1960",R.drawable.kuwaitflage);
        Gym M4 = new Gym("kuwait club","1960",R.drawable.kuwaitflage);
        Gym M5 = new Gym("kuwait club","1960",R.drawable.kuwaitflage);



        Mohammad.add(M);
        Mohammad.add(M1);
        Mohammad.add(M2);
        Mohammad.add(M3);
        Mohammad.add(M4);
        Mohammad.add(M5);

        RecyclerView A = findViewById(R.id.Ma);
        A.setHasFixedSize(true);

        RecyclerView.LayoutManager ln = new LinearLayoutManager(this);
        A.setLayoutManager(ln);
        gymadaptor adapterM = new gymadaptor(Mohammad , this);
        A.setAdapter(adapterM);





                }

                }