package br.espm.cambio;

import java.util.Date;
import java.util.UUID;

public class Cotacao {

    private UUID id;
    private UUID id_moeda;
    private Date data;
    private double valor;

    public Cotacao(){
    }

    public Cotacao(UUID id_moeda, Date data, double valor){
        this.id_moeda = id_moeda;
        this.data = data;
        this.valor = valor;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId_moeda() {
        return id_moeda;
    }

    public void setId_moeda(UUID id_moeda) {
        this.id_moeda = id_moeda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}
