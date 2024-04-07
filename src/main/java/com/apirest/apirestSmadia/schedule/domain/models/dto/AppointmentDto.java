package com.apirest.apirestSmadia.schedule.domain.models.dto;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
import com.apirest.apirestSmadia.patient.infrastructure.entity.Patient;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class AppointmentDto {

    @JsonView(Views.Extended.class)
    private Long appointmentId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Date appointmentDate;

    @JsonView(Views.Extended.class)
    private Date startTime;

    @JsonView(Views.Extended.class)
    private Date endTime;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private String typeAppointments;

    @JsonView(Views.Extended.class)
    private Patient patient;

    @JsonView(Views.Extended.class)
    private Employee employee;

    @JsonView(Views.Extended.class)
    private Company company;

    private Session session;
}

