package com.example.comp8.eventos.adapter;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.comp8.eventos.R;
import com.example.comp8.eventos.cadastroFormatura;
import com.example.comp8.eventos.cadastroQuinze;
import com.example.comp8.eventos.database.model.EventoModel;
import com.example.comp8.eventos.listagemEventos;
import com.example.comp8.eventos.login;
import com.example.comp8.eventos.objetos.Evento;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class ListaEventoAdapter extends BaseAdapter {

    private Activity activity;
    private List<Evento> eventos;
    private LayoutInflater inflater;

    public ListaEventoAdapter(Activity activity, ArrayList<Evento> eventos){

        this.activity = activity;
        this.eventos  = eventos;
    }

    @Override
    public int getCount() {
        return this.eventos.size();
    }

    @Override
    public Object getItem(int position) {
        return this.eventos.get(position);
    }

    @Override
    public long getItemId(int position) {

        return Long.parseLong(eventos.get(position).getID().toString());
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        if (inflater == null) {
            inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_eventos_itens, parent, false);
        }

        TextView etdNome = (TextView)convertView.findViewById(R.id.etdNome);
        TextView edtData = (TextView)convertView.findViewById(R.id.edtData);
        TextView edtHora = (TextView)convertView.findViewById(R.id.edtHora);

        etdNome.setText(eventos.get(position).getNOME());
        edtData.setText(eventos.get(position).getDATA());
        edtHora.setText(eventos.get(position).getHORA());

        ImageButton btnTeste = (ImageButton)convertView.findViewById(R.id.btnConvidado);
        btnTeste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eventos.get(position).getID();

                Intent it = new Intent(activity, cadastroQuinze.class);
                it.putExtra("Tipo", "7");
                activity.startActivity(it);
            }
        });

        return convertView;
    }
}
