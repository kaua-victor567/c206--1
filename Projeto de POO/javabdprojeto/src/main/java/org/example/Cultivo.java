package org.example;
import java.util.Date;

public class Cultivo {
    private int idCultivos;
    private Date dataPlantio;
    private Date dataColheita;
    private int plantasIdPlantas;
    private int fazendasIdFazendas;

    // Construtor sem parâmetros
    public Cultivo() {
    }

    // Construtor com parâmetros
    public Cultivo(int idCultivos, Date dataPlantio, Date dataColheita, int plantasIdPlantas, int fazendasIdFazendas) {
        this.idCultivos = idCultivos;
        this.dataPlantio = dataPlantio;
        this.dataColheita = dataColheita;
        this.plantasIdPlantas = plantasIdPlantas;
        this.fazendasIdFazendas = fazendasIdFazendas;
    }

    // Getters e Setters
    public int getIdCultivos() {
        return idCultivos;
    }

    public void setIdCultivos(int idCultivos) {
        this.idCultivos = idCultivos;
    }

    public Date getDataPlantio() {
        return dataPlantio;
    }

    public void setDataPlantio(Date dataPlantio) {
        this.dataPlantio = dataPlantio;
    }

    public Date getDataColheita() {
        return dataColheita;
    }

    public void setDataColheita(Date dataColheita) {
        this.dataColheita = dataColheita;
    }

    public int getPlantasIdPlantas() {
        return plantasIdPlantas;
    }

    public void setPlantasIdPlantas(int plantasIdPlantas) {
        this.plantasIdPlantas = plantasIdPlantas;
    }

    public int getFazendasIdFazendas() {
        return fazendasIdFazendas;
    }

    public void setFazendasIdFazendas(int fazendasIdFazendas) {
        this.fazendasIdFazendas = fazendasIdFazendas;
    }
}
