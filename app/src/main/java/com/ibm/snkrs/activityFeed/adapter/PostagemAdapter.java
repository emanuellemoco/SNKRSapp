package com.ibm.snkrs.activityFeed.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ibm.snkrs.R;
import com.ibm.snkrs.activityFeed.model.Postagem;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<Postagem> postagens;

    public PostagemAdapter(List<Postagem> listaPostagens) {
        this.postagens = listaPostagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem_detalhe, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Postagem postagem = postagens.get( position );
        holder.nome.setText(postagem.getNome());
        holder.preco.setText(postagem.getPreco());
        holder.tamanho.setText(postagem.getTamanho());
        holder.imagem.setImageResource(postagem.getImagem());


    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView nome;
        private TextView preco;
        private TextView tamanho;
        private ImageView imagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nome = itemView.findViewById(R.id.textNome);
            preco = itemView.findViewById(R.id.textPreco);
            tamanho = itemView.findViewById(R.id.textTamanho);
            imagem = itemView.findViewById(R.id.imageProduto);


        }
    }
}
