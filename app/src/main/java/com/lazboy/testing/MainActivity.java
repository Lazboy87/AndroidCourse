package com.lazboy.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewTest;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTest = (TextView) findViewById(R.id.textviewTest);

        textViewTest.setOnClickListener(this);
    }

    private void changeTextColor(){
        if(textViewTest.getCurrentTextColor() == getColor(R.color.green)){
            textViewTest.setTextColor(getColor(R.color.white));
        }else {
        textViewTest.setTextColor(getColor(R.color.green));
        }
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.textviewTest){
            changeTextColor();
        }
    }
}