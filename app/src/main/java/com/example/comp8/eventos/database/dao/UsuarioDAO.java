package com.example.comp8.eventos.database.dao;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Path;
import android.preference.PreferenceManager;

import com.example.comp8.eventos.database.DBOpenHelper;
import com.example.comp8.eventos.database.model.UsuarioModel;
import com.example.comp8.eventos.login;

public class UsuarioDAO extends AbstractDAO{

    private final String[] colunas =
            {
                    UsuarioModel.ID,
                    UsuarioModel.EMAIL,
                    UsuarioModel.NOME,
                    UsuarioModel.SENHA
            };

    public UsuarioDAO(Context ao_context){

        //Cria o DBHelper
        db_helper = new DBOpenHelper(ao_context);
    }

    public long Insert(final String email, final String senha, final String nome){

        long retorno = 0;

        try {
            Open();
            ContentValues values = new ContentValues();
            values.put(UsuarioModel.EMAIL, email);
            values.put(UsuarioModel.SENHA, senha);
            values.put(UsuarioModel.NOME, nome);
            retorno = db.insert(UsuarioModel.TABELA_NOME, null, values);
        }
        finally {
            Close();
        }
        return retorno;
    }

    public boolean SelectUser (String email, String senha){

        boolean existeUsuario = false;
        Cursor cursor = null;

        try{
            Open();

            cursor = db.query(UsuarioModel.TABELA_NOME, colunas, UsuarioModel.EMAIL + " = ? and " +
                              UsuarioModel.SENHA + " = ? ", new String[]{email, senha}, null, null,null);

            existeUsuario = cursor.moveToFirst();
        }
        finally {
            cursor.close();
            Close();
        }
        return existeUsuario;
    }

    public boolean ValidaEmail (String email){

        boolean existeEmail = false;
        Cursor cursor = null;

        try{
            Open();

            cursor = db.query(UsuarioModel.TABELA_NOME, colunas, UsuarioModel.EMAIL + " = ? ", new String[]{email}, null, null,null);

            existeEmail = cursor.moveToFirst();
        }
        finally {
            cursor.close();
            Close();
        }

        return existeEmail;
    }

}
