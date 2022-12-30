package com.example.pawan;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity6 extends AppCompatActivity {
    Button b1,b2,b3,b4;
    MediaPlayer mp;
    //Animantoo



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        b1=findViewById(R.id.maths);
        b2=findViewById(R.id.Physics);
        b3=findViewById(R.id.eee);
        b4=findViewById(R.id.me);
        Animation kk=AnimationUtils.loadAnimation(MainActivity6.this,R.anim.animation3);

        b1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                view.startAnimation(kk);
                Intent intent=new Intent(MainActivity6.this,MainActivity12.class);

                startActivity(intent);
                Animatoo.animateZoom(MainActivity6.this);
                mp= MediaPlayer.create(MainActivity6.this,R.raw.button);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mp.start();
                    }
                });
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mp.release();
                    }
                });
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                view.startAnimation(kk);

                Intent intent=new Intent(MainActivity6.this,MainActivity8.class);
                startActivity(intent);
                Animatoo.animateZoom(MainActivity6.this);
                mp= MediaPlayer.create(MainActivity6.this,R.raw.button);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mp.start();
                    }
                });
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mp.release();
                    }
                });
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {

            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {

                view.startAnimation(kk);
                Intent intent=new Intent(MainActivity6.this,MainActivity9.class);

                startActivity(intent);
                Animatoo.animateZoom(MainActivity6.this);
                mp= MediaPlayer.create(MainActivity6.this,R.raw.button);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mp.start();
                    }
                });
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mp.release();
                    }
                });
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                view.startAnimation(kk);

                Intent intent=new Intent(MainActivity6.this,MainActivity10.class);

                //Bundle b= ActivityOptions.makeSceneTransitionAnimation(MainActivity6.this).toBundle();
                startActivity(intent);
                Animatoo.animateZoom(MainActivity6.this);
                mp= MediaPlayer.create(MainActivity6.this,R.raw.button);
                mp.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                    @Override
                    public void onPrepared(MediaPlayer mediaPlayer) {
                        mp.start();
                    }
                });
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        mp.release();
                    }
                });
            }
        });
    }
}