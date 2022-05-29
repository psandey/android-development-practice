package com.example.a4ps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private  String[] questions={"Java is person?" , "Java was released in 1995?" , "Java has abstract classes" ,
            "Does Java support interfaces?"};
    private  boolean[] answers = {false,true,true,true};
    private  int score=0;
    private  int index=0;

    Button yes;
    Button no;
    TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes=findViewById(R.id.yes);
        no=findViewById(R.id.no);
        question=findViewById(R.id.question);
        question.setText(questions[index]);


        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // if the array is not going out of bounds
                if(index<=questions.length-1) {
                    // if you have given correct answer
                    if (answers[index] == true) {
                        score++;
                    }
                    index++;

                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);

                    } else {
                        Toast.makeText(MainActivity.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    Toast.makeText( MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }

            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // if the array is not going out of bounds
                if(index<=questions.length-1) {
                    // if you have given correct answer
                    if (answers[index] == false) {
                        score++;
                    }
                    index++;
                    if (index <= questions.length - 1) {
                        question.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    Toast.makeText( MainActivity.this, "Restart the app to play again", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}