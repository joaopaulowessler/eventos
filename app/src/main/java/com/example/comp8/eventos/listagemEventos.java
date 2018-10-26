package com.example.comp8.eventos;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import com.example.comp8.eventos.adapter.ListaEventoAdapter;
import com.example.comp8.eventos.database.model.EventoModel;

import java.util.ArrayList;

public class listagemEventos extends Activity {

    private ListView listEnventos;
    private ArrayList<EventoModel> arl = new ArrayList<EventoModel>();
    private ListaEventoAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_eventos);

        listEnventos = (ListView)findViewById(R.id.listEnventos);
        adapter      = new ListaEventoAdapter(this, arl);
        listEnventos.setAdapter(adapter);

        // SELECT RETORNANDO A LISTA
        // arl = SELECT
        // SE RETORNOU > 0
        adapter.notifyDataSetChanged();

    }
}
