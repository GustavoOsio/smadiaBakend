package com.apirest.apirestSmadia.user.domain.models.authdto;


import javax.validation.constraints.NotBlank;

public record AuthLoginRequest(@NotBlank String username,
                               @NotBlank String password) {
}
