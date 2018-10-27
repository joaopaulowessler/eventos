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

    public EventoModel(){
        this.ID              = "";
        this.TIPO            = "";
        this.NOME            = "";
        this.CPF             = "";
        this.TELEFONE        = "";
        this.EMAIL           = "";
        this.ANIVERSARIANTE  = "";
        this.DATA            = "";
        this.HORA            = "";
        this.CONTMUSICA      = "";
        this.QTDPESSOAS      = "";
        this.LOCALFESTA      = "";
        this.DECORACAO       = "";
        this.BRINQUEDO       = "";
        this.COMIDA          = "";
        this.MUSICO          = "";
        this.FOTOGRAFIA      = "";
        this.NOMEEMP         = "";
        this.CURSO           = "";
        this.PERIODO         = "";
        this.UNIVERSIDADE    = "";
        this.NOIVO           = "";
        this.NOIVA           = "";
        this.OBSERVACAO      = "";
    }

    public static String getID() {
        return ID;
    }

    public static String getTIPO() {
        return TIPO;
    }

    public static String getNOME() {
        return NOME;
    }

    public static String getCPF() {
        return CPF;
    }

    public static String getTELEFONE() {
        return TELEFONE;
    }

    public static String getEMAIL() {
        return EMAIL;
    }

    public static String getANIVERSARIANTE() {
        return ANIVERSARIANTE;
    }

    public static String getDATA() {
        return DATA;
    }

    public static String getHORA() {
        return HORA;
    }

    public static String getCONTMUSICA() {
        return CONTMUSICA;
    }

    public static String getQTDPESSOAS() {
        return QTDPESSOAS;
    }

    public static String getLOCALFESTA() {
        return LOCALFESTA;
    }

    public static String getDECORACAO() {
        return DECORACAO;
    }

    public static String getBRINQUEDO() {
        return BRINQUEDO;
    }

    public static String getCOMIDA() {
        return COMIDA;
    }

    public static String getMUSICO() {
        return MUSICO;
    }

    public static String getFOTOGRAFIA() {
        return FOTOGRAFIA;
    }

    public static String getNOMEEMP() {
        return NOMEEMP;
    }

    public static String getCURSO() {
        return CURSO;
    }

    public static String getPERIODO() {
        return PERIODO;
    }

    public static String getUNIVERSIDADE() {
        return UNIVERSIDADE;
    }

    public static String getNOIVO() {
        return NOIVO;
    }

    public static String getNOIVA() {
        return NOIVA;
    }

    public static String getOBSERVACAO() {
        return OBSERVACAO;
    }
}
