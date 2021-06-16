package com.projeto.gc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class posto3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posto3);
    }
    public void voltar3(View view){
        Intent i = new Intent(posto3Activity.this, telaempresaActivity.class);
        startActivity( i );
    }
    public void voltarco(View view){
        Intent i = new Intent(posto3Activity.this, telaempresaActivity.class);
        startActivity( i );
    }
}