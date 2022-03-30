package com.example.webviewapp;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        String toast_thing = "nämennn";
        int test_tal = 555;

        Log.d("idk_debuggg","Före toast.");
        Toast.makeText(getApplicationContext(), toast_thing+String.valueOf(test_tal), Toast.LENGTH_LONG).show();
        Log.d("idk_debuggg","Efter toast.");
    }

}
