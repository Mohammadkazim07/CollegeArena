package com.example.collegearena;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

public class MtechActivity extends AppCompatActivity {
    private TextView text1;
    private PDFView pdfView;
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference("mtech");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mtech);
        pdfView=(PDFView) findViewById(R.id.pdfview);
        text1=(TextView) findViewById(R.id.text1);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                String value = dataSnapshot.getValue(String.class);
                text1.setText(value);
                Toast.makeText(MtechActivity.this, "Updated", Toast.LENGTH_SHORT).show();
                String url=text1.getText().toString();
                new RetrivePdfStream().execute(url);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Toast.makeText(MtechActivity.this, "Failed", Toast.LENGTH_SHORT).show();
            }
        });}
        class RetrivePdfStream extends AsyncTask<String,Void, InputStream>{

            @Override
            protected InputStream doInBackground(String... strings) {
                InputStream inputStream=null;
                try{
                    URL url = new URL (strings[0]);
                    HttpURLConnection urlConnection= (HttpURLConnection) url.openConnection();
                    if(urlConnection.getResponseCode()==200)
                    {
                        inputStream=new BufferedInputStream(urlConnection.getInputStream());

                    }
                }
                catch (IOException e) {
                    return null;
                }
                return inputStream;
            }

            @Override
            protected void onPostExecute(InputStream inputStream) {
                pdfView.fromStream(inputStream).load();
            }
        }
    }
