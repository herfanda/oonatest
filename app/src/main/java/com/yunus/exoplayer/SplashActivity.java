package com.yunus.exoplayer;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.yunus.oonatest.R;


public class SplashActivity extends AppCompatActivity {

    private int loadingSplash = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mIntent = ExoPlayerActivity.getStartIntent(getApplicationContext(), VideoPlayerConfig.DEFAULT_VIDEO_URL);
                startActivity(mIntent);
            }
        },loadingSplash);

    }
}
