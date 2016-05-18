package com.filipebarretto.androidtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button yodaButton;
    private Button vaderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yodaButton = (Button) findViewById(R.id.yodaButton);
        vaderButton = (Button) findViewById(R.id.vaderButton);

        yodaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.yoda_toast), Toast.LENGTH_LONG).show();
            }
        });

        vaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.vader_toast), Toast.LENGTH_LONG).show();
            }
        });


    }
}
