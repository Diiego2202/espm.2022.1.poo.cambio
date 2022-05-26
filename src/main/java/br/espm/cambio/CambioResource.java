package br.espm.cambio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CambioResource {

    @Autowired
    private MoedaService moedaService;
    
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello ESPM! :)";
    }


    @GetMapping("/moeda")
    public List<Moeda> listMoeda(){
        
        return moedaService.listAll();     
    }

    @GetMapping("/moeda/{simbolo}")
    public Moeda findMoedaBySimbolo(@PathVariable String simbolo){
        return moedaService.findBySimbolo(simbolo);     
    }

    @PostMapping("/moeda")
    public void save(@RequestBody Moeda moeda){
        moedaService.create(moeda);
    }

    @DeleteMapping("/moeda/{simbolo}")
    public ResponseEntity<HttpStatus> delete(@PathVariable String simbolo){
        try {
            moedaService.deleteBySimbolo(simbolo);  
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
             
    }

    
}
