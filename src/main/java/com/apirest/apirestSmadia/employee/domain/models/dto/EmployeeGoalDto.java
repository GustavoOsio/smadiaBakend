package com.apirest.apirestSmadia.employee.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class EmployeeGoalDto {
    @JsonView(Views.Basic.class)
    private Long employeeGoalId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;
    private String comment;
    private String status;

    private EmployeeDto employee;
   // private BonusDto bonus;
    private SessionDto session;
}
