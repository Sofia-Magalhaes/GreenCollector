package com.projeto.gc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class inicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
    public void login(View view){
        Intent i = new Intent(inicioActivity.this, loginActivity.class);
        startActivity( i );
    }
    public void cadastroObjeto(View view){
        Intent i = new Intent(inicioActivity.this, cadastroObjetoActivity.class);
        startActivity( i );
    }

}