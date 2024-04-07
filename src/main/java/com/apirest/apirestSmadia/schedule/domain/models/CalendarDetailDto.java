package com.apirest.apirestSmadia.schedule.domain.models;

import com.apirest.apirestSmadia.compcostocenterbundle.domain.models.dto.CompanyDto;
import com.apirest.apirestSmadia.compcostocenterbundle.domain.models.dto.CostCenterDto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;

import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class CalendarDetailDto {

    @JsonView(Views.Extended.class)
    private Long calendarDetailId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Date startDate;

    @JsonView(Views.Extended.class)
    private Date endDate;

    @JsonView(Views.Extended.class)
    private Date startTime;

    @JsonView(Views.Extended.class)
    private Date endTime;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private String description;

    @JsonView(Views.Extended.class)
    private String category;

    @JsonView(Views.Extended.class)
    private CompanyDto company;

    @JsonView(Views.Extended.class)
    private CostCenterDto costCenter;


    private SessionDto session;
}
