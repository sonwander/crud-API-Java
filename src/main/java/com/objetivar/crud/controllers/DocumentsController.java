package com.objetivar.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.objetivar.crud.model.Documents;
import com.objetivar.crud.service.DocumentsService;

import java.util.List;

@RestController
@RequestMapping("/documents")
public class DocumentsController {
    private final DocumentsService documentsService;

    @Autowired
    public DocumentsController(DocumentsService documentsService) {
        this.documentsService = documentsService;
    }

    @PostMapping
    public ResponseEntity<Documents> createDocuments(@RequestBody Documents documents) {
        Documents createdDocuments = documentsService.createDocuments(documents);
        return new ResponseEntity<>(createdDocuments, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Documents> getDocumentsById(@PathVariable Long id) {
        Documents documents = documentsService.getDocumentsById(id);
        if (documents != null) {
            return new ResponseEntity<>(documents, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Documents>> getAllDocuments() {
        List<Documents> documentsList = documentsService.getAllDocuments();
        return new ResponseEntity<>(documentsList, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateDocuments(@PathVariable Long id, @RequestBody Documents updatedDocuments) {
        documentsService.updateDocuments(id, updatedDocuments);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDocuments(@PathVariable Long id) {
        documentsService.deleteDocuments(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
