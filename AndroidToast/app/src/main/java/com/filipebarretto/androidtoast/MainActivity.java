package com.filipebarretto.androidtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBiscoitoButton;
    private Button mBolachaButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBiscoitoButton = (Button) findViewById(R.id.biscoitoButton);
        mBolachaButton = (Button) findViewById(R.id.bolachaButton);

        mBiscoitoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.biscoito_toast), Toast.LENGTH_SHORT).show();
            }
        });

        mBolachaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, getString(R.string.bolacha_toast), Toast.LENGTH_SHORT).show();
            }
        });

    }


}
