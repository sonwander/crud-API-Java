package com.objetivar.crud.repository;
import com.objetivar.crud.model.BankInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankInfoRepository extends JpaRepository<BankInfo, Long> {
    // Você pode adicionar consultas personalizadas aqui, se necessário
}
