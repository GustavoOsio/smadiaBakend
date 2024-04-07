package com.apirest.apirestSmadia.commissions.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class BonusDto {
    @JsonView(Views.Basic.class)
    private Long bonusId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;
    private String code;
    private String description;
    private String comment;
    private String status;

    private SessionDto session;
}
