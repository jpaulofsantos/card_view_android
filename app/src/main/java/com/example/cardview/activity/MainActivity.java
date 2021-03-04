package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerView);

        //Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerPostagem.setLayoutManager(layoutManager);

        //Definindo o Adapter
        this.prepararPostagem();

        PostagemAdapter postagemAdapter = new PostagemAdapter(postagens);

        recyclerPostagem.setAdapter(postagemAdapter);
    }

    public void prepararPostagem() {
        Postagem post1 = new Postagem("User1", "Viagem1", R.drawable.imagem1);
        this.postagens.add(post1);
        Postagem post2 = new Postagem("User2", "Viagem2", R.drawable.imagem2);
        this.postagens.add(post2);
        Postagem post3 = new Postagem("User3", "Viagem3", R.drawable.imagem3);
        this.postagens.add(post3);
        Postagem post4 = new Postagem("User4", "Viagem4", R.drawable.imagem4);
        this.postagens.add(post4);

    }
}