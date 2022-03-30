package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EcecolActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ececol);

        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btn1:
                Intent i  = new Intent(EcecolActivity.this,EceprevsylActivity.class);
                startActivity(i);
                break;

            case R.id.btn2:
                Intent o  = new Intent(EcecolActivity.this,EceprevqueActivity.class);
                startActivity(o);
                break;

        }
    }
}