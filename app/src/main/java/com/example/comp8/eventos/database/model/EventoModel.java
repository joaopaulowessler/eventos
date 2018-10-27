package com.example.comp8.eventos.database.model;

public class EventoModel {

    public static final String TABELA_NOME = "tbevento";

    public static  final String
            ID              = "_id",
            TIPO            = "tipo",
            NOME            = "nome",
            CPF             = "cpf",
            TELEFONE        = "telefone,",
            EMAIL           = "email,",
            ANIVERSARIANTE  = "aniversariante",
            DATA            = "data",
            HORA            = "hora",
            CONTMUSICA      = "contmusica",
            QTDPESSOAS      = "qtdpessoas",
            LOCALFESTA      = "localfesta",
            DECORACAO       = "decoracao",
            BRINQUEDO       = "brinquedo",
            COMIDA          = "comida",
            MUSICO          = "musico",
            FOTOGRAFIA      = "fotografia",
            NOMEEMP         = "nomeemp",
            CURSO           = "curso",
            PERIODO         = "periodo",
            UNIVERSIDADE    = "universidade",
            NOIVO           = "noivo",
            NOIVA           = "noiva",
            OBSERVACAO      = "observacao";

    public static final String CREATE_TABLE = "create table " + TABELA_NOME
            + "("
            + ID             + " integer primary key autoincrement,"
            + TIPO           + " integer not null,"
            + NOME           + " text,"
            + CPF            + " text,"
            + TELEFONE       + " text,"
            + ANIVERSARIANTE + " text,"
            + DATA           + " text,"
            + HORA           + " text,"
            + CONTMUSICA     + " text,"
            + QTDPESSOAS     + " integer,"
            + LOCALFESTA     + " text,"
            + DECORACAO      + " text,"
            + COMIDA         + " text,"
            + MUSICO         + " text,"
            + FOTOGRAFIA     + " text,"
            + NOMEEMP        + " text,"
            + CURSO          + " text,"
            + PERIODO        + " text,"
            + UNIVERSIDADE   + " text,"
            + NOIVO          + " text,"
            + NOIVA          + " text,"
            + OBSERVACAO     + " text"
            + ");";

    public static final String DROP_TABLE = "drop table if exists " + TABELA_NOME + ";";
}