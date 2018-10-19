package com.example.comp8.eventos.database.model;

public class ConvidadoModel {


    public static final String TABELA_NOME = "tbconvidado";

    public static  final String
            ID     = "_id",
            EVENTO = "evento",
            NOME   = "nome",
            CPF    = "CPF",
            IDADE  = "idade";

    public static final String CREATE_TABLE = "create table " + TABELA_NOME
            + "("
            + ID     + " integer primary key autoincrement,"
            + EVENTO + " integer not null,"
            + NOME   + " text,"
            + CPF    + " text,"
            + IDADE  + " integer"
            + ");";

    public static final String DROP_TABLE = "drop table if exists " + TABELA_NOME + ";";
}
