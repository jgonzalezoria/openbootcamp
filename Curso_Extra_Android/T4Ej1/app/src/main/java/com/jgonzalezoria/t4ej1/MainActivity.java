package com.jgonzalezoria.t4ej1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void mostrarWweb(View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.imaginaformacion.com"));

        startActivity(i);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}