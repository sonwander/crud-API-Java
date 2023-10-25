package com.objetivar.crud.controllers;

import com.objetivar.crud.model.Disability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.objetivar.crud.service.DisabilityService;

import java.util.List;

@RestController
@RequestMapping("/disabilities")  // Define a raiz dos endpoints para esta entidade
public class DisabilityController {
    private final DisabilityService disabilityService;

    @Autowired
    public DisabilityController(DisabilityService disabilityService) {
        this.disabilityService = disabilityService;
    }

    // Endpoint para criar uma nova deficiência
    @PostMapping
    public ResponseEntity<Disability> createDisability(@RequestBody Disability disability) {
        Disability newDisability = disabilityService.createDisability(disability);
        return new ResponseEntity<>(newDisability, HttpStatus.CREATED);
    }

    // Endpoint para buscar uma deficiência pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Disability> getDisabilityById(@PathVariable Long id) {
        Disability disability = disabilityService.getDisabilityById(id);
        if (disability != null) {
            return new ResponseEntity<>(disability, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para buscar todas as deficiências
    @GetMapping
    public ResponseEntity<List<Disability>> getAllDisabilities() {
        List<Disability> disabilities = disabilityService.getAllDisabilities();
        return new ResponseEntity<>(disabilities, HttpStatus.OK);
    }

    // Endpoint para atualizar uma deficiência existente
    @PutMapping("/{id}")
    public ResponseEntity<Disability> updateDisability(@PathVariable Long id, @RequestBody Disability disability) {
        Disability updatedDisability = disabilityService.updateDisability(id, disability);
        if (updatedDisability != null) {
            return new ResponseEntity<>(updatedDisability, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Endpoint para excluir uma deficiência pelo ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDisability(@PathVariable Long id) {
        disabilityService.deleteDisability(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
