package com.tobeto.bootcamproject.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name ="APPLICANTS")
public class Applicant extends User{
    @Column(name = "ABOUT")
    private String about;
}
