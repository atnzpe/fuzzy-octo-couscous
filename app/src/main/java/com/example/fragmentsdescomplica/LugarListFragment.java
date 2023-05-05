package com.example.fragmentsdescomplica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LugarListFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_lista);
    }

    public interface OnListSelected {
    }
}