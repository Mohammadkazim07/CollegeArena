package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EceprevsylActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eceprevsyl);

        Button button1= findViewById(R.id.btn1);
        Button button2= findViewById(R.id.btn2);
        Button button3= findViewById(R.id.btn3);
        Button button4= findViewById(R.id.btn4);
        Button button5= findViewById(R.id.btn5);
        Button button6= findViewById(R.id.btn6);
        Button button7= findViewById(R.id.btn7);
        Button button8= findViewById(R.id.btn8);

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
                Intent i  = new Intent(EceprevsylActivity.this,Ecesem1sylActivity.class);
                startActivity(i);
                break;

            case R.id.btn2:
                Intent o  = new Intent(EceprevsylActivity.this,Ecesem2sylActivity.class);
                startActivity(o);
                break;
            case R.id.btn3:
                Intent a  = new Intent(EceprevsylActivity.this,Ecesem3sylActivity.class);
                startActivity(a);
                break;

            case R.id.btn4:
                Intent b  = new Intent(EceprevsylActivity.this,Ecesem4sylActivity.class);
                startActivity(b);
                break;
            case R.id.btn5:
                Intent c  = new Intent(EceprevsylActivity.this,Ecesem5sylActivity.class);
                startActivity(c);
                break;

            case R.id.btn6:
                Intent d  = new Intent(EceprevsylActivity.this,Ecesem6sylActivity.class);
                startActivity(d);
                break;
            case R.id.btn7:
                Intent e  = new Intent(EceprevsylActivity.this,Ecesem7sylActivity.class);
                startActivity(e);
                break;

            case R.id.btn8:
                Intent f  = new Intent(EceprevsylActivity.this,Ecesem8sylActivity.class);
                startActivity(f);
                break;
        }

    }
}