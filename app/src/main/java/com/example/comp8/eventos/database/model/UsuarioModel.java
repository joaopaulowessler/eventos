package com.example.comp8.eventos.database.model;

public class UsuarioModel {


    public static final String TABELA_NOME = "tbusuario";

    public static  final String
            ID    = "_id",
            EMAIL = "email",
            SENHA = "senha",
            NOME  = "nome";

    public static final String CREATE_TABLE = "create table " + TABELA_NOME
                                            + "("
                                            + ID    + " integer primary key autoincrement,"
                                            + NOME  + " text not null,"
                                            + SENHA + " text not null,"
                                            + EMAIL + " text not null"
                                            + ");";

    public static final String DROP_TABLE = "drop table if exists " + TABELA_NOME + ";";
}
