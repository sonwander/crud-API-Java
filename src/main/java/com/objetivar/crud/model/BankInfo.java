package com.objetivar.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class BankInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String branchNumber;
    private String bankName;
    private String accountNumber;
    private String accountOperation;

    public BankInfo(String branchNumber, String bankName, String accountNumber, String accountOperation) {
        this.branchNumber = branchNumber;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.accountOperation = accountOperation;
    }
}
