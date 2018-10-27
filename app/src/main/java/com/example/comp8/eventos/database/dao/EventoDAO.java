package com.example.comp8.eventos.database.dao;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Path;
import android.preference.PreferenceManager;

import com.example.comp8.eventos.database.DBOpenHelper;
import com.example.comp8.eventos.database.model.EventoModel;

import java.util.ArrayList;
import java.util.List;

public class EventoDAO extends AbstractDAO{

    private final String[] colunas =
            {
                    EventoModel.ID,
                    EventoModel.TIPO,
                    EventoModel.NOME,
                    EventoModel.CPF,
                    EventoModel.TELEFONE,
                    EventoModel.EMAIL,
                    EventoModel.ANIVERSARIANTE,
                    EventoModel.DATA,
                    EventoModel.HORA,
                    EventoModel.CONTMUSICA,
                    EventoModel.QTDPESSOAS,
                    EventoModel.LOCALFESTA,
                    EventoModel.DECORACAO,
                    EventoModel.BRINQUEDO,
                    EventoModel.COMIDA,
                    EventoModel.MUSICO,
                    EventoModel.FOTOGRAFIA,
                    EventoModel.NOMEEMP,
                    EventoModel.CURSO,
                    EventoModel.PERIODO,
                    EventoModel.UNIVERSIDADE,
                    EventoModel.NOIVO,
                    EventoModel.NOIVA,
                    EventoModel.OBSERVACAO
            };

    public EventoDAO(Context ao_context){

        //Cria o DBHelper
        db_helper = new DBOpenHelper(ao_context);
    }

    public long Insert(EventoModel evento){

        long retorno = 0;

        try {
            Open();
            ContentValues values = new ContentValues();
            values.put(EventoModel.TIPO,           evento.getTIPO());
            values.put(EventoModel.NOME,           evento.getNOME());
            values.put(EventoModel.CPF,            evento.getCPF());
            values.put(EventoModel.TELEFONE,       evento.getTELEFONE());
            values.put(EventoModel.EMAIL,          evento.getEMAIL());
            values.put(EventoModel.ANIVERSARIANTE, evento.getANIVERSARIANTE());
            values.put(EventoModel.DATA,           evento.getDATA());
            values.put(EventoModel.HORA,           evento.getHORA());
            values.put(EventoModel.CONTMUSICA,     evento.getCONTMUSICA());
            values.put(EventoModel.QTDPESSOAS,     evento.getQTDPESSOAS());
            values.put(EventoModel.LOCALFESTA,     evento.getLOCALFESTA());
            values.put(EventoModel.DECORACAO,      evento.getDECORACAO());
            values.put(EventoModel.BRINQUEDO,      evento.getBRINQUEDO());
            values.put(EventoModel.COMIDA,         evento.getCOMIDA());
            values.put(EventoModel.MUSICO,         evento.getMUSICO());
            values.put(EventoModel.FOTOGRAFIA,     evento.getFOTOGRAFIA());
            values.put(EventoModel.NOMEEMP,        evento.getNOMEEMP());
            values.put(EventoModel.CURSO,          evento.getCURSO());
            values.put(EventoModel.PERIODO,        evento.getPERIODO());
            values.put(EventoModel.UNIVERSIDADE,   evento.getUNIVERSIDADE());
            values.put(EventoModel.NOIVO,          evento.getNOIVO());
            values.put(EventoModel.NOIVA,          evento.getNOIVA());
            values.put(EventoModel.OBSERVACAO,     evento.getOBSERVACAO());

            retorno = db.insert(EventoModel.TABELA_NOME, null, values);
        }
        finally {
            Close();
        }
        return retorno;
    }

    public ArrayList<EventoModel> getEventos (Integer tipo){

        ArrayList<EventoModel> eventosList = null;

        Cursor cursor = null;

        try{
            Open();

            cursor = db.query(EventoModel.TABELA_NOME, colunas, EventoModel.TIPO + " = ? ", new String[]{tipo.toString()}, null, null,null);

            while (cursor.moveToFirst()){
                EventoModel ev = new EventoModel();
                String teste = cursor.getString(cursor.getColumnIndex(""));
                eventosList.add(ev);
            }
        }
        finally {
            cursor.close();
            Close();
        }

        return eventosList;
    }
}
