package com.jgonzalezoria.t2ej1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;

import com.devspark.appmsg.AppMsg;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "DEBUG T2Ej1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d(TAG, "Llamado onStart()");
        AppMsg.makeText(this, "Funciona", AppMsg.STYLE_INFO).show();
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "Llamado onPause()");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "Llamado onStop()");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "Llamado onDestroy()");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "Llamado onResume()");
    }
}