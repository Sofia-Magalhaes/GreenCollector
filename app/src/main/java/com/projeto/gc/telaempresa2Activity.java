package com.projeto.gc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class telaempresa2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telaempresa2);
    }
    public void veja1(View view){
        Intent i = new Intent(telaempresa2Activity.this, postoActivity.class);
        startActivity( i );
    }
    public void veja2(View view){
        Intent i = new Intent(telaempresa2Activity.this, posto2Activity.class);
        startActivity( i );
    }
    public void veja3(View view){
        Intent i = new Intent(telaempresa2Activity.this, posto3Activity.class);
        startActivity( i );
    }
    public void veja4(View view){
        Intent i = new Intent(telaempresa2Activity.this, posto4Activity.class);
        startActivity( i );
    }
    public void voltarco(View view){
        Intent i = new Intent(telaempresa2Activity.this, loginActivity.class);
        startActivity( i );
    }
}