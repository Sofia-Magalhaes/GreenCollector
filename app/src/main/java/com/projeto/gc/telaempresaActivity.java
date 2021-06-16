package com.projeto.gc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class telaempresaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telaempresa);
    }
    public void veja1(View view){
        Intent i = new Intent(telaempresaActivity.this, postoActivity.class);
        startActivity( i );
    }
    public void veja2(View view){
        Intent i = new Intent(telaempresaActivity.this, posto2Activity.class);
        startActivity( i );
    }
    public void veja3(View view){
        Intent i = new Intent(telaempresaActivity.this, posto3Activity.class);
        startActivity( i );
    }
    public void veja4(View view){
        Intent i = new Intent(telaempresaActivity.this, posto4Activity.class);
        startActivity( i );
    }
    public void voltarco(View view){
        Intent i = new Intent(telaempresaActivity.this, loginActivity.class);
        startActivity( i );
    }
}