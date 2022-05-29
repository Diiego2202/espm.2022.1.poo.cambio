package br.espm.cambio;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public class Cotacao {

    private UUID id;
    private UUID idMoeda;
    private LocalDate data;
    private BigDecimal valor;

    public Cotacao(){
    }

    public Cotacao(BigDecimal valor){
        this.valor = valor;
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

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    
}
