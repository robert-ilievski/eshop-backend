package com.management.project.eshopbackend.models.users.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@Getter
public class SignInDTO {

    @NotNull
    @NotBlank
    private final String username;

    @NotNull
    @NotBlank
    private final String password;
}
