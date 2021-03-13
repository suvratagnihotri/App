package com.example.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class HistoryActivity extends AppCompatActivity {
    TextView t7,t8,t9,t10;
    Button b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        t7 = (TextView)findViewById(R.id.textView7);
        t8 = (TextView)findViewById(R.id.textView8);
        t9 = (TextView)findViewById(R.id.textView9);
        t10 = (TextView)findViewById(R.id.textView10);
        b6 = (Button)findViewById(R.id.button6);
        Date date = new Date();
        t10.setText(date.toString());
        t7.setText(MainActivity.name);
        t8.setText(PlayerActivity.player);
        t9.setText(FlagActivity.color);

        //Function to open the Final Activity again by clicking back button on History Screen.

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(HistoryActivity.this,FinalActivity.class);
                startActivity(m);
                finish();
            }
        });
    }
}