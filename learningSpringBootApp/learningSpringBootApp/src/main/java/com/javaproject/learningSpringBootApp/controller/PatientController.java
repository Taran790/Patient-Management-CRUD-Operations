package com.javaproject.learningSpringBootApp.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.javaproject.learningSpringBootApp.model.Patient;
import com.javaproject.learningSpringBootApp.repository.PatientRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientRepository repo;

    public PatientController(PatientRepository repo) {
        this.repo = repo;
    }

    // POST /patients
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return repo.save(patient);
    }

    // GET /patients
    @GetMapping
    public List<Patient> getAllPatients() {
        return repo.findAll();
    }

    // PUT /patients/{id}
    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id,
                                 @RequestBody Patient updatedPatient) {
        Patient p = repo.findById(id).orElseThrow();
        p.setName(updatedPatient.getName());
        p.setDisease(updatedPatient.getDisease());
        return repo.save(p);
    }

    // DELETE /patients/{id}
    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
