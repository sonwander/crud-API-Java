package com.objetivar.crud.repository;
import com.objetivar.crud.model.PersonalInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalInformationRepository extends JpaRepository<PersonalInformation, Long> {
    // Você pode adicionar consultas personalizadas aqui, se necessário
}
