package com.dafa.fragment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText enama;
    EditText eumur;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enama = (EditText) findViewById(R.id.etnama);
        eumur = (EditText) findViewById(R.id.etumur);
        hasil = (TextView) findViewById(R.id.tvhasil);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doProses();
            }
        });

    }

    private void doProses() {

        hasil.setText("Nama = " + enama.getText().toString() + " " + eumur.getText().toString());

    }
}
