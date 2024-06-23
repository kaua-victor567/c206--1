package org.example;
public class Fazendeiro {
    private int idFazendeiros;
    private String nome;
    private int idade;
    private int fazendasIdFazendas;

    // Construtor sem parâmetros
    public Fazendeiro() {
    }

    // Construtor com parâmetros
    public Fazendeiro(int idFazendeiros, String nome, int idade, int fazendasIdFazendas) {
        this.idFazendeiros = idFazendeiros;
        this.nome = nome;
        this.idade = idade;
        this.fazendasIdFazendas = fazendasIdFazendas;
    }

    // Getters e Setters
    public int getIdFazendeiros() {
        return idFazendeiros;
    }

    public void setIdFazendeiros(int idFazendeiros) {
        this.idFazendeiros = idFazendeiros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getFazendasIdFazendas() {
        return fazendasIdFazendas;
    }

    public void setFazendasIdFazendas(int fazendasIdFazendas) {
        this.fazendasIdFazendas = fazendasIdFazendas;
    }
}
