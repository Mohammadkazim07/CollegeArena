package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class GatemesylActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gatemesyl);

        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("megatesyl.pdf").load();
    }
}