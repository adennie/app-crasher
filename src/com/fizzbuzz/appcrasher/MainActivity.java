package com.fizzbuzz.appcrasher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity
        extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.boom);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent("com.fizzbuzz.appcrasher.CRASH"));
                }
                catch (ActivityNotFoundException e) {
                    Toast.makeText(MainActivity.this, "No apps found that want to crash :-(", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
