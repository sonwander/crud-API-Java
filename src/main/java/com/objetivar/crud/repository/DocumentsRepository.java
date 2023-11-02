package com.objetivar.crud.repository;
import com.objetivar.crud.model.Documents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentsRepository extends JpaRepository<Documents, Long> {
    // Você pode adicionar consultas personalizadas aqui, se necessário
}
