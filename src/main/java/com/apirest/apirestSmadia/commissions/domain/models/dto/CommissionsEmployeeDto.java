package com.apirest.apirestSmadia.commissions.domain.models.dto;

import com.apirest.apirestSmadia.employee.domain.models.dto.EmployeeDto;
import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CommissionsEmployeeDto {
    @JsonView(Views.Basic.class)
    private Long id;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;
    private EmployeeDto employee;
    private BigDecimal commissionAmount;
    private Date commissionDatetime;
    private String status;
    private SessionDto session;
}
