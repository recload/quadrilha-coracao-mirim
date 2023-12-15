package com.quadrinha.quadrilha_cadastro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "Volunteer")
public class Volunteers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
