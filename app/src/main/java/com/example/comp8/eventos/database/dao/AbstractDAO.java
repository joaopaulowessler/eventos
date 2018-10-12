package com.example.comp8.eventos.database.dao;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import com.example.comp8.eventos.database.DBOpenHelper;

public abstract class AbstractDAO {

    protected SQLiteDatabase db;
    protected DBOpenHelper   db_helper;

    protected final void Open() throws SQLException{

        // Recebe a instacia do banco de dados.
        db = db_helper.getWritableDatabase();
    }

    protected final void Close() throws SQLException{

        // Fecha a conexao com o banco de dados.
        db_helper.close();
    }
}
