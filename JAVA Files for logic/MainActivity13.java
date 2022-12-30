package com.example.pawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity13 extends AppCompatActivity {
    private  static int SPLASH_SCREEN=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(MainActivity13.this,MainActivity6.class);
                startActivity(i);
                finish();
            }
        },SPLASH_SCREEN);
    }
}