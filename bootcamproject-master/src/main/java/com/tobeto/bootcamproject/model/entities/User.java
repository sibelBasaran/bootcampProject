package com.tobeto.bootcamproject.model.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name="USERS")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Integer id;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "DATE_OF_BIRTHDAY")
    private LocalDate dateOfBirthday;
    @Column(name = "NATIONAL_IDENTITY")
    private String nationalIdentity;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PASSWORD")
    private String password;


}
