package com.projeto.gc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cadastroObjetoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_objeto);
    }
    public void salvar(View view){
        Intent i = new Intent(cadastroObjetoActivity.this, inicioActivity.class);
        startActivity( i );
    }
    public void voltarco(View view){
        Intent i = new Intent(cadastroObjetoActivity.this, inicioActivity.class);
        startActivity( i );
    }

}