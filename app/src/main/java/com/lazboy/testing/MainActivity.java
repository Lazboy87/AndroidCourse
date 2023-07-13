package com.lazboy.testing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textViewTest;
    Button settingBtn;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInit();
    }

    private void btnInit() {
        textViewTest = (TextView) findViewById(R.id.textviewTest);
        settingBtn = (Button) findViewById(R.id.button_settings);


        settingBtn.setOnClickListener(this);
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
    public void onBackPressed() {
      setContentView(R.layout.activity_main);
      btnInit();
    }

    @Override
    public void onClick(View v) {
        if (v.getId()== R.id.textviewTest){
            changeTextColor();

        } else if (v.getId() == R.id.button_settings) {
            toSettingsPage();
        }


    }

    private void toSettingsPage() {
        try {

        setContentView(R.layout.fragment_settings);

        }catch (Exception e){
            Log.d("fragment",e.getMessage());
        }


    }
}