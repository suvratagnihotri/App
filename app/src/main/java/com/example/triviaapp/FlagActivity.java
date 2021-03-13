package com.example.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import java.util.Date;

public class FlagActivity extends AppCompatActivity {
    //Declaration of the objects present on the Flag Screen.
    RadioButton r5,r6,r7,r8;
    Button b3;
    public static String color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag);
        r5 = (RadioButton)findViewById(R.id.radioButton5);
        r6 = (RadioButton)findViewById(R.id.radioButton6);
        r7 = (RadioButton)findViewById(R.id.radioButton7);
        r8 = (RadioButton)findViewById(R.id.radioButton8);
        b3 = (Button)findViewById(R.id.button3);
        color = r5.getText().toString() +","+r6.getText().toString() +","+r7.getText().toString();
        //function to connect Final Screen with the present screen with button click.
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(FlagActivity.this,FinalActivity.class);
                startActivity(k);
                finish();
            }
        });
    }
}