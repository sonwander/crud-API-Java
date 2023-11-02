package com.objetivar.crud.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Documents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long ctpsNumber;
    private String ctpsSeries;
    private boolean fgtsOpting;
    private boolean inssOpting;
    private String reservistCategory;
    private Long reservistNumber;
    private String reservistaCategoria; // Corrigido o nome da propriedade
    private Long reservistaNumero;      // Corrigido o nome da propriedade
    private Long ssn;
    private Long pis;
    private String rg;
    private Date rgIssue;
    private String rgIssuingState;
    private Long driversLicense;
    private char driversLicenseCategory;
    private char driversLicenseState;
    private Date driversLicenseExpirationDate;
    private Date issuanceOfDriversLicense;
}
