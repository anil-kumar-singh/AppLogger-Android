package com.aks.applogger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aks.log.AppLogger;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppLogger.d(TAG, "this is debug msg");
        AppLogger.e(TAG, "this is error msg");
        AppLogger.i(TAG, "this is info msg");
    }
}
