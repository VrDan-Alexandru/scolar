package com.examplu.scolar;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository repository;

    public StudentController(StudentRepository repository) {        //Modificare
        this.repository = repository;
    }

    @GetMapping("/studenti")
    public List<Student> getStudenti() {
        return repository.findAll();
    }

    @PostMapping("/studenti")
    public Student adaugaStudent(@RequestBody Student student) {
        return repository.save(student);
    }

    @DeleteMapping("/studenti/{id}")
    public String stergeStudent(@PathVariable Long id) {
        repository.deleteById(id);
        return "Studentul a fost sters!";
    }

    @PutMapping("/studenti/{id}")
    public Student modificaStudent(@PathVariable Long id, @RequestBody Student studentNou) {
        Student student = repository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("Studentul nu a fost gasit!")
        );
        student.setMedie(studentNou.getMedie());
        return repository.save(student);
    }
}