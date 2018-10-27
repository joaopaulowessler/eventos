package com.example.comp8.eventos.objetos;

public class Evento {

    public static Integer
            ID, TIPO;

    public static String
            NOME, CPF, TELEFONE, EMAIL, ANIVERSARIANTE, DATA, HORA, CONTMUSICA, QTDPESSOAS, LOCALFESTA,
            DECORACAO, BRINQUEDO, COMIDA, MUSICO, FOTOGRAFIA, NOMEEMP, CURSO, PERIODO, UNIVERSIDADE, NOIVO,
            NOIVA, OBSERVACAO;

    public Evento(){
        this.ID             = 0;
        this.TIPO           = 0;
        this.NOME           = "";
        this.CPF            = "";
        this.TELEFONE       = "";
        this.EMAIL          = "";
        this.ANIVERSARIANTE = "";
        this.DATA           = "";
        this.HORA           = "";
        this.CONTMUSICA     = "";
        this.QTDPESSOAS     = "";
        this.LOCALFESTA     = "";
        this.DECORACAO      = "";
        this.BRINQUEDO      = "";
        this.COMIDA         = "";
        this.MUSICO         = "";
        this.FOTOGRAFIA     = "";
        this.NOMEEMP        = "";
        this.CURSO          = "";
        this.PERIODO        = "";
        this.UNIVERSIDADE   = "";
        this.NOIVO          = "";
        this.NOIVA          = "";
        this.OBSERVACAO     = "";
    }

    public static Integer getID() {
        return ID;
    }

    public static Integer getTIPO() {
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

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public void setTIPO(Integer TIPO) {
        this.TIPO = TIPO;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setTELEFONE(String TELEFONE) {
        Evento.TELEFONE = TELEFONE;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public void setANIVERSARIANTE(String ANIVERSARIANTE) {
        this.ANIVERSARIANTE = ANIVERSARIANTE;
    }

    public void setDATA(String DATA) {
        this.DATA = DATA;
    }

    public void setHORA(String HORA) {
        this.HORA = HORA;
    }

    public void setCONTMUSICA(String CONTMUSICA) {
        this.CONTMUSICA = CONTMUSICA;
    }

    public void setQTDPESSOAS(String QTDPESSOAS) {
        this.QTDPESSOAS = QTDPESSOAS;
    }

    public void setLOCALFESTA(String LOCALFESTA) {
        this.LOCALFESTA = LOCALFESTA;
    }

    public void setDECORACAO(String DECORACAO) {
        this.DECORACAO = DECORACAO;
    }

    public void setBRINQUEDO(String BRINQUEDO) {
        this.BRINQUEDO = BRINQUEDO;
    }

    public void setCOMIDA(String COMIDA) {
        this.COMIDA = COMIDA;
    }

    public void setMUSICO(String MUSICO) {
        this.MUSICO = MUSICO;
    }

    public void setFOTOGRAFIA(String FOTOGRAFIA) {
        this.FOTOGRAFIA = FOTOGRAFIA;
    }

    public void setNOMEEMP(String NOMEEMP) {
        this.NOMEEMP = NOMEEMP;
    }

    public void setCURSO(String CURSO) {
        this.CURSO = CURSO;
    }

    public void setPERIODO(String PERIODO) {
        this.PERIODO = PERIODO;
    }

    public void setUNIVERSIDADE(String UNIVERSIDADE) {
        this.UNIVERSIDADE = UNIVERSIDADE;
    }

    public void setNOIVO(String NOIVO) {
        this.NOIVO = NOIVO;
    }

    public void setNOIVA(String NOIVA) {
        this.NOIVA = NOIVA;
    }

    public void setOBSERVACAO(String OBSERVACAO) {
        this.OBSERVACAO = OBSERVACAO;
    }
}
