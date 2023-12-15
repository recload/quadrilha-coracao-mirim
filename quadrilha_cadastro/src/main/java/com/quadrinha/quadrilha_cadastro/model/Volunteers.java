package com.quadrinha.quadrilha_cadastro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Volunteers {
    
    private Long id;
    private String name;
    private int age;
    private int dateOfBirth;
    private int rg;
    private int cpf;
    private int phoneNumber;
    private String address;
    private String recommendation;
    private String healthProblems;
    private String relationship;
}
