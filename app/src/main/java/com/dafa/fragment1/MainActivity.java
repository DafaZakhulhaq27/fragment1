package com.dafa.fragment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements InputFragment.IListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void doProses(String nama, String umur) {

        OutputFragment fragOut = (OutputFragment) getSupportFragmentManager().findFragmentById(R.id.output_fragment);

        fragOut.doProses(nama, umur);
    }
}