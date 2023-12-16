package com.quadrinha.quadrilha_cadastro.model;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class MediaTeam {

    private String photography;
    private String audioVisual;
    private String socialMedia;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    

    
    @OneToMany
    @JoinColumn(name = "media_team")
    private List<Volunteers> volunterrs;
}
