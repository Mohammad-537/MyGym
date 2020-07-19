package com.example.mygym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ImageView SC1;

        SC1 = findViewById(R.id.imageView2);

        SC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });

        Bundle v = getIntent().getExtras();
        game_type mm = (game_type) v.getSerializable("hi1");


        TextView RMTS = findViewById(R.id.TV);
        TextView name = findViewById(R.id.TV1);



        RMTS.setText(mm.getRequierments());
        name.setText(mm.getGame_type());

        ArrayList<player> players = new ArrayList<>();
        player P = new player("Omar","180","2/9/1996","kuwait",R.drawable.omar);
        player P1 = new player("Ahmad","170","11/5/2003","kuwait",R.drawable.ahmad);
        player P2 = new player("mohammad","170","18/10/2002","kuwait",R.drawable.me);
        player P3 = new player("hamad","170","29/3/2003","kuwait",R.drawable.hammad);
        player P4 = new player("majed","167","18/10/2002","kuwait",R.drawable.majed);
        player P5 = new player("saad king knafa","202","19/9/1999","kuwait",R.drawable.saad);
        player P6 = new player("Abdulaziz","170","15/3/2005","kuwait",R.drawable.abdalaziz);


        players.add(P);
        players.add(P1);
        players.add(P2);
        players.add(P3);
        players.add(P4);
        players.add(P5);
        players.add(P6);


        RecyclerView Ba1 = findViewById(R.id.RV);
        Ba1.setHasFixedSize(true);

        RecyclerView.LayoutManager ln1 = new LinearLayoutManager(this);
        Ba1.setLayoutManager(ln1);

        playerAdapter adpterG1 = new playerAdapter (players,this);
        Ba1.setAdapter(adpterG1);








    }
}