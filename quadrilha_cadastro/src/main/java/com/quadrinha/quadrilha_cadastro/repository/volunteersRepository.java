package com.quadrinha.quadrilha_cadastro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quadrinha.quadrilha_cadastro.model.Volunteers;

@Repository
public interface volunteersRepository extends CrudRepository<Volunteers,Long> {

    
} 