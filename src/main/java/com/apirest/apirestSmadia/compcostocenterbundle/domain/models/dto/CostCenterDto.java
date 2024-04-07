package com.apirest.apirestSmadia.compcostocenterbundle.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class CostCenterDto {
    @JsonView(Views.Basic.class)
    private Long costCenterId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;
    private Date date;
    private String code;
    private String name;
    private String company;
    private String client;
    private String otherCode;
    private String status;

    private CompanyDto companyEntity;
    private SessionDto session;
}
