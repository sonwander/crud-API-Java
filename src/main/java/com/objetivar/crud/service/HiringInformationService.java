package com.objetivar.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.objetivar.crud.model.HiringInformation;
import com.objetivar.crud.repository.HiringInformationRepository;

import java.util.List;

@Service
public class HiringInformationService {
    private final HiringInformationRepository hiringInformationRepository;

    @Autowired
    public HiringInformationService(HiringInformationRepository hiringInformationRepository) {
        this.hiringInformationRepository = hiringInformationRepository;
    }

    public HiringInformation createHiringInformation(HiringInformation hiringInformation) {
        return hiringInformationRepository.save(hiringInformation);
    }

    public HiringInformation getHiringInformationById(Long registrationId) {
        return hiringInformationRepository.findById(registrationId).orElse(null);
    }

    public List<HiringInformation> getAllHiringInformation() {
        return hiringInformationRepository.findAll();
    }

    public void updateHiringInformation(Long registrationId, HiringInformation updatedHiringInformation) {
        HiringInformation existingHiringInformation = hiringInformationRepository.findById(registrationId).orElse(null);
        if (existingHiringInformation != null) {
            existingHiringInformation.setAdmissionDate(updatedHiringInformation.getAdmissionDate());
            existingHiringInformation.setStatus(updatedHiringInformation.getStatus());
            existingHiringInformation.setContractType(updatedHiringInformation.getContractType());
            existingHiringInformation.setBaseSalary(updatedHiringInformation.getBaseSalary());
            existingHiringInformation.setSalaryUnit(updatedHiringInformation.getSalaryUnit());
            existingHiringInformation.setTypeOfWorkingDay(updatedHiringInformation.getTypeOfWorkingDay());
            existingHiringInformation.setContractEndDate(updatedHiringInformation.getContractEndDate());
            existingHiringInformation.setFirstJob(updatedHiringInformation.isFirstJob());
            existingHiringInformation.setUnionType(updatedHiringInformation.getUnionType());
            existingHiringInformation.setExperienceEndDate1(updatedHiringInformation.getExperienceEndDate1());
            existingHiringInformation.setExperienceEndDate2(updatedHiringInformation.getExperienceEndDate2());
            hiringInformationRepository.save(existingHiringInformation);
        }
    }

    public void deleteHiringInformation(Long registrationId) {
        hiringInformationRepository.deleteById(registrationId);
    }
}
