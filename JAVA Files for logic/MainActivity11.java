package com.example.pawan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

public class MainActivity11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);
        PDFView pdfView=(PDFView) findViewById(R.id.pdf);
        pdfView.fromAsset("alexander.pdf")
                .enableSwipe(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .load();
    }
}