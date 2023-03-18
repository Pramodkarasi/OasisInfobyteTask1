package com.example.oasisinfobytetask1;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView cv_tmp;
    CardView cv_weight;
    CardView cv_length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv_tmp = findViewById(R.id.cv_tmp);
        cv_weight = findViewById(R.id.cv_weight);
        cv_length = findViewById(R.id.cv_length);


        cv_tmp.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, temp_cal.class)));
        cv_weight.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, weight_cal.class)));
        cv_length.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, length_cal.class)));


    }
}