package com.example.sharedpreference;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        textView = findViewById(R.id.ConstraintLayout);
        button= findViewById(R.id.button);


        SharedPreferences sp= getSharedPreferences("MyPref",MODE_PRIVATE);
        String editvalue;
        editvalue = sp.getString("name","no value as of now");
        textView.setText(editvalue);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val = editText.getText().toString();
                SharedPreferences sp= getSharedPreferences("myPref",MODE_PRIVATE);
                SharedPreferences.Editor ed=sp.edit();
                ed.putString("name",val);
                ed.apply();
                textView.setText(val);
            }
        });




    }
}