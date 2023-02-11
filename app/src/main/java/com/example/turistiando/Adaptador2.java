package com.example.turistiando;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador2 extends RecyclerView.Adapter<Adaptador2.viewHolder> {

    //atributos de la clase adaptador
    public ArrayList<Restaurante>  listaRestaurantes;


    //constructor
    public Adaptador2(ArrayList<Restaurante> listaRestaurantes) {
        this.listaRestaurantes = listaRestaurantes;
    }

    @NonNull
    @Override
    public Adaptador2.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item2,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador2.viewHolder viewHolder, int i) {

        viewHolder.actualizarDatos(listaRestaurantes.get(i));

    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        ImageView fotoRestaurante;
        TextView nombreRestaurante;
        TextView precioRestaurante;


        public viewHolder(@NonNull View itemView) {
            super(itemView);
            fotoRestaurante=itemView.findViewById(R.id.fotoRestaurante);
            nombreRestaurante=itemView.findViewById(R.id.nombreRestaurante);
            precioRestaurante=itemView.findViewById(R.id.precioRestaurante);
        }

        public void actualizarDatos(Restaurante restaurante) {

            fotoRestaurante.setImageResource(restaurante.getFotografia());
            nombreRestaurante.setText(restaurante.getNombre());
            precioRestaurante.setText(restaurante.getPrecio());

        }
    }
}