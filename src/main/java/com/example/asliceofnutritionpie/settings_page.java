package com.example.asliceofnutritionpie;


import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class settings_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);
    }

    public void backToMainScreen (View view) {
        finish();
/*    Intent backToMainIntent = new Intent(this, MainActivity.class);
    startActivity (backToMainIntent);*/
    }

    public void goToHelp (View view) {
        final Dialog goToHelpDialog = new Dialog(this);
        goToHelpDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        goToHelpDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        goToHelpDialog.setContentView(R.layout.help_dialog);
        goToHelpDialog.setCanceledOnTouchOutside(true);
        goToHelpDialog.show();
        goToHelpDialog.setCancelable(true);


    }
}
