package com.example.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class PlayerActivity extends AppCompatActivity {

    //Declaration of the objects present on the Player Screen

    TextView t1;
    Button b2;
    RadioButton r1,r2,r3,r4;
    public static String player;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
        t1 = (TextView)findViewById(R.id.textView2);
        b2 = (Button)findViewById(R.id.button2);
        r1 = (RadioButton)findViewById(R.id.radioButton);
        r2 = (RadioButton)findViewById(R.id.radioButton2);
        r3 = (RadioButton)findViewById(R.id.radioButton3);
        r4 = (RadioButton)findViewById(R.id.radioButton4);
        //Function to connect Flag screen with the player screen
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(r1.isChecked()){
                    player = r1.getText().toString();
                }
                if(r2.isChecked()){
                    player = r2.getText().toString();
                }
                if(r3.isChecked()){
                    player = r3.getText().toString();
                }
                if(r4.isChecked()){
                    player = r4.getText().toString();
                }
                Intent j = new Intent(PlayerActivity.this,FlagActivity.class);
                startActivity(j);
                finish();
            }
        });
    }
}