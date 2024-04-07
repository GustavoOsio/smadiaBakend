package com.apirest.apirestSmadia.financial.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class AppointmentContractServiceDetailDto {
    @JsonView(Views.Extended.class)
    private Long id;

    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimisticLock;

    private String sessionName;
    private String description;
    private String comment;
    private String status;

    //private ContractDto contract;
    private SessionDto session;
}
