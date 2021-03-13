package com.example.triviaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //Declaration of the objects present on the main screen.
    Button b1;
    EditText editText;

    public static String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initialising the objects present on the main activity.
        editText = (EditText)findViewById(R.id.name);
        b1 = (Button)findViewById(R.id.button);
        //By clicking next button it opens the next activity.
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = editText.getText().toString();
                Intent i = new Intent(MainActivity.this,PlayerActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
}