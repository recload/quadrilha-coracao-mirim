package com.quadrinha.quadrilha_cadastro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quadrinha.quadrilha_cadastro.model.ProductionTeam;
import com.quadrinha.quadrilha_cadastro.model.Volunteers;
import com.quadrinha.quadrilha_cadastro.service.productionService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/production")
public class productionController {

    @Autowired
    private productionService pService;

    @GetMapping("/list")
    public Iterable<ProductionTeam> list(){
        return pService.list();
    }

     @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody ProductionTeam productionTeam){
        return pService.registrationP(productionTeam, "register");
    }

      @DeleteMapping("/remover/{codig}")
    public ResponseEntity<?> apagar(@PathVariable int id){
        return pService.delete(id);
    }

    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody ProductionTeam productionTeam){
        return pService.registrationP(productionTeam, "edit");
    }
}
