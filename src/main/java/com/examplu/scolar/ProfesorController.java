package com.examplu.scolar;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ProfesorController {

    private final ProfesorRepository repository;

    public ProfesorController(ProfesorRepository repository) {                       //Modificare2
        this.repository = repository;
    }

    @GetMapping("/profesori")
    public List<Profesor> getProfesori() {
        return repository.findAll();
    }

    @PostMapping("/profesori")
    public Profesor adaugaProfesor(@RequestBody Profesor profesor) {
        return repository.save(profesor);
    }
}