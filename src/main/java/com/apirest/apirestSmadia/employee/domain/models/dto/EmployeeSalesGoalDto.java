package com.apirest.apirestSmadia.employee.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class EmployeeSalesGoalDto {
    @JsonView(Views.Basic.class)
    private Long idSalesGoal;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;
    private String month;
    private BigDecimal monthlyGoal;
    private BigDecimal bonusPercentage;
    private String status;

    private EmployeeDto employee;
    private SessionDto session;
}
