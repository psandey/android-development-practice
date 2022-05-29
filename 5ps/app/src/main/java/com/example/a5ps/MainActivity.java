package com.example.a5ps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact c1=new Contact(1,"9343622220","Shubham");
    Contact c2=new Contact(1,"9342320630","Shubham");
    Contact c3=new Contact(1,"8653622220","Shubham");
    Contact c4=new Contact(1,"9343552220","Shubham");
    Contact c5=new Contact(1,"9315252220","Shubham");
    Contact c6=new Contact(1,"9343653720","Shubham");
    Contact c7=new Contact(1,"9343252520","Shubham");
    Contact c8=new Contact(1,"9343622220","Shubham");
    Contact c9=new Contact(1,"9343622220","Shubham");
    Contact c10=new Contact(1,"9343689320","Shubham");
    Contact c11=new Contact(1,"9343622442","Shubham");
    Contact c12=new Contact(1,"9342872520","Shubham");
    Contact c13=new Contact(1,"9352522220","Shubham");
    Contact c14=new Contact(1,"9343424770","Shubham");
    Contact[] contacts={c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView =findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager((this)));
        CustomAdapter ad=new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}