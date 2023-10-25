package com.objetivar.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.objetivar.crud.service.PersonalInformationService;
import com.objetivar.crud.model.PersonalInformation;

import java.util.List;

@RestController
@RequestMapping("/personal-information")
public class PersonalInformationController {
    private final PersonalInformationService personalInformationService;

    @Autowired
    public PersonalInformationController(PersonalInformationService personalInformationService) {
        this.personalInformationService = personalInformationService;
    }

    @PostMapping
    public ResponseEntity<PersonalInformation> createPersonalInformation(@RequestBody PersonalInformation personalInformation) {
        PersonalInformation createdPersonalInformation = personalInformationService.createPersonalInformation(personalInformation);
        return ResponseEntity.ok(createdPersonalInformation);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonalInformation> getPersonalInformationById(@PathVariable Long id) {
        PersonalInformation personalInformation = personalInformationService.getPersonalInformationById(id);
        if (personalInformation != null) {
            return ResponseEntity.ok(personalInformation);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<PersonalInformation>> getAllPersonalInformation() {
        List<PersonalInformation> personalInformationList = personalInformationService.getAllPersonalInformation();
        return ResponseEntity.ok(personalInformationList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonalInformation> updatePersonalInformation(@PathVariable Long id, @RequestBody PersonalInformation updatedPersonalInformation) {
        personalInformationService.updatePersonalInformation(id, updatedPersonalInformation);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersonalInformation(@PathVariable Long id) {
        personalInformationService.deletePersonalInformation(id);
        return ResponseEntity.noContent().build();
    }
}
