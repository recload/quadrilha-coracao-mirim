package com.quadrinha.quadrilha_cadastro.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.quadrinha.quadrilha_cadastro.model.MediaTeam;

@Repository
public interface mediaRepository extends CrudRepository<MediaTeam,Long>{

    
} 