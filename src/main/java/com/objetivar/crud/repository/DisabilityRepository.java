package com.objetivar.crud.repository;
import com.objetivar.crud.model.Disability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisabilityRepository extends JpaRepository<Disability, Long> {
    // Você pode adicionar consultas personalizadas aqui, se necessário
}
