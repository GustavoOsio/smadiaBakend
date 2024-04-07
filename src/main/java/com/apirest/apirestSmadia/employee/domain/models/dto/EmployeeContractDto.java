package com.apirest.apirestSmadia.employee.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class EmployeeContractDto {

    @JsonView(Views.Basic.class)
    private Long employeeContId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;
    private Integer contractNumber;
    private Date startDate;
    private Date endDate;
    private BigDecimal salary;
    private String status;

    private EmployeeDto employee;
    private SessionDto session;
}
