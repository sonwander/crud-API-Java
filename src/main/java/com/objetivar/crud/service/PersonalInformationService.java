package com.objetivar.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.objetivar.crud.repository.PersonalInformationRepository;
import com.objetivar.crud.model.PersonalInformation;

import java.util.List;

@Service
public class PersonalInformationService {
    private final PersonalInformationRepository personalInformationRepository;

    @Autowired
    public PersonalInformationService(PersonalInformationRepository personalInformationRepository) {
        this.personalInformationRepository = personalInformationRepository;
    }

    public PersonalInformation createPersonalInformation(PersonalInformation personalInformation) {
        return personalInformationRepository.save(personalInformation);
    }

    public PersonalInformation getPersonalInformationById(Long id) {
        return personalInformationRepository.findById(id).orElse(null);
    }

    public List<PersonalInformation> getAllPersonalInformation() {
        return personalInformationRepository.findAll();
    }

    public void updatePersonalInformation(Long id, PersonalInformation updatedPersonalInformation) {
        PersonalInformation existingPersonalInformation = personalInformationRepository.findById(id).orElse(null);
        if (existingPersonalInformation != null) {
            existingPersonalInformation.setDateOfBirth(updatedPersonalInformation.getDateOfBirth());
            existingPersonalInformation.setInstruction(updatedPersonalInformation.getInstruction());
            existingPersonalInformation.setRace(updatedPersonalInformation.getRace());
            existingPersonalInformation.setGender(updatedPersonalInformation.getGender());
            existingPersonalInformation.setNaturalness(updatedPersonalInformation.getNaturalness());
            existingPersonalInformation.setMaritalStatus(updatedPersonalInformation.getMaritalStatus());
            existingPersonalInformation.setBloodGroup(updatedPersonalInformation.getBloodGroup());
            existingPersonalInformation.setMothersName(updatedPersonalInformation.getMothersName());
            existingPersonalInformation.setFathersName(updatedPersonalInformation.getFathersName());
            existingPersonalInformation.setSpousesName(updatedPersonalInformation.getSpousesName());
            existingPersonalInformation.setSocialName(updatedPersonalInformation.getSocialName());
            existingPersonalInformation.setAge(updatedPersonalInformation.getAge());
            personalInformationRepository.save(existingPersonalInformation);
        }
    }

    public void deletePersonalInformation(Long id) {
        personalInformationRepository.deleteById(id);
    }
}
