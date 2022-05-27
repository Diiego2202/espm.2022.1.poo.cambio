package br.espm.cambio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class CambioResource {

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    @Autowired
    private MoedaService moedaService;

    @Autowired
    private CotacaoService cotacaoService;
    
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello ESPM! :)";
    }

    @GetMapping("/moeda")
    public List<Moeda> listMoeda(){
        
        return moedaService.listAll();     
    }

    @GetMapping("/moeda/{simbolo:[A-Z]{3,}}")
    public Moeda findMoedaBySimbolo(@PathVariable String simbolo) {
        return moedaService.findBySimbolo(simbolo);
    }

    @GetMapping("/moeda/{id:[a-f0-9]{8}(?:-[a-f0-9]{4}){4}[a-f0-9]{8}}")
    public Moeda findMoedaById(@PathVariable String id) {
        UUID uuid = UUID.fromString(id);
        return moedaService.findBy(uuid);
    }

    @PostMapping("/moeda")
    public void save(@RequestBody Moeda moeda){
        moedaService.create(moeda);
    }

    // @DeleteMapping("/moeda/{id:[a-f0-9]{8}(?:-[a-f0-9]{4}){4}[a-f0-9]{8}}")
    // public ResponseEntity<HttpStatus> deleteById(@PathVariable String id){
    //     try {
    //         moedaService.deleteBy(id);  
    //         return new ResponseEntity<>(HttpStatus.OK);
    //     } catch (Exception e) {
    //         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    //     }
             
    // }

    @DeleteMapping("/moeda/{simbolo:[A-Z]{3,}}")
    public ResponseEntity<HttpStatus> deleteBySimbolo(@PathVariable String simbolo){
        try {
            moedaService.deleteBySimbolo(simbolo);  
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
             
    }


    //Rotas da cotação
      
}
