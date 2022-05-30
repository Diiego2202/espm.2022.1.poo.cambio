package br.espm.cambio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Cotacao {

    private UUID id;
    private UUID idMoeda;
    private LocalDate dtData;
    private BigDecimal vrValor;

    public Cotacao(){
    }

    public Cotacao(BigDecimal valor){
        this.vrValor = valor;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getIdMoeda() {
        return idMoeda;
    }

    public void setIdMoeda(UUID idMoeda) {
        this.idMoeda = idMoeda;
    }

    public LocalDate getDtData() {
        return dtData;
    }

    public void setDtData(LocalDate data) {
        this.dtData = data;
    }

    public BigDecimal getVrValor() {
        return vrValor;
    }

    public void setVrValor(BigDecimal valor) {
        this.vrValor = valor;
    }

    
}
