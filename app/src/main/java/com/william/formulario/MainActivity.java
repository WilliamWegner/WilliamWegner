package com.william.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.annotation.TargetApi;
import android.os.Build;
import android.widget.EditText;

import static com.william.formulario.R.id.*;

public class MainActivity extends AppCompatActivity {

    EditText nome, idade, email;
    Button cadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome =  (EditText)findViewById(editnome);
        idade = (EditText)findViewById(editidade);
        email = (EditText)findViewById(editEmail);
        cadastrar = (Button) findViewById(editCadastrar);

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String nom = nome.getText().toString();
                String ida = idade.getText().toString();
                  String emai = email.getText().toString();

                Intent i = new Intent(MainActivity.this, MortarDado.class);

                i.putExtra( "nome", nom);
                i.putExtra("idade", ida);
                i.putExtra( "email", emai);

                startActivity(i);

            }

        });
    }}