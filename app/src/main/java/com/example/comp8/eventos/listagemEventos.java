package com.example.comp8.eventos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import android.widget.TextView;
import android.widget.Toast;

import com.example.comp8.eventos.adapter.ListaEventoAdapter;
import com.example.comp8.eventos.database.dao.EventoDAO;
import com.example.comp8.eventos.objetos.Evento;

import java.util.ArrayList;

public class listagemEventos extends Activity {

    private ListView listEnventos;
    private ArrayList<Evento> arl = new ArrayList<Evento>();
    private ListaEventoAdapter adapter;
    private TextView txtTitulo;
    private Integer tipo;

    private Button btnEvento;

    private EventoDAO eventoDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_eventos);

        Intent it = getIntent();
        this.tipo = Integer.parseInt(it.getStringExtra("Tipo"));

        txtTitulo = (TextView)findViewById(R.id.txtTitulo);

        switch (tipo) {
            case 1:
                txtTitulo.setText("15 Anos");
                break;
            case 2:
                txtTitulo.setText("Aniversário");
                break;
            case 3:
                txtTitulo.setText("Casamento");
                break;
            case 4:
                txtTitulo.setText("Churrasco");
                break;
            case 5:
                txtTitulo.setText("Empresarial");
                break;
            case 6:
                txtTitulo.setText("Festa em Geral");
                break;
            case 7:
                txtTitulo.setText("Festa Infantil");
                break;
            case 8:
                txtTitulo.setText("Formatura");
                break;
        }

        eventoDAO = new EventoDAO(this);

        listEnventos = (ListView)findViewById(R.id.listEnventos);

        arl = eventoDAO.getEventos(tipo);

        if (!arl.isEmpty()){
            adapter      = new ListaEventoAdapter(this, arl);
            listEnventos.setAdapter(adapter);
            adapter.notifyDataSetChanged();
        }

        btnEvento = (Button)findViewById(R.id.btnEvento);
        btnEvento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (tipo){
                    case 1:
                        startActivity(new Intent(listagemEventos.this,cadastroQuinze.class));
                        break;
                    case 2:
                        startActivity(new Intent(listagemEventos.this,cadastroAniversario.class));
                        break;
                    case 3:
                        startActivity(new Intent(listagemEventos.this,cadastroCasamento.class));
                        break;
                    case 4:
                        startActivity(new Intent(listagemEventos.this,cadastroChurrasco.class));
                        break;
                    case 5:
                        startActivity(new Intent(listagemEventos.this,cadastroEmpresarial.class));
                        break;
                    case 6:
                        startActivity(new Intent(listagemEventos.this,cadastroGeral.class));
                        break;
                    case 7:
                        startActivity(new Intent(listagemEventos.this,cadastroInfantil.class));
                        break;
                    case 8:
                        startActivity(new Intent(listagemEventos.this,cadastroFormatura.class));
                        break;
                }
            }
        });

        listEnventos.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long arg3) {

                Toast.makeText(listagemEventos.this, " AAA " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onResume(){
        super.onResume();

        /*eventoDAO = new EventoDAO(this);

        listEnventos = (ListView)findViewById(R.id.listEnventos);

        arl = eventoDAO.getEventos(tipo);

        if (!arl.isEmpty()){
            adapter      = new ListaEventoAdapter(this, arl);
            listEnventos.setAdapter(adapter);
            adapter.notifyDataSetChanged();
        }*/
    }
}
