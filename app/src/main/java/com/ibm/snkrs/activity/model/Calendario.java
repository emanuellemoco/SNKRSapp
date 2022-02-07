package com.ibm.snkrs.activity.model;

public class Calendario {
    private String titulo;
    private String dia;
    private String mes;
    private int imagem;

    public Calendario(String titulo, String dia, String mes, int imagem) {
        this.titulo = titulo;
        this.dia = dia;
        this.mes = mes;
        this.imagem = imagem;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
