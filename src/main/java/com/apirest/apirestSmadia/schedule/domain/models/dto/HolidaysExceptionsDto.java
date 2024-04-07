package com.apirest.apirestSmadia.schedule.domain.models.dto;


import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class HolidaysExceptionsDto {
    @JsonView(Views.Extended.class)
    private Long holidayExcepId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Date date;

    @JsonView(Views.Extended.class)
    private Date startTime;

    @JsonView(Views.Extended.class)
    private Date endTime;

    @JsonView(Views.Extended.class)
    private String description;

    @JsonView(Views.Extended.class)
    private String category;

    @JsonView(Views.Extended.class)
    private String type;

    @JsonView(Views.Extended.class)
    private String status;


    private Session session;
}
