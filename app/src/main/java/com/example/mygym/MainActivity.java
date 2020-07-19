package com.example.mygym;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.os.Handler;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Handler Handler = new Handler(getMainLooper());
        final Runnable r =new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this,loading_screen.class);
                startActivity(i);
            }

        };

           Handler.postDelayed(r,1000);


    }
}