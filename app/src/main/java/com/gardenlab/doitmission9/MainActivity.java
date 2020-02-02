package com.gardenlab.doitmission9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    InfoFragment infoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infoFragment = new InfoFragment();

        getSupportFragmentManager().beginTransaction().add(R.id.container, infoFragment).commit();

    }
}
