package com.example.android.crossfit;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class six extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);
    }

    /**
     * This method is called when the advice button is clicked.
     * It defines has been CheckBox checked or not, and depending on the results shows different information on the pop-up window on the computer screen.
     */

    public void onMyButtonClick(View view) {

        CheckBox yesCheckBox = (CheckBox) findViewById(R.id.yes_checkbox);
        if (yesCheckBox.isChecked()) {
            Toast.makeText(this, "Choose the Program 1", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Choose the Program 2", Toast.LENGTH_SHORT).show();
        }
    }
}
