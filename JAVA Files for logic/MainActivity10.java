package com.example.pawan;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity10 extends AppCompatActivity {
    String a[]={"ELECTRIC CIRCUIT -C.ALEXANDER AND SADIKU"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        listView=findViewById(R.id.listview);
        ArrayAdapter<String> ad=new ArrayAdapter(MainActivity10.this, android.R.layout.simple_list_item_1,a);
        listView.setAdapter(ad);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    final MediaPlayer mp=MediaPlayer.create(MainActivity10.this,R.raw.button);
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
                    Intent intent=new Intent(MainActivity10.this,MainActivity11.class);

                    startActivity(intent);
                    Animatoo.animateZoom(MainActivity10.this);
                    Toast.makeText(MainActivity10.this, "Alexander is opening", Toast.LENGTH_SHORT).show();

                }

            }
        });

    }
}