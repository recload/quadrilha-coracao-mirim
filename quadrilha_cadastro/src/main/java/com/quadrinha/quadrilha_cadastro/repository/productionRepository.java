package com.quadrinha.quadrilha_cadastro.repository;

import org.springframework.data.repository.CrudRepository;

import com.quadrinha.quadrilha_cadastro.model.ProductionTeam;


public interface productionRepository  extends CrudRepository<ProductionTeam,Long>{
    
}
