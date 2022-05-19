package br.espm.cambio;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;


/*
    Esse eh o microservico de moeda
*/
@Component
public class MoedaService {

    @Autowired
    private MoedaRepository moedaRepository;  

    public List<Moeda> listAll(){
        return StreamSupport
            // transforma de iteravel para lista
            .stream(moedaRepository.findAll().spliterator(), false)
            .collect(Collectors.toList())
            // transforma de Model para Objeto
            .stream().map(MoedaModel::to)
            .collect(Collectors.toList());
    }

    public Moeda create(Moeda vo){
        vo.setId(UUID.randomUUID());
        return moedaRepository.save(new MoedaModel(vo)).to();
    }
}
