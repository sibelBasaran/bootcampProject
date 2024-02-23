package com.tobeto.bootcamproject.model.dto.user.request;

import lombok.Getter;

import java.time.LocalDate;

@Getter

public class UserCreateRequest {
    private String userName;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirthday;
    private String nationalIdentity;
    private String email;
    private String password;
}
