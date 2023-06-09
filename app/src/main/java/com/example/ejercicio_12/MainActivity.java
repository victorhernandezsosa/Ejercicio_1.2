package com.example.ejercicio_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre,apellido,edad,correo;

    Button agregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText) findViewById(R.id.nombre);
        apellido = (EditText) findViewById(R.id.apellido);
        edad = (EditText) findViewById(R.id.edad);
        correo = (EditText) findViewById(R.id.correo);

        agregar = (Button) findViewById(R.id.agregar);

        agregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomb = nombre.getText().toString();
                String ape = apellido.getText().toString();
                String age = edad.getText().toString();
                String email = correo.getText().toString();
                String resultado;

                int a = Integer.parseInt(age);

                resultado = "Su nombre y apellido son: "+nomb +" "+ ape + " , la edad que tiene es de: "+age+" años y su correo electronico es: "+ email;

                Intent intent = new Intent(getApplicationContext(),mostrar.class);
                intent.putExtra("resultado",resultado);
                startActivity(intent);


            }
        });

    }
}