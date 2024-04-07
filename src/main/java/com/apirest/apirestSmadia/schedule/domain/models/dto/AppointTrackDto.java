package com.apirest.apirestSmadia.schedule.domain.models.dto;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
import com.apirest.apirestSmadia.schedule.infrastructure.entity.Appointment;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class AppointTrackDto {

    @JsonView(Views.Extended.class)
    private Long appointTrackId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Date trackingDate;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private String notes;

    @JsonView(Views.Extended.class)
    private Appointment appointment;

    @JsonView(Views.Extended.class)
    private Employee employee;

    @JsonView(Views.Extended.class)
    private Company company;

    private Session session;
}

