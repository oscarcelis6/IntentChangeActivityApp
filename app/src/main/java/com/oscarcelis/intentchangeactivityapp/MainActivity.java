package com.oscarcelis.intentchangeactivityapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnIraSegundaActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIraSegundaActivity = findViewById(R.id.btnIra2);

        btnIraSegundaActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irASegundaActivity();
            }
        });

    }

    private void irASegundaActivity() {

        Intent Act2 = new Intent(getApplicationContext(), Activity2.class);
        startActivity(Act2);
    }
}
