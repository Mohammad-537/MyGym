package com.example.mygym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView SC;


        SC = findViewById(R.id.sc);

        SC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();

            }
        });








        Bundle v = getIntent().getExtras();
        Game mmm = (Game) v.getSerializable("hi");

        TextView since = findViewById(R.id.name1);





        since.setText(mmm.getGameType());






                ArrayList<game_type> Ahmad = new ArrayList<>();
        game_type A = new game_type("karate",R.drawable.fighter, "نقبل جميع الأعمار في لعبة الكراتيه لكن نفضل لاعبين أعمارهم من 13 وتحت لأنهم أبطال هذا الجيل ويجب أن يكون لديهم فحص طبي لكي نأمن على سلامتكم.");
        game_type A1 = new game_type("boxing",R.drawable.kickboxing,"HI any thing");
        game_type A2 = new game_type("kickboxing",R.drawable.kickboxing,"hello world pleas stop hahaha");
        game_type A3 = new game_type("boxing",R.drawable.fighter,"coded for love");
        game_type A4 = new game_type("judo",R.drawable.fight,"say hi to the boss");

        Ahmad.add(A);
        Ahmad.add(A1);
        Ahmad.add(A2);
        Ahmad.add(A3);
        Ahmad.add(A4);


        RecyclerView Ba = findViewById(R.id.RecyclerView);
        Ba.setHasFixedSize(true);

        RecyclerView.LayoutManager ln1 = new LinearLayoutManager(this);
        Ba.setLayoutManager(ln1);

        Game_Type_adapter adpterG = new Game_Type_adapter(Ahmad,this);
        Ba.setAdapter(adpterG);












    }
}