package com.example.android_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button MyButton = findViewById(R.id.MyButton);
        MyButton.setOnClickListener(v -> {
            // Create a toasts telling the user he is gay
            Toast.makeText(MainActivity.this, "You are Gay", Toast.LENGTH_SHORT).show();
        });

    }
}