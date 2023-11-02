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
public class PersonalInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date dateOfBirth;
    private String instruction;
    private String race;
    private char gender;
    private String naturalness;
    private String maritalStatus;
    private char bloodGroup;
    private String mothersName;
    private String fathersName;
    private String spousesName;
    private String socialName;
    private int age;
}