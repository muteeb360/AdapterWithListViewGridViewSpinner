package com.example.lbtsk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ListView ls = new ListView(this,findViewById(R.id.list));
        ListAdapter ad = new ArrayAdapter<>(this, R.layout.activity_main, getResources().getStringArray(R.array.data));
       ls.setAdapter(ad);
    }
}