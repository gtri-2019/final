package com.example.asliceofnutritionpie;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

/*        //to make profile questions open on first launch
        SharedPreferences preferences = getSharedPreferences("ActivityPREF", Context.MODE_PRIVATE);
        if (preferences.getBoolean("activity_executed",false)) {
            Intent goToLaunchQuestions = new Intent(this, launch_questions.class);
            startActivity(goToLaunchQuestions);
            finish();
        }
        else {
            SharedPreferences.Editor launchEditor = preferences.edit();
            launchEditor.putBoolean("activity_executed", true);
            launchEditor.commit();
        }*/

        setContentView(R.layout.activity_main);
        Button caloriesLeftTextButton = findViewById(R.id.caloriesLeftTextButton);
        int caloriesConsumed = 0;
        caloriesLeftTextButton.setText("Calories Left: " + (2000-caloriesConsumed));

    }

    //water bar (check to enable next cup, uncheck to disable and empty all following cups)
    public void water1Click (View view) {
            ToggleButton water1 = findViewById(R.id.water1Button);
            ToggleButton water2 = findViewById(R.id.water2Button);
            ToggleButton water3 = findViewById(R.id.water3Button);
            ToggleButton water4 = findViewById(R.id.water4Button);
            ToggleButton water5 = findViewById(R.id.water5Button);
            ToggleButton water6 = findViewById(R.id.water6Button);
            ToggleButton water7 = findViewById(R.id.water7Button);
//only click 2 if 1 is enabled
            if (water1.isChecked()) {
                water2.setEnabled(true);
            }
            //all cups are empty and disabled
            else {
                water2.setEnabled(false);
                water2.setChecked(false);
                water3.setChecked(false);
                water3.setEnabled(false);
                water4.setChecked(false);
                water4.setEnabled(false);
                water5.setChecked(false);
                water5.setEnabled(false);
                water6.setChecked(false);
                water6.setEnabled(false);
                water7.setChecked(false);
                water7.setEnabled(false);
            }
        }
    public void water2Click (View view){
            ToggleButton water2 = findViewById(R.id.water2Button);
            ToggleButton water3 = findViewById(R.id.water3Button);
            ToggleButton water4 = findViewById(R.id.water4Button);
            ToggleButton water5 = findViewById(R.id.water5Button);
            ToggleButton water6 = findViewById(R.id.water6Button);
            ToggleButton water7 = findViewById(R.id.water7Button);

            if (water2.isChecked()) {
                water3.setEnabled(true);
            } else {
                water3.setEnabled(false);
                water3.setChecked(false);
                water4.setChecked(false);
                water4.setEnabled(false);
                water5.setChecked(false);
                water5.setEnabled(false);
                water6.setChecked(false);
                water6.setEnabled(false);
                water7.setChecked(false);
                water7.setEnabled(false);
            }
        }
    public void water3Click (View view){
            ToggleButton water3 = findViewById(R.id.water3Button);
            ToggleButton water4 = findViewById(R.id.water4Button);
            ToggleButton water5 = findViewById(R.id.water5Button);
            ToggleButton water6 = findViewById(R.id.water6Button);
            ToggleButton water7 = findViewById(R.id.water7Button);

            if (water3.isChecked()) {
                water4.setEnabled(true);
            } else {
                water4.setEnabled(false);
                water4.setChecked(false);
                water5.setChecked(false);
                water5.setEnabled(false);
                water6.setChecked(false);
                water6.setEnabled(false);
                water7.setChecked(false);
                water7.setEnabled(false);
            }
        }
    public void water4Click (View view){
            ToggleButton water4 = findViewById(R.id.water4Button);
            ToggleButton water5 = findViewById(R.id.water5Button);
            ToggleButton water6 = findViewById(R.id.water6Button);
            ToggleButton water7 = findViewById(R.id.water7Button);

            if (water4.isChecked()) {
                water5.setEnabled(true);
            } else {
                water5.setEnabled(false);
                water5.setChecked(false);
                water6.setChecked(false);
                water6.setEnabled(false);
                water7.setChecked(false);
                water7.setEnabled(false);
            }
        }
    public void water5Click (View view){
            ToggleButton water5 = findViewById(R.id.water5Button);
            ToggleButton water6 = findViewById(R.id.water6Button);
            ToggleButton water7 = findViewById(R.id.water7Button);

            if (water5.isChecked()) {
                water6.setEnabled(true);
            } else {
                water6.setEnabled(false);
                water6.setChecked(false);
                water7.setChecked(false);
                water7.setEnabled(false);
            }
        }
    public void water6Click (View view){
            ToggleButton water1 = findViewById(R.id.water6Button);
            ToggleButton water2 = findViewById(R.id.water7Button);

            if (water1.isChecked()) {
                water2.setEnabled(true);
            } else {
                water2.setEnabled(false);
                water2.setChecked(false);
            }
        }



    //when you press add meal button, dialogue to choose meal appears
    public void chooseMealDialog (View view) {
        Dialog addMealDialog = new Dialog(context);
        addMealDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        addMealDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        addMealDialog.setContentView(R.layout.choose_meal_dialog);
        addMealDialog.setCanceledOnTouchOutside(true);
        addMealDialog.show();
    }
    //when you click a button to add a meal in popup, go to new activity that contains the search.
    public void goToSearchFoods(View view) {
        Intent goToSearchIntent = new Intent(this, search_page.class);
        startActivity(goToSearchIntent);}
    //go to corresponding page when you press an image button
    public void goToSettingsPage (View vie) {
        Intent goToSettingsIntent = new Intent(this, settings_page.class);
        startActivity(goToSettingsIntent); }
    public void goToProfilePage (View view) {
        Intent goToProfileIntent = new Intent(this, profile_page.class);
        startActivity(goToProfileIntent); }
    //go to data page when press "calories left"
    public void goToDataPage (View view) {
        Intent goToDataPageIntent = new Intent(this, data_display_page.class);
        startActivity(goToDataPageIntent);
    }

}