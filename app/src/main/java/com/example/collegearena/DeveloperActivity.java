package com.example.collegearena;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class DeveloperActivity extends AppCompatActivity {
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
        text=findViewById(R.id.text);
        text.setText("Name - Mohammad Kazim\n" +
                "Group Members - Mohammad Adnan and Sadique Nasim\n\n" +
                "Motive of this app is to provide a platform for all AKU Students, where they use all the resources and shares among them and build a strong community among themselves\n\n" +
                "Contact Us\n" +
                "mohammadkazim07@gmail.com");
        String[] para = text.getText().toString().split("\r\n\r\n");
        //Toast.makeText(DeveloperActivity.this, "" + para.length, Toast.LENGTH_LONG).show();
    }
}