package com.projeto.gc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }
    public void cadastrar(View view){
        Intent i = new Intent(cadastroActivity.this, loginActivity.class);
        startActivity( i );
    }
    public void voltarco(View view){
        Intent i = new Intent(cadastroActivity.this, loginActivity.class);
        startActivity( i );
    }
}