package com.filipebarretto.androidtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    private Button yodaButton;
    private Button vaderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtain the FirebaseAnalytics instance.
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);

        yodaButton = (Button) findViewById(R.id.yodaButton);
        vaderButton = (Button) findViewById(R.id.vaderButton);

        Log.i("TEST", String.valueOf(Toast.LENGTH_SHORT));

        yodaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customEvent("y001", "YODA");
                Toast.makeText(MainActivity.this, getString(R.string.yoda_toast), Toast.LENGTH_SHORT).show();
            }
        });

        vaderButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customEvent("v001", "VADER");
                Toast.makeText(MainActivity.this, getString(R.string.vader_toast), Toast.LENGTH_SHORT).show();
            }
        });

    }

    private void customEvent(String id, String name) {
        Bundle bundle = new Bundle();
        bundle.putString(FirebaseAnalytics.Param.ITEM_ID, id);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, name);
        mFirebaseAnalytics.logEvent("click", bundle);
    }


}
