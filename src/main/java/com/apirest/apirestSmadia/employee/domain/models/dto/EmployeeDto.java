package com.apirest.apirestSmadia.employee.domain.models.dto;

import com.apirest.apirestSmadia.schedule.domain.models.dto.CalendarDto;
import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class EmployeeDto {
    @JsonView(Views.Basic.class)
    private Long employeeId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String specialty;
    private String status;

    //private CostCenterDto costCenter;
    private CalendarDto calendar;
    private SessionDto session;
}
