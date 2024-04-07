package com.apirest.apirestSmadia.employee.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class DepartmentsDto {

    @JsonView(Views.Basic.class)
    private Long departmentId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    private String departmentName;
    private String description;
    private String status;

   // private CompanyDto company;
   // private CostCenterDto costCenter;
    private SessionDto session;
}

