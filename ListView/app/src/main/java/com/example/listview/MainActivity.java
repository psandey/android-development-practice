package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    String arr[]={"Apple","Ball","Cat","Dog","Elephant","Fish","Goal","Height","Ice cream","Joker","Knight"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);

        //Using Built-in adapter
        //ArrayAdapter ad= new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        //listView.setAdapter(ad);

        //Using custom adapter
        ShubhamAdapter ad =new ShubhamAdapter(this,R.layout.my_shubham_layout,arr);
        listView.setAdapter(ad);

        //Listener on arrayAdapter ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Just clicked on item number : "+i, Toast.LENGTH_SHORT).show();
            }
        });
    }
}