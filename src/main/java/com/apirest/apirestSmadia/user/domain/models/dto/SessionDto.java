package com.apirest.apirestSmadia.user.domain.models.dto;

import com.apirest.apirestSmadia.user.aplication.view.Views;
import com.apirest.apirestSmadia.user.infrastructure.entity.UserTable;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class SessionDto {

    @JsonView(Views.Extended.class)
    private Long sessionId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private UserTable userId;

    @JsonView(Views.Extended.class)
    private String comment;

    @JsonView(Views.Extended.class)
    private String status;
}

