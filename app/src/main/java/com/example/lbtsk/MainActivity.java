package com.example.lbtsk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] months = {"Jan","feb","march","april","may"};

        //---------->setting default adapter

        //fetched adapter views from layout file
        ListView listView = findViewById(R.id.list);
        GridView grd = findViewById(R.id.grid);
        Spinner spn = findViewById(R.id.spin);

        //initialized adapters
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.data));
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, months);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, months);

        //set up adapters with respective adapter views
        listView.setAdapter(adapter);
        grd.setAdapter(adapter2);
        spn.setAdapter(adapter3);


    }
}