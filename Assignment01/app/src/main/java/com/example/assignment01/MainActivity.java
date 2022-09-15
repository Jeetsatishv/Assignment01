package com.example.assignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text01;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text01 = findViewById(R.id.textView);
        text01.setText("< Text Goes Here >");
    }

    public void clickButton1 (View x) {
        text01.setText("Hello World");



    }
}