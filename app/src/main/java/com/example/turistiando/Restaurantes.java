package com.example.turistiando;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Restaurantes extends AppCompatActivity {

    //atributos de la clase
    ArrayList<Restaurante> lista = new ArrayList<>();
    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        listaLogica=findViewById(R.id.recycler2);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        Adaptador2 adaptador=new Adaptador2(lista);
        listaLogica.setAdapter(adaptador);

    }

    public void crearListaHoteles(){

        lista.add(new Restaurante(R.drawable.restaurantemoyomba,"Restaurante Moyomba","$300000 - $100000"));
        lista.add(new Restaurante(R.drawable.embarcadero,"Restaurante Embarcadero","$10000-$80000"));
        lista.add(new Restaurante(R.drawable.catrinarestaurante,"Catrina Restaurante","$14000-$100000"));
        lista.add(new Restaurante(R.drawable.elquitapena,"Restaurante El quita Pena","$20000-$120000"));


    }

}
