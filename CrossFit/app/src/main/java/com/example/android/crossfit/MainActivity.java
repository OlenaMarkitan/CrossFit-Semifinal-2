package com.example.android.crossfit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the tabata button is clicked.
     */
    public void goToTabata(View view) {
        goToUrl("http://www.tabatatimer.com/");
    }

    /**
     * It re-address by the URL in order to watch the video.
     */
    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    /**
     * This method is called when the program button is clicked.
     */
    public void onButtonClickProgram(View v) {
        if (v.getId() == R.id.Program) {
            Intent o = new Intent(MainActivity.this, six.class);
            startActivity(o);
        }

    }

    /**
     * This method is called when the  button 1 is clicked.
     */
    public void onButtonClick1(View v) {
        if (v.getId() == R.id.Button1) {
            Intent i = new Intent(MainActivity.this, first.class);
            startActivity(i);
        }
    }

    /**
     * This method is called when the  button 2 is clicked.
     */

    public void onButtonClick2(View v) {
        if (v.getId() == R.id.Button2) {
            Intent d = new Intent(MainActivity.this, second.class);
            startActivity(d);
        }
    }

    /**
     * This method is called when the  button 3 is clicked.
     */
    public void onButtonClick3(View v) {
        if (v.getId() == R.id.Button3) {
            Intent t = new Intent(MainActivity.this, third.class);
            startActivity(t);
        }
    }

    /**
     * This method is called when the  button 4 is clicked.
     */
    public void onButtonClick4(View v) {
        if (v.getId() == R.id.Button4) {
            Intent h = new Intent(MainActivity.this, fourth.class);
            startActivity(h);
        }
    }

    /**
     * This method is called when the  button 5 is clicked.
     */
    public void onButtonClick5(View v) {
        if (v.getId() == R.id.Button5) {
            Intent k = new Intent(MainActivity.this, fifth.class);
            startActivity(k);
        }
    }
}
