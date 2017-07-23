package com.corfoarte.victorcastro.corpoarte;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SplashScreenActivity extends AppCompatActivity {
    private static final long SPLASH_SCREEN_DELAY = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        Thread timerTread = new Thread() {
            public void run() {
                try {
                    //branch produccion
                    sleep(1650);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashScreenActivity.this, LoginActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerTread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}
