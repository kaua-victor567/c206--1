package org.example;
public class Planta {
    private int idPlantas;
    private String nome;
    private String tipo;
    private double precoVenda;

    public Planta(int idPlantas, String nome, String tipo, double precoVenda) {
        this.idPlantas = idPlantas;
        this.nome = nome;
        this.tipo = tipo;
        this.precoVenda = precoVenda;
    }

    // Getters e setters
    public int getIdPlantas() {
        return idPlantas;
    }

    public void setIdPlantas(int idPlantas) {
        this.idPlantas = idPlantas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
}
