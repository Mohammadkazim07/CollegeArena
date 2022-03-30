package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GatePreviousYearActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gate_previous_year);

        Button button1 = findViewById(R.id.btn1);
        Button button2 = findViewById(R.id.btn2);
        Button button3 = findViewById(R.id.btn3);
        Button button4 = findViewById(R.id.btn4);
        Button button5 = findViewById(R.id.btn5);
        Button button6 = findViewById(R.id.btn6);
        Button button7 = findViewById(R.id.btn7);
        Button button8 = findViewById(R.id.btn8);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn1:
                Intent i  = new Intent(GatePreviousYearActivity.this,GatecsitsylActivity.class);
                startActivity(i);
                break;

            case R.id.btn2:
                Intent o  = new Intent(GatePreviousYearActivity.this,EceActivity.class);
                startActivity(o);
                break;

            case R.id.btn3:
                Intent a  = new Intent(GatePreviousYearActivity.this,GatemesylActivity.class);
                startActivity(a);
                break;

            case R.id.btn4:
                Intent b  = new Intent(GatePreviousYearActivity.this,GatecesylActivity.class);
                startActivity(b);
                break;

            case R.id.btn5:
                Intent c  = new Intent(GatePreviousYearActivity.this,GateeesylActivity.class);
                startActivity(c);
                break;

            case R.id.btn6:
                Intent d = new Intent(GatePreviousYearActivity.this,GatechsylActivity.class);
                startActivity(d);
                break;
        }
    }
}