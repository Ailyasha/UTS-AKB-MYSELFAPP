package com.example.ailyashaapp;

//29 May 2021
//10118070
//Aufa Ilyasha
//IF-2

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splah_screen);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), Home.class));
                finish();
            }
        }, 3000L); //3000 L = 3 detik
    }
}