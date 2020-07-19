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

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);




        ImageView BACKBUTTON1;


        BACKBUTTON1 = findViewById(R.id.BACKBUTTON1);

        BACKBUTTON1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity5.this,loading_screen.class);
                startActivity(i);
            }

        });





        ArrayList<Gym2> anything = new ArrayList<>();
        Gym2 A1 = new Gym2("CODED Fitness","2015",R.drawable.coded,"it's free if you are a member of coded or kafs","Kuwait university Shwaikh Campus");
        Gym2 A2 = new Gym2("Oxgen","2002",R.drawable.kuwaitflage,"normal 10 kd pre month vip 20 KD per month +100 kd per year +vip 200 KD per year","mangaf");
        Gym2 A3 = new Gym2("Oxgen","2002",R.drawable.kuwaitflage,"10 kd pre month","mangaf");
        Gym2 A4 = new Gym2("Oxgen","2002",R.drawable.kuwaitflage,"10 kd pre month","mangaf");
        Gym2 A5 = new Gym2("Oxgen","2002",R.drawable.kuwaitflage,"10 kd pre month","mangaf");




        anything.add(A1);
        anything.add(A2);
        anything.add(A3);
        anything.add(A4);
        anything.add(A5);

        RecyclerView C = findViewById(R.id.Ma1);
        C.setHasFixedSize(true);

        RecyclerView.LayoutManager ln1 = new LinearLayoutManager(this);
        C.setLayoutManager(ln1);


        gym2adaptor adpterG1 = new gym2adaptor (anything,this);
        C.setAdapter(adpterG1);





    }
}