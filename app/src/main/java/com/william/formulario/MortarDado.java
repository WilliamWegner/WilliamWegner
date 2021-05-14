package com.william.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MortarDado extends AppCompatActivity {

    TextView tvnome,tvidade,tvemail;
    Button btnOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_dados);


        tvnome = (TextView)findViewById(R.id.tvnome);
        tvidade = (TextView)findViewById(R.id.tvidade);
        tvemail = (TextView)findViewById(R.id.tvemail);
        btnOk = (Button)findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent intent = new Intent(MortarDado.this, MainActivity.class);
             startActivity(intent);
         }
    });
   mostrarDados();
    }
      private void mostrarDados(){
             Bundle dados = this.getIntent().getExtras();
             String nome = dados.getString( "nome" );
             String idade = dados.getString( "idade" );
             String email = dados.getString("email" );
             tvnome.setText(nome);
             tvidade.setText(idade);
             tvemail.setText(email);
        }
}
