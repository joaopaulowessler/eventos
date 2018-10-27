package com.example.comp8.eventos.adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.comp8.eventos.R;
import com.example.comp8.eventos.database.model.EventoModel;
import com.example.comp8.eventos.objetos.Evento;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class ListaEventoAdapter extends BaseAdapter {

    private Activity     activity;
    private ArrayList<Evento> eventos;

    public ListaEventoAdapter(Activity activity, ArrayList<Evento> eventos){

        this.activity = activity;
        this.eventos  = eventos;
    }

    @Override
    public int getCount() {
        return eventos.size();
    }

    @Override
    public Object getItem(int position) {
        return eventos.get(position);
    }

    @Override
    public long getItemId(int position) {

        return Long.parseLong(eventos.get(position).getID().toString());
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = activity.getLayoutInflater().inflate(R.layout.list_eventos_itens,parent,false);

        TextView etdNome = (TextView)v.findViewById(R.id.etdNome);
        TextView edtData = (TextView)v.findViewById(R.id.edtData);

        etdNome.setText(eventos.get(position).getNOME());
        edtData.setText(eventos.get(position).getDATA());

        return v;
    }
}
