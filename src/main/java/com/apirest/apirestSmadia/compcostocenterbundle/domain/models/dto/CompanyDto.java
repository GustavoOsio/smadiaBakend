package com.apirest.apirestSmadia.compcostocenterbundle.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class CompanyDto {
    @JsonView(Views.Basic.class)
    private Long companyId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;
    private String name;
    private String code;
    private String city;
    private String country;
    private String phone;
    private String email;
    private String status;

    private SessionDto session;
}
