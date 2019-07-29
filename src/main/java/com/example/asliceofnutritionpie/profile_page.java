package com.example.asliceofnutritionpie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class profile_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
    }
    public void backToMainScreen (View view) {
        finish();
        /*Intent backToMainIntent = new Intent(this, MainActivity.class);
        startActivity (backToMainIntent);*/
    }
}
