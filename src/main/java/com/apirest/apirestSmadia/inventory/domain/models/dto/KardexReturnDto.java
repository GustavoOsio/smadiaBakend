package com.apirest.apirestSmadia.inventory.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class KardexReturnDto {

    @JsonView(Views.Extended.class)
    private Long karId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimisticLock;

    @JsonView(Views.Extended.class)
    private KardexMovementDto returnKardexMovement;
    @JsonView(Views.Extended.class)
    private KardexMovementDto exitKardexMovement;
    @JsonView(Views.Extended.class)
    private String status;

    private SessionDto session;
}
