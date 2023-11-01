package com.objetivar.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
public class HiringInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long registrationId;

    private Date admissionDate;
    private String status;
    private String contractType;
    private float baseSalary;
    private String salaryUnit;
    private String typeOfWorkingDay;
    private Date contractEndDate;
    private boolean isFirstJob;
    private String unionType;
    private Date experienceEndDate1;
    private Date experienceEndDate2;
}
