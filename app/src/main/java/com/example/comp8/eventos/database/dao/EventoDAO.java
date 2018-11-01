package com.example.comp8.eventos.database.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import com.example.comp8.eventos.database.DBOpenHelper;
import com.example.comp8.eventos.database.model.EventoModel;
import com.example.comp8.eventos.objetos.Evento;

import java.util.ArrayList;

public class EventoDAO extends AbstractDAO{

    private ArrayList<Evento> eventosList = new ArrayList<>();

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

    public long Insert(Evento evento){

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

    public ArrayList<Evento> getEventos (Integer tipo){

        /*Cursor cursor = null;

        try{
            Open();

            cursor = db.query(EventoModel.TABELA_NOME, colunas, EventoModel.TIPO + " = ? ", new String[]{tipo.toString()}, null, null,null);

            while (cursor.moveToNext()){
                Evento ev = new Evento();
                ev.setID(cursor.getInt(cursor.getColumnIndex(EventoModel.ID)));
                ev.setTIPO(cursor.getInt(cursor.getColumnIndex(EventoModel.TIPO)));
                ev.setNOME(cursor.getString(cursor.getColumnIndex(EventoModel.NOME)));
                ev.setCPF(cursor.getString(cursor.getColumnIndex(EventoModel.CPF)));
                ev.setTELEFONE(cursor.getString(cursor.getColumnIndex(EventoModel.TELEFONE)));
                ev.setEMAIL(cursor.getString(cursor.getColumnIndex(EventoModel.EMAIL)));
                ev.setANIVERSARIANTE(cursor.getString(cursor.getColumnIndex(EventoModel.ANIVERSARIANTE)));
                ev.setDATA(cursor.getString(cursor.getColumnIndex(EventoModel.DATA)));
                ev.setHORA(cursor.getString(cursor.getColumnIndex(EventoModel.HORA)));
                ev.setCONTMUSICA(cursor.getString(cursor.getColumnIndex(EventoModel.CONTMUSICA)));
                ev.setQTDPESSOAS(cursor.getString(cursor.getColumnIndex(EventoModel.QTDPESSOAS)));
                ev.setLOCALFESTA(cursor.getString(cursor.getColumnIndex(EventoModel.LOCALFESTA)));
                ev.setDECORACAO(cursor.getString(cursor.getColumnIndex(EventoModel.DECORACAO)));
                ev.setBRINQUEDO(cursor.getString(cursor.getColumnIndex(EventoModel.BRINQUEDO)));
                ev.setCOMIDA(cursor.getString(cursor.getColumnIndex(EventoModel.COMIDA)));
                ev.setCOMIDA(cursor.getString(cursor.getColumnIndex(EventoModel.COMIDA)));
                ev.setMUSICO(cursor.getString(cursor.getColumnIndex(EventoModel.MUSICO)));
                ev.setFOTOGRAFIA(cursor.getString(cursor.getColumnIndex(EventoModel.FOTOGRAFIA)));
                ev.setNOMEEMP(cursor.getString(cursor.getColumnIndex(EventoModel.NOMEEMP)));
                ev.setCURSO(cursor.getString(cursor.getColumnIndex(EventoModel.CURSO)));
                ev.setPERIODO(cursor.getString(cursor.getColumnIndex(EventoModel.PERIODO)));
                ev.setUNIVERSIDADE(cursor.getString(cursor.getColumnIndex(EventoModel.UNIVERSIDADE)));
                ev.setNOIVO(cursor.getString(cursor.getColumnIndex(EventoModel.NOIVO)));
                ev.setNOIVA(cursor.getString(cursor.getColumnIndex(EventoModel.NOIVA)));
                ev.setOBSERVACAO(cursor.getString(cursor.getColumnIndex(EventoModel.OBSERVACAO)));
                eventosList.add(ev);
            }
        }
        finally {
            cursor.close();
            Close();
        }*/


        Evento ev = new Evento();
        ev.setNOME("JOAO");
        ev.setDATA("10/10/2018");
        eventosList.add(ev);

        ev.setNOME("PAULO");
        ev.setDATA("20/10/2018");
        eventosList.add(ev);

        return eventosList;
    }
}