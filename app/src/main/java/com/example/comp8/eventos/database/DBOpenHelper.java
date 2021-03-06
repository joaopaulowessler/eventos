package com.example.comp8.eventos.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.comp8.eventos.database.model.EventoModel;
import com.example.comp8.eventos.database.model.UsuarioModel;

public class DBOpenHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NOME = "eventos.db";

    private static final int DATABASE_VERSAO = 6;

    public DBOpenHelper(Context context){
        super(context, DATABASE_NOME, null, DATABASE_VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db){

        db.execSQL(UsuarioModel.CREATE_TABLE);
        db.execSQL(EventoModel.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

        db.execSQL(UsuarioModel.DROP_TABLE);
        db.execSQL(EventoModel.DROP_TABLE);
        onCreate(db);
    }
}
