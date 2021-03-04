package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerView);

        //Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerPostagem.setLayoutManager(layoutManager);

        //Definindo o Adapter

        PostagemAdapter postagemAdapter = new PostagemAdapter();

        recyclerPostagem.setAdapter(postagemAdapter);
    }
}