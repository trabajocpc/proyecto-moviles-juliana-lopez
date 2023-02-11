package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Hoteles extends AppCompatActivity {

    //atributos de la clase
    ArrayList<Hotel> lista = new ArrayList<>();
    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        listaLogica=findViewById(R.id.recycler);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        Adaptador adaptador=new Adaptador(lista);
        listaLogica.setAdapter(adaptador);

    }

    public void crearListaHoteles(){

        lista.add(new Hotel(R.drawable.hotelcasacampestre,"Hotel Casa Campestre","$150000"));
        lista.add(new Hotel(R.drawable.hotellacascada,"Hotel la Cascada","$120000"));
        lista.add(new Hotel(R.drawable.fincahotellachocha,"Finca Hotel la CHOCHA","$140000"));
        lista.add(new Hotel(R.drawable.haciendasancarlos,"Hacienda San Carlos","$200000"));


    }

}