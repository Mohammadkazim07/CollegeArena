package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GateSyllabusActivity extends  AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gate_syllabus);

        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);
        Button button5 = findViewById(R.id.btn5);
        Button button6 = findViewById(R.id.btn6);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                Intent i  = new Intent(GateSyllabusActivity.this,GatecsitsylActivity.class);
                startActivity(i);
                break;

            case R.id.btn2:
                Intent o  = new Intent(GateSyllabusActivity.this,GateecesylActivity.class);
                startActivity(o);
                break;

            case R.id.btn3:
                Intent a  = new Intent(GateSyllabusActivity.this,GatemesylActivity.class);
                startActivity(a);
                break;

            case R.id.btn4:
                Intent b  = new Intent(GateSyllabusActivity.this,GatecesylActivity.class);
                startActivity(b);
                break;

            case R.id.btn5:
                Intent c  = new Intent(GateSyllabusActivity.this,GateeesylActivity.class);
                startActivity(c);
                break;

            case R.id.btn6:
                Intent d = new Intent(GateSyllabusActivity.this,GatechsylActivity.class);
                startActivity(d);
                break;
        }
    }
}