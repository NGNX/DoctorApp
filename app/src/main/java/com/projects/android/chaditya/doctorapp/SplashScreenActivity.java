package com.projects.android.chaditya.doctorapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;

import com.projects.android.chaditya.doctorapp.constants.DoctorAppPreferences;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        int SPLASH_TIME_OUT_MILLISECONDS = 3000;

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                // This method will be executed once the timer is over

                SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                Intent intent;
                if(sharedPreferences.getBoolean(DoctorAppPreferences.IS_LOGGED_IN,false)){
                    if(sharedPreferences.getBoolean(DoctorAppPreferences.IS_LOCATION_PRESENT,false)){
                        intent = new Intent(SplashScreenActivity.this,MainActivity.class);
                    }else{
                        intent = new Intent(SplashScreenActivity.this,LocationActivity.class);
                    }
                }else{
                    intent = new Intent(SplashScreenActivity.this,LoginActivity.class);
                }
                startActivity(intent);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT_MILLISECONDS);
    }

}