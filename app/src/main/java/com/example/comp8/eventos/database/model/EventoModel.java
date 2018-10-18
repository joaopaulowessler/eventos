package com.example.comp8.eventos.database.model;

public class EventoModel {


    public static final String TABELA_NOME = "tbevento";

    public static  final String
            ID              = "_id",
            TIPO            = "tipo",
            NOME            = "nome",
            ANIVERSARIANTE  = "aniversariante",
            DATAINI         = "datini",
            DATAFIM         = "datafim",
            QTDPESSOAS      = "qtdpessoas",
            LOCALFESTA      = "localfesta",
            DECORACAO       = "decoracao",
            COMIDA          = "comida",
            MUSICO          = "musico",
            FOTOGRAFIA      = "fotografia",
            NOMEEMP         = "nomeemp",
            CURSO           = "curso",
            UNIVERSIDADE    = "universidade",
            OBSERVACAO      = "observacao";

    public static final String CREATE_TABLE = "create table " + TABELA_NOME
            + "("
            + ID             + " integer primary key autoincrement,"
            + TIPO           + " integer not null,"
            + NOME           + " text,"
            + ANIVERSARIANTE + " text,"
            + DATAINI        + " text,"
            + DATAFIM        + " text,"
            + QTDPESSOAS     + " integer,"
            + LOCALFESTA     + " text,"
            + DECORACAO      + " text,"
            + COMIDA         + " text,"
            + MUSICO         + " text,"
            + FOTOGRAFIA     + " text,"
            + NOMEEMP        + " text,"
            + CURSO          + " text,"
            + UNIVERSIDADE   + " text,"
            + OBSERVACAO     + " text"
            + ");";

    public static final String DROP_TABLE = "drop table if exists " + TABELA_NOME + ";";
}
