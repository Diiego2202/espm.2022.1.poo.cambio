package br.espm.cambio;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CotacaoRepository extends CrudRepository<CotacaoModel, String>{
    
    @Override
    Iterable<CotacaoModel> findAll();

    @Override
    Optional<CotacaoModel> findById(String s);

    // JQL, retorna o objeto
    @Query("SELECT c from CotacaoModel c WHERE idMoeda = (SELECT idMoeda from MoedaModel WHERE UPPER(txSimbolo) = UPPER(:simbolo))")
    Optional<CotacaoModel> findBySimbolo(@Param("simbolo") String simbolo);

}
