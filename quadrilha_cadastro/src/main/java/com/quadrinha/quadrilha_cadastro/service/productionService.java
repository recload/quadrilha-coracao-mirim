package com.quadrinha.quadrilha_cadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.quadrinha.quadrilha_cadastro.model.ModelResponse;
import com.quadrinha.quadrilha_cadastro.model.ProductionTeam;
import com.quadrinha.quadrilha_cadastro.repository.productionRepository;

@Service
public class productionService {
    
    @Autowired
    private productionRepository pRepository;

    @Autowired
    private ModelResponse  modelResponse;



    //listar cadastros
    public Iterable<ProductionTeam> list(){
        return pRepository.findAll();
    }

    //Cadastro produto
    public ResponseEntity<?> registrationP(ProductionTeam productionTeam, String action){
        if(productionTeam.getScenographyProduction().equals("")){
            modelResponse.setMensagem("Esse Campo precisa ser preenchido");
            return new ResponseEntity<>(modelResponse, HttpStatus.BAD_REQUEST);
        }else if(productionTeam.getShows().equals("")){
            modelResponse.setMensagem("Esse campo precisa ser preenchido");
            return new ResponseEntity<>(modelResponse, HttpStatus.BAD_REQUEST);
        }else{
            if (action.equals("register")) {
                return new ResponseEntity<>(pRepository.save(productionTeam), HttpStatus.CREATED);
            }else{
                return new ResponseEntity<>(pRepository.save(productionTeam), HttpStatus.OK);
            }
        }
    }

    //deletar

    public ResponseEntity<?> delete(int id){
           if(pRepository.countById(id) == 0){
            modelResponse.setMensagem("Item informado não existe");
            return new ResponseEntity<>(pRepository, HttpStatus.BAD_REQUEST);
        }else{
            ProductionTeam productionTeam = pRepository.findById(id);
            pRepository.delete(productionTeam);
            modelResponse.setMensagem("Item deletado com sucesso");
            return new ResponseEntity<>(modelResponse, HttpStatus.OK);
        }
    }

}
