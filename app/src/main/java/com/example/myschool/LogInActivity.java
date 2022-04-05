package com.example.myschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LogInActivity extends AppCompatActivity {

    private EditText userName;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        userName = findViewById(R.id.userName);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(view -> {

            String user = userName.getText().toString().trim();

            if (user.equals("Ali")){
                startActivity(new Intent(getApplicationContext(), BusSupervisor.class));
            }else if (user.equals("Mohammed")){
                startActivity(new Intent(getApplicationContext(), ParentsSubUI.class));
            }else if (user.equals("Ahmed")){
                startActivity(new Intent(getApplicationContext(), Admin.class));
            }

        });

    }
}