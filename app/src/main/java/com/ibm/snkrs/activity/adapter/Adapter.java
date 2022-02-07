package com.ibm.snkrs.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.ibm.snkrs.R;
import com.ibm.snkrs.activity.model.Calendario;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Calendario> listaCalendario;

    public Adapter(List<Calendario> lista) {
        this.listaCalendario = lista;
    }

    @Override
    public MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        Calendario calendario = listaCalendario.get(position);

        holder.titulo.setText(calendario.getTitulo());
        holder.dia.setText(calendario.getDia());
        holder.mes.setText(calendario.getMes());
        holder.image.setImageResource(calendario.getImagem());


    }

    @Override
    public int getItemCount() {
        return listaCalendario.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo;
        TextView dia;
        TextView mes;
        ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textTitulo);
            dia = itemView.findViewById(R.id.textDia);
            mes = itemView.findViewById(R.id.textMes);
            image = itemView.findViewById(R.id.imageTenis);

        }
    }
}
