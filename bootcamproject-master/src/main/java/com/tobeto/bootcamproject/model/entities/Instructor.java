package com.tobeto.bootcamproject.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "INSTRUCTORS")
public class Instructor extends User {

    @Column(name = "COMPANY_NAME")
    private String companyName;

}