package com.tobeto.bootcamproject.model.dto.applicant.response;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ApplicantResponse {
    private Integer id;
    private String userName;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirthday;
    private String nationalIdentity;
    private String email;
}
