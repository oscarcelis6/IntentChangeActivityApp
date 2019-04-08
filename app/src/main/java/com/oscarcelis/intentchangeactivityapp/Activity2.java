package com.oscarcelis.intentchangeactivityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    private Button btnIraPrimeraActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        btnIraPrimeraActivity = findViewById(R.id.btnIra1);

        btnIraPrimeraActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irAPrimeraActivity();
            }
        });
    }

    private void irAPrimeraActivity() {

        Intent Act1 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(Act1);
    }
}
