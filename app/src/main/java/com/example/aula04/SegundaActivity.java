package com.example.aula04;

import static com.example.aula04.MainActivity.NOME;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SegundaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

    }

    public void inicio(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }


    public void mostrarNome(View view) {
        Intent intentRecebida = getIntent();
        String nome = intentRecebida.getStringExtra(NOME);
        intentRecebida.putExtra(NOME, nome);
        startActivity(intentRecebida);


    }
}