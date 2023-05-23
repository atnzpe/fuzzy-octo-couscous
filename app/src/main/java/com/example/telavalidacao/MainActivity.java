package com.example.telavalidacao;

import static java.lang.String.*;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(this::onClick);

    }

    private void onClick(View view) {
        EditText editText = findViewById(R.id.editText);
        if (editText.getText().toString().isEmpty()) {
            editText.setError("Preencha este campo!");
        } else {
            int x = Integer.parseInt(editText.getText().toString());
            int numero = new Random().nextInt(x);
            editText.setText(format("O número sorteado é %d", numero));
        }
    }
}