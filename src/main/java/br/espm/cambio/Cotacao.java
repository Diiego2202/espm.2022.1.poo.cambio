package br.espm.cambio;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

public class Cotacao {

    private UUID id;
    private UUID id_moeda;
    private Date data;
    private BigDecimal valor;

    public Cotacao(){
    }

    public Cotacao(UUID id_moeda, Date data, BigDecimal valor){
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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
}
