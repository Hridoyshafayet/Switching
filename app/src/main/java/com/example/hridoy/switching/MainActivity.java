package com.example.hridoy.switching;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button switching_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        switching_btn = findViewById(R.id.switching_btn);


        switching_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent switchingIntent = new Intent(MainActivity.this,AnotherActivity.class);
                startActivity(switchingIntent);

            }
        });


    }
}
