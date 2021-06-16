package com.projeto.gc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class loginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login1(View view){
        Intent i = new Intent(loginActivity.this, telaempresaActivity.class);
        startActivity( i );
    }
    public void abrirCadastro(View view){
        Intent i = new Intent(loginActivity.this, cadastroActivity.class);
        startActivity( i );
    }
    public void voltarco(View view){
        Intent i = new Intent(loginActivity.this, inicioActivity.class);
        startActivity( i );
    }

}