package com.apirest.apirestSmadia.user.domain.models.dto;

import com.apirest.apirestSmadia.user.aplication.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class PermissionDto {

    @JsonView(Views.Extended.class)
    private Long permissionId;

    private Date createdAt;

     private Date updatedAt;

    private String updateUser;

    private String updateProgram;

    private Long optimistLock;

    @JsonView(Views.Extended.class)
    @NotEmpty
    private String name;

    @JsonView(Views.Extended.class)
    private String description;

    @JsonView(Views.Extended.class)
    @NotEmpty
    private String status;
}

