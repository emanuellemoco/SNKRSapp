package com.ibm.snkrs.activityFeed.model;

public class Postagem {

    private String nome;
    private String preco;
    private String tamanho;
    private int imagem;

    public Postagem() {
    }

    public Postagem(String nome, String preco, String tamanho, int imagem) {
        this.nome = nome;
        this.preco = preco;
        this.tamanho = tamanho;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
