package com.example.comp8.eventos;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.comp8.eventos.adapter.ListaEventoAdapter;
import com.example.comp8.eventos.database.dao.EventoDAO;
import com.example.comp8.eventos.objetos.Evento;

import java.util.ArrayList;

public class listagemEventos extends Activity {

    private ListView listEnventos;
    private ArrayList<Evento> arl = new ArrayList<Evento>();
    private ListaEventoAdapter adapter;

    private Button btnEvento;

    private EventoDAO eventoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_eventos);

        eventoDAO = new EventoDAO(this);
        listEnventos = (ListView)findViewById(R.id.listEnventos);

        arl = eventoDAO.getEventos(1);

        if (!arl.isEmpty()){
            adapter      = new ListaEventoAdapter(this, arl);
            listEnventos.setAdapter(adapter);
            adapter.notifyDataSetChanged();
        }

        btnEvento = (Button)findViewById(R.id.btnEvento);
        btnEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(listagemEventos.this,cadastroQuinze.class));
            }
        });
    }
}
