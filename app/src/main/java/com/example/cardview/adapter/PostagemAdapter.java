package com.example.cardview.adapter;

import android.provider.MediaStore;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> { //criando a classe. Após criar o MyViewHolder, inserir PostagemAdapter.MyViewHolder e implementar os metodos

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder { //criando MyViewHolder

        private TextView nome;
        private TextView postagem;
        private ImageView imagem;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
