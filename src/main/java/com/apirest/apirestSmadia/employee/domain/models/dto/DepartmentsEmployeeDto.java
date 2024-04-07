package com.apirest.apirestSmadia.employee.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class DepartmentsEmployeeDto {

    @JsonView(Views.Basic.class)
    private Long departamentProfessId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;
    private String comment;
    private String status;

  /*  private EmployeeDto employee;
    private DepartamentDto departament;
    private BonusDto bonus;
    private CompanyDto company;
    private CostCenterDto costCenter;*/
    private SessionDto session;
}
