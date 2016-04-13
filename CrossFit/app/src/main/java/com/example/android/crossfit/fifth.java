package com.example.android.crossfit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fifth extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
    }

    /**
     * This method is called when the video button is clicked.
     */

    public void goToVideo(View view) {
        goToUrl("https://www.youtube.com/watch?v=rg0f_LYhqQA");
    }

    /**
     * It re-address by the URL in order to watch the video.
     */
    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);

    }
}
