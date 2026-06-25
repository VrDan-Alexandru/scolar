package com.examplu.scolar;

import jakarta.persistence.*;

@Entity
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nume;
    private String materie;

    public Profesor() {}

    public Profesor(String nume, String materie) {
        this.nume = nume;
        this.materie = materie;
    }

    public Long getId() { return id; }
    public String getNume() { return nume; }
    public String getMaterie() { return materie; }
}