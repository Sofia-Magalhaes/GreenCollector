package com.projeto.gc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class postoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posto);
    }
    public void voltar(View view){
        Intent i = new Intent(postoActivity.this, telaempresa2Activity.class);
        startActivity( i );
    }
    public void voltarco(View view){
        Intent i = new Intent(postoActivity.this, telaempresaActivity.class);
        startActivity( i );
    }
}