package br.espm.cambio;

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
    Optional<CotacaoModel> findById(String id);

    // JQL - Java Query Language
    // @Query("SELECT m from CotacaoModel m WHERE UPPER(m.idMoeda) = UPPER(:simbolo)")
    // Optional<MoedaModel> findBySimbolo(@Param("simbolo") String simbolo);

    // @Transactional
    // @Modifying
    // @Query("DELETE FROM MoedaModel m WHERE UPPER(m.txSimbolo) = UPPER(:simbolo)")
    // void deleteBySimbolo(@Param("simbolo") String simbolo);

}