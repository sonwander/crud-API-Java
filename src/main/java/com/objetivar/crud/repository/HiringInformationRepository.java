package com.objetivar.crud.repository;
import com.objetivar.crud.model.HiringInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HiringInformationRepository extends JpaRepository<HiringInformation, Long> {
    // Você pode adicionar consultas personalizadas aqui, se necessário
}
