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

import com.quadrinha.quadrilha_cadastro.model.Volunteers;
import com.quadrinha.quadrilha_cadastro.service.volunteersService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/volunteers")
public class volunteersController {
    
    @Autowired
    private volunteersService sVolunteersService;


    @GetMapping("/list")
    public Iterable<Volunteers> list(){
        return sVolunteersService.list();
    }


    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Volunteers volunteers){
        return sVolunteersService.registrationchange(volunteers, "register");
    }

      @DeleteMapping("/remover/{codig}")
    public ResponseEntity<?> apagar(@PathVariable int id){
        return sVolunteersService.delete(id);
    }

    @PutMapping("/alterar")
    public ResponseEntity<?> alterar(@RequestBody Volunteers volunteers){
        return sVolunteersService.registrationchange(volunteers, "edit");
    }
   
}
