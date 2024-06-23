package org.example;
public class Fazenda {
    private int idFazendas;
    private String nome;
    private String localizacao;

    // Construtor sem parâmetros
    public Fazenda() {
    }

    // Construtor com parâmetros
    public Fazenda(int idFazendas, String nome, String localizacao) {
        this.idFazendas = idFazendas;
        this.nome = nome;
        this.localizacao = localizacao;
    }

    // Getters e Setters
    public int getIdFazendas() {
        return idFazendas;
    }

    public void setIdFazendas(int idFazendas) {
        this.idFazendas = idFazendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
