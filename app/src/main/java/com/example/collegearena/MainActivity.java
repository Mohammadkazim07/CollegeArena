package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.QuickContactBadge;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGridLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGridLayout= (GridLayout) findViewById(R.id.mainGridLayout);
        setSingleEvent(mainGridLayout);
    }

    private void setSingleEvent(GridLayout mainGridLayout) {
        for (int i=0;i<mainGridLayout.getChildCount();i++)
        {
            CardView cardView =(CardView)mainGridLayout.getChildAt(i);
            final int finali = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finali==0)
                    {
                        Intent intent = new Intent(MainActivity.this,GateActivity.class);
                        startActivity(intent);
                    }
                    else if(finali==1)
                    {
                        Intent intent = new Intent(MainActivity.this,ResultActivity.class);
                        startActivity(intent);
                    }
                    else if(finali==2)
                    {
                        Intent intent = new Intent(MainActivity.this,EngineeringActivity.class);
                        startActivity(intent);
                    }
                    else if(finali==3)
                    {
                        Intent intent = new Intent(MainActivity.this,MedicalActivity.class);
                        startActivity(intent);
                    }
                    else if(finali==4)
                    {
                        Intent intent = new Intent(MainActivity.this,SyllabusActivity.class);
                        startActivity(intent);
                    }
                    else if(finali==5)
                    {
                        Intent intent = new Intent(MainActivity.this,HolidayActivity.class);
                        startActivity(intent);
                    }
                    else if(finali==6)
                    {
                        Intent intent = new Intent(MainActivity.this,TopCollegeActivity.class);
                        startActivity(intent);
                    }
                    else if(finali==7)
                    {
                        Intent intent = new Intent(MainActivity.this,IesActivity.class);
                        startActivity(intent);
                    }
                    else if(finali==8)
                    {
                        Intent intent = new Intent(MainActivity.this,JobsActivity.class);
                        startActivity(intent);
                    }
                    else if(finali==9)
                    {
                        Intent intent = new Intent(MainActivity.this,DeveloperActivity.class);
                        startActivity(intent);
                    }
                }
            });
        }
    }


}