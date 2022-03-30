package com.example.collegearena;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Ecesem7sylActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Credits> creditsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecesem7syl);
        recyclerView = findViewById(R.id.recyclerview);

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
        creditsList.add(new Credits("ANALOG ELECTRONICS CIRCUITS", "L:3 T:0 P:4 Credits:5", "", ""));
        creditsList.add(new Credits("ANALOG ELECTRONICS CIRCUITS", "L:3 T:0 P:4 Credits:5", "", ""));
        creditsList.add(new Credits("ANALOG ELECTRONICS CIRCUITS", "L:3 T:0 P:4 Credits:5", "", ""));
        creditsList.add(new Credits("ANALOG ELECTRONICS CIRCUITS", "L:3 T:0 P:4 Credits:5", "", ""));
    }
}