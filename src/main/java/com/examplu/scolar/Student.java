package com.examplu.scolar;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nume;
    private int varsta;
    private double medie;

    public Student() {}

    public Student(String nume, int varsta, double medie) {
        this.nume = nume;
        this.varsta = varsta;
        this.medie = medie;
    }

    public Long getId() { return id; }
    public String getNume() { return nume; }
    public int getVarsta() { return varsta; }
    public double getMedie() { return medie; }
    public void setMedie(double medie) { this.medie = medie; }
}