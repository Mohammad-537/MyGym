package com.example.mygym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView N2;


        N2 = findViewById(R.id.imageView2);

        N2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,gym1.class);
                startActivity(i);
            }

        });

        Bundle v = getIntent().getExtras();
        Gym mm = (Gym) v.getSerializable("club1");

        TextView since = findViewById(R.id.N4);
        TextView club = findViewById(R.id.N13);
        ImageView mmm = findViewById(R.id.N3);


        since.setText(mm.getSince());
        club.setText(mm.getClub_name()+"");
        mmm.setImageResource(mm.getImage());

        ArrayList<Game> Sara = new ArrayList<>();
        Game S1 = new Game("Combat",R.drawable.sword);
        Game S2 = new Game("Group",R.drawable.team);
        Game S3 = new Game("Strong",R.drawable.strong);

        Sara.add(S1);
        Sara.add(S2);
        Sara.add(S3);

        RecyclerView Ba = findViewById(R.id.R1);
        Ba.setHasFixedSize(true);

        RecyclerView.LayoutManager ln1 = new LinearLayoutManager(this);
        Ba.setLayoutManager(ln1);


        game_adapter adapterM1 = new game_adapter(Sara , this);
        Ba.setAdapter(adapterM1);




    }
}