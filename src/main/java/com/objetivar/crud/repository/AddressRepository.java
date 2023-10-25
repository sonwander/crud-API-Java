package com.objetivar.crud.repository;
import com.objetivar.crud.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
    // Você pode adicionar consultas personalizadas aqui, se necessário
}
