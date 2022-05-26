package br.espm.cambio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cotacao")
public class CotacaoModel {
    
    @Id
    @Column(name = "id_cotacao")
    private String idCotacao;

    
}
