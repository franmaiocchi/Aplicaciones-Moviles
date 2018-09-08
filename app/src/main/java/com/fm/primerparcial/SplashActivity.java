package com.fm.primerparcial;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends Activity
{
    private static final long SPLASH_SCREEN_DELAY = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);

        TimerTask task = new TimerTask()
        {
            @Override
            public void run()
            {
                Intent loginIntent = new Intent().setClass(SplashActivity.this, LogInActivity.class);
                startActivity(loginIntent);
                finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(task, SPLASH_SCREEN_DELAY);
    }
}
