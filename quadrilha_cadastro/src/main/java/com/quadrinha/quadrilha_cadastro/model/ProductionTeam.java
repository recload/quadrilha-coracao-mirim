package com.quadrinha.quadrilha_cadastro.model;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ProductionTeam {
    
    private String scenographyProduction;
    private String show;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private List<Volunteers> volunterrs;
}
