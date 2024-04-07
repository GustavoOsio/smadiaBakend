package com.apirest.apirestSmadia.medicalHistory.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class AnamnesisDto {

    @JsonView(Views.Extended.class)
    private Long anamnesisId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;


    @JsonView(Views.Extended.class)
    private MedicalHistoryDto medicalHistory;

    @JsonView(Views.Extended.class)
    private Date anamnesisDate;

    @JsonView(Views.Extended.class)
    private String anamnesisDetails;

    @JsonView(Views.Extended.class)
    private String status;

    private SessionDto session;
}

