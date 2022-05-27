package br.espm.cambio;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class Cotacao {

    private UUID id;
    private Moeda moeda;
    private Date data;
    private BigDecimal valor;

    // public Cotacao(){
    // }

    // public Cotacao(UUID id_moeda, Date data, BigDecimal valor){
    //     this.id_moeda = id_moeda;
    //     this.data = data;
    //     this.valor = valor;
    // }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
}
