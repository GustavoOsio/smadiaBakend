package com.apirest.apirestSmadia.schedule.domain.models.dto;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.financial.infrastructure.entity.AppointmentContractServiceDetail;

import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class DatingContractDetailDto {

    @JsonView(Views.Extended.class)
    private Long datContDeId;

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
    private String comment;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private AppointmentContractServiceDetail appointmentContractServiceDetail;

    @JsonView(Views.Extended.class)
    private Company company;

    private Session session;
}
