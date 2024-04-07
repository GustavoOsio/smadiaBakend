package com.apirest.apirestSmadia.admin.domain.models.dto;

import com.apirest.apirestSmadia.compcostocenterbundle.domain.models.dto.CompanyDto;
import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class ParameterDto {
    @JsonView(Views.Basic.class)
    private Long parameterId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;
    private String codDevelop;
    private String value;
    private String status;
    private CompanyDto company;
    private SessionDto session;
}
