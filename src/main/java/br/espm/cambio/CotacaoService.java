package br.espm.cambio;

import java.util.Date;
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
    private MoedaService moedaService;

    @Autowired 
    private CotacaoRepository cotacaoRepository;


}
