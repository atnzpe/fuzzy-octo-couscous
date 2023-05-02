package com.example.aula04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String NOME = "com.example.aula04.NOME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void navegar(View view){
        Intent intent = new Intent(this,SegundaActivity.class);
        String nome = "Gleyson";
        intent.putExtra(NOME, nome);
        startActivity(intent);

    }
}