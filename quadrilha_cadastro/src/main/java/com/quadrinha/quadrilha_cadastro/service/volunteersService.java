package com.quadrinha.quadrilha_cadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.quadrinha.quadrilha_cadastro.model.ModelResponse;
import com.quadrinha.quadrilha_cadastro.model.Volunteers;
import com.quadrinha.quadrilha_cadastro.repository.volunteersRepository;

@Service
public class volunteersService {
    
    @Autowired
    private volunteersRepository vRepository;

    @Autowired
    private ModelResponse modelResponse;

    //listar cadastros
    public Iterable<Volunteers> list(){
        return vRepository.findAll();
    }

    // cadastro produto

     public ResponseEntity<?> registrationchange(Volunteers volunteers, String action){
        if(volunteers.getName().equals("")){
            modelResponse.setMensagem("O nome precisa ser preenchido");
            return new ResponseEntity<>(modelResponse, HttpStatus.BAD_REQUEST);
        }
        else if(volunteers.getAge().equals("")){
            modelResponse.setMensagem("A idade precisa ser preenchida");
            return new ResponseEntity<>(modelResponse, HttpStatus.BAD_REQUEST);
        }
        else if(volunteers.getDateOfBirth().equals("")){
            modelResponse.setMensagem("Sua data de Nascimento precisa ser preenchida");
            return new ResponseEntity<>(modelResponse, HttpStatus.BAD_REQUEST);
        }
        else if(volunteers.getRg().equals("")){
            modelResponse.setMensagem("O seu RG precisa ser preenchido");
            return new ResponseEntity<>(modelResponse, HttpStatus.BAD_REQUEST);
        }
        else if(volunteers.getCpf().equals("")){
            modelResponse.setMensagem("O seu CPF precisa ser preenchido");
            return new ResponseEntity<>(modelResponse, HttpStatus.BAD_REQUEST);
        }
        else if(volunteers.getPhoneNumber().equals("")){
            modelResponse.setMensagem("O seu Telefone de contato precisa ser preenchido");
            return new ResponseEntity<>(modelResponse, HttpStatus.BAD_REQUEST);
        }
        else if(volunteers.getAge().equals("")){
            modelResponse.setMensagem("O seu Endereço precisa ser preenchido");
            return new ResponseEntity<>(modelResponse, HttpStatus.BAD_REQUEST);
        }
        else if(volunteers.getHealthProblems().equals("")){
            modelResponse.setMensagem("Responda se você tem Problemas de Saúde");
            return new ResponseEntity<>(modelResponse, HttpStatus.BAD_GATEWAY);
        }
        else if(volunteers.getRelationship().equals("")){
            modelResponse.setMensagem("Responda qual sua relação com a quadrilha");
            return new ResponseEntity<>(modelResponse, HttpStatus.BAD_GATEWAY);
        }
        else {
            if (action.equals("register")) {
                return new ResponseEntity<>(vRepository.save(volunteers), HttpStatus.CREATED);
            }else{
                return new ResponseEntity<>(vRepository.save(volunteers), HttpStatus.OK);
            }
        }
    }     

   
    //deletar

    public ResponseEntity<?> delete(int id){
        if(vRepository.countById(id) == 0){
            modelResponse.setMensagem("Item informado não existe");
            return new ResponseEntity<>(vRepository, HttpStatus.BAD_REQUEST);
        }else{
            Volunteers volun = vRepository.findById(id);
            vRepository.delete(volun);
            modelResponse.setMensagem("Item deletado com sucesso");
            return new ResponseEntity<>(modelResponse, HttpStatus.OK);
        }

    }
}
