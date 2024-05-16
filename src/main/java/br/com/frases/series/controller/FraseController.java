package br.com.frases.series.controller;

import br.com.frases.series.dto.FraseDTO;
import br.com.frases.series.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {

    @Autowired
    private FraseService service;

    @GetMapping("/series/frases")
    public FraseDTO obterFraseAleatoria(){
        return service.obterFraseAleatoria();
    }

}
