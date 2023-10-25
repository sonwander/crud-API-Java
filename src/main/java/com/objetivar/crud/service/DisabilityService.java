package com.objetivar.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.objetivar.crud.repository.DisabilityRepository;
import com.objetivar.crud.model.Disability;

import java.util.List;

@Service
public class DisabilityService {
    private final DisabilityRepository disabilityRepository;

    @Autowired
    public DisabilityService(DisabilityRepository disabilityRepository) {
        this.disabilityRepository = disabilityRepository;
    }

    public Disability createDisability(Disability disability) {
        return disabilityRepository.save(disability);
    }

    public Disability getDisabilityById(Long id) {
        return disabilityRepository.findById(id).orElse(null);
    }

    public List<Disability> getAllDisabilities() {
        return disabilityRepository.findAll();
    }

    public Disability updateDisability(Long id, Disability updatedDisability) {
        Disability existingDisability = disabilityRepository.findById(id).orElse(null);
        if (existingDisability != null) {
            existingDisability.setDisabilityQuota(updatedDisability.isDisabilityQuota());
            existingDisability.setPhysicalDisability(updatedDisability.isPhysicalDisability());
            existingDisability.setIntellectualDisability(updatedDisability.isIntellectualDisability());
            existingDisability.setMentalDisability(updatedDisability.isMentalDisability());
            existingDisability.setHearingDisability(updatedDisability.isHearingDisability());
            existingDisability.setVisualDisability(updatedDisability.isVisualDisability());
            disabilityRepository.save(existingDisability);
        }
        return existingDisability;
    }

    public void deleteDisability(Long id) {
        disabilityRepository.deleteById(id);
    }
}
