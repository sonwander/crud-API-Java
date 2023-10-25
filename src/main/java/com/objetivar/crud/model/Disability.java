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
public class Disability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean disabilityQuota;
    private boolean physicalDisability;
    private boolean intellectualDisability;
    private boolean mentalDisability;
    private boolean hearingDisability;
    private boolean visualDisability;
}



