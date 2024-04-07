package com.apirest.apirestSmadia.user.domain.models.dto;

import com.apirest.apirestSmadia.user.aplication.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class RoleDto {

    @JsonView(Views.Extended.class)
    private Long roleId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private String roleName;

    @JsonView(Views.Extended.class)
    private String description;

    @JsonView(Views.Extended.class)
    private String status;
}
