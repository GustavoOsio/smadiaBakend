package com.apirest.apirestSmadia.employee.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class EmployeeContactDto {
    @JsonView(Views.Basic.class)
    private Long pctId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;
    private String pctEmail;
    private String pctPhone;
    private String pctMobile;
    private String pctDepartment;
    private String pctCity;
    private String pctAddress;
    private String status;

    private EmployeeDto employee;
    private SessionDto session;
}
