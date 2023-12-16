package com.quadrinha.quadrilha_cadastro.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Entity
public class ProductionTeam {
    
    private String scenographyProduction;
    private String shows;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


     @OneToMany
    @JoinColumn(name = "production_team")
    private List<Volunteers> volunterrs;
}
