package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Csesem8Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Credits> creditsList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csesem8);

        recyclerView=findViewById(R.id.recyclerview);

        initData();
        setRecyclerView();
    }
    private void setRecyclerView() {
        CreditsAdapter creditsAdapter = new CreditsAdapter(creditsList);
        recyclerView.setAdapter(creditsAdapter);
        recyclerView.setHasFixedSize(true);
    }

    private void initData() {
        creditsList = new ArrayList<>();
        creditsList.add(new Credits("Elective-IV","123",""," "));
        creditsList.add(new Credits("Elective-V","123","","ehfewygre"));
        creditsList.add(new Credits("Open Elective-II","123","","ehfewygre"));
        creditsList.add(new Credits("PROJECT - III","123","","ehfewygre"));
    }
}