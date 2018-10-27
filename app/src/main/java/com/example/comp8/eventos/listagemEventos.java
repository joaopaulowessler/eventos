package com.example.comp8.eventos;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ListView;

import com.example.comp8.eventos.adapter.ListaEventoAdapter;
import com.example.comp8.eventos.database.dao.EventoDAO;
import com.example.comp8.eventos.database.dao.UsuarioDAO;
import com.example.comp8.eventos.database.model.EventoModel;

import java.util.ArrayList;

public class listagemEventos extends Activity {

    private ListView listEnventos;
    private ArrayList<EventoModel> arl = new ArrayList<EventoModel>();
    private ListaEventoAdapter adapter;

    private EventoDAO eventoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_eventos);

        eventoDAO = new EventoDAO(this);

        listEnventos = (ListView)findViewById(R.id.listEnventos);
        adapter      = new ListaEventoAdapter(this, arl);
        listEnventos.setAdapter(adapter);

        arl = eventoDAO.getEventos(1);

        if (!arl.isEmpty())
            adapter.notifyDataSetChanged();
    }
}
