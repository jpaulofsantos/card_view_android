package com.example.cardview.adapter;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> { //criando a classe. Após criar o MyViewHolder, inserir PostagemAdapter.MyViewHolder e implementar os metodos

    private List<Postagem> listaPostagem;

    public PostagemAdapter(List<Postagem> listPostagens) {
        this.listaPostagem = listPostagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_detalhe, parent, false);

        return new MyViewHolder(itemLista); //instanciando MyHolder passando  a view (itemLista)

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) { //holder é um objeto de MyViewHolder, desta forma tem acesso aos componentes

        Postagem p = listaPostagem.get(position);

        holder.textNome.setText(p.getNome());
        holder.textPostagem.setText(p.getPostagem());
        holder.imagePostagem.setImageResource(p.getImagem());


    }

    @Override
    public int getItemCount() {
        return listaPostagem.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder { //criando MyViewHolder

        private TextView textNome;
        private TextView textPostagem;
        private ImageView imagePostagem;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.textPostagem);
            imagePostagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
}
