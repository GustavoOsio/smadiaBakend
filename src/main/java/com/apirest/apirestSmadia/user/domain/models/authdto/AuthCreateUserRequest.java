package com.apirest.apirestSmadia.user.domain.models.authdto;


import javax.validation.Valid;
import javax.validation.constraints.NotBlank;

public record AuthCreateUserRequest(@NotBlank String username,
                                    @NotBlank String password,
                                    @Valid AuthCreateRoleRequest roleRequest) {
}
