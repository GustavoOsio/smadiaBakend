package com.apirest.apirestSmadia.commissions.domain.models.dto;

import com.apirest.apirestSmadia.compcostocenterbundle.domain.models.dto.CompanyDto;
import com.apirest.apirestSmadia.employee.domain.models.dto.EmployeeDto;
import com.apirest.apirestSmadia.schedule.domain.models.dto.AppointmentDto;
import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AppointmentCommissionDto {
    @JsonView(Views.Basic.class)
    private Long appCommId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;
    private BigDecimal commissionAmount;
    private Date appointmentDate;
    private String status;

    private EmployeeDto employee;
    private CompanyDto company;
    private AppointmentDto appointment;
    private SessionDto session;
}
