package br.espm.cambio;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


// Microservico da cotacao

@Component
public class CotacaoService {

    @Autowired
    private CotacaoRepository cotacaoRepository;
    
    public List<Cotacao> listAll(){
        return StreamSupport
            // transforma de iteravel para lista
            .stream(cotacaoRepository.findAll().spliterator(), false)
            .collect(Collectors.toList())
            // transforma de Model para Objeto
            .stream().map(CotacaoModel::to)
            .collect(Collectors.toList());
    }

    public Cotacao create(Cotacao vo){
        vo.setId(UUID.randomUUID());
        return cotacaoRepository.save(new CotacaoModel(vo)).to();
    }

    public Cotacao findBy(UUID id) {
        return cotacaoRepository.findById(id.toString())
                    .map(CotacaoModel::to)
                    .orElse(null);
    }

    //TODO
    public Cotacao findByIdMoeda(String idMoeda){
        return null;
    }

    //TODO atualizar pelo idMoeda


}
