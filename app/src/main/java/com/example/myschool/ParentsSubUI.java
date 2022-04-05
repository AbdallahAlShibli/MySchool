package com.example.myschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ParentsSubUI extends AppCompatActivity {

    private Button c1, c2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parents_sub_ui);

        c1 = findViewById(R.id.c1);
        c2 = findViewById(R.id.c2);

        c1.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), ParentsPage.class));
        });
        c2.setOnClickListener(view -> {
            startActivity(new Intent(getApplicationContext(), ParentsPage.class));
        });

    }
}