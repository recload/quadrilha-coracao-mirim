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
@Table(name = "volunteers")
public class Volunteers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Integer age;
    private Integer dateOfBirth;
    private Integer rg;
    private Integer cpf;
    private Integer phoneNumber;
    private String address;
    private String healthProblems;
    private String relationship;
}
