package com.objetivar.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.objetivar.crud.repository.DocumentsRepository;
import com.objetivar.crud.model.Documents;

import java.util.List;

@Service
public class DocumentsService {
    private final DocumentsRepository documentsRepository;

    @Autowired
    public DocumentsService(DocumentsRepository documentsRepository) {
        this.documentsRepository = documentsRepository;
    }

    public Documents createDocuments(Documents documents) {
        return documentsRepository.save(documents);
    }

    public Documents getDocumentsById(Long id) {
        return documentsRepository.findById(id).orElse(null);
    }

    public List<Documents> getAllDocuments() {
        return documentsRepository.findAll();
    }

    public void updateDocuments(Long id, Documents updatedDocuments) {
        Documents existingDocuments = documentsRepository.findById(id).orElse(null);
        if (existingDocuments != null) {
            existingDocuments.setCtpsNumber(updatedDocuments.getCtpsNumber());
            existingDocuments.setCtpsSeries(updatedDocuments.getCtpsSeries());
            existingDocuments.setFgtsOpting(updatedDocuments.isFgtsOpting());
            existingDocuments.setInssOpting(updatedDocuments.isInssOpting());
            existingDocuments.setReservistCategory(updatedDocuments.getReservistCategory());
            existingDocuments.setReservistNumber(updatedDocuments.getReservistNumber());
            existingDocuments.setReservistaCategoria(updatedDocuments.getReservistaCategoria());
            existingDocuments.setReservistaNumero(updatedDocuments.getReservistaNumero());
            existingDocuments.setSsn(updatedDocuments.getSsn());
            existingDocuments.setPis(updatedDocuments.getPis());
            existingDocuments.setRg(updatedDocuments.getRg());
            existingDocuments.setRgIssue(updatedDocuments.getRgIssue());
            existingDocuments.setRgIssuingState(updatedDocuments.getRgIssuingState());
            existingDocuments.setDriversLicense(updatedDocuments.getDriversLicense());
            existingDocuments.setDriversLicenseCategory(updatedDocuments.getDriversLicenseCategory());
            existingDocuments.setDriversLicenseState(updatedDocuments.getDriversLicenseState());
            existingDocuments.setDriversLicenseExpirationDate(updatedDocuments.getDriversLicenseExpirationDate());
            existingDocuments.setIssuanceOfDriversLicense(updatedDocuments.getIssuanceOfDriversLicense());
            documentsRepository.save(existingDocuments);
        }
    }

    public void deleteDocuments(Long id) {
        documentsRepository.deleteById(id);
    }
}
