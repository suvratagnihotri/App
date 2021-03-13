package com.example.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinalActivity extends AppCompatActivity {
    Button b4,b5;
    TextView t4,t5,t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        t4 = (TextView)findViewById(R.id.textView3);
        t5 = (TextView)findViewById(R.id.textView5);
        t6 = (TextView)findViewById(R.id.textView6);
        t4.setText("Hello :" + MainActivity.name);
        t5.setText("Ans : " + PlayerActivity.player);
        t6.setText("Ans" + FlagActivity.color);
        //Function to Open the History page by clicking on the History Button.
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(FinalActivity.this,HistoryActivity.class);
                startActivity(l);
                finish();
            }
        });

        //Function to open the First Page again by clicking on the Finish Button.

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(FinalActivity.this,MainActivity.class);
                startActivity(l);
                finish();
            }
        });
    }
}