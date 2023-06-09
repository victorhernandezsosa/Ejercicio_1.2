package com.example.ejercicio_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class mostrar extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        result = (TextView) findViewById(R.id.finalmos);

        Intent intent = getIntent();

        if (intent != null)
        {
            String mos = intent.getStringExtra("resultado");
            result.setText(String.valueOf(mos));
        }

    }
}