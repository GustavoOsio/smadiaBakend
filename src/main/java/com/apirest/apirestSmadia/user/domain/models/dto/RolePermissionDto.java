package com.apirest.apirestSmadia.user.domain.models.dto;

import com.apirest.apirestSmadia.user.aplication.view.Views;
import com.apirest.apirestSmadia.user.infrastructure.entity.Permission;
import com.apirest.apirestSmadia.user.infrastructure.entity.Role;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class RolePermissionDto {
    @JsonView(Views.Extended.class)
    private Long rolePermissionId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Role role;

    @JsonView(Views.Extended.class)
    private Permission permission;

    @JsonView(Views.Extended.class)
    private String status;
}

