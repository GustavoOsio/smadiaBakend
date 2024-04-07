package com.apirest.apirestSmadia.medicalHistory.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class SurgicalDescriptionDto {
    @JsonView(Views.Extended.class)
    private Long surgicalId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimisticLock;

    @JsonView(Views.Extended.class)
    private MedicalHistoryDto medicalHistory;

    @JsonView(Views.Extended.class)
    private Date surgicalDate;
    @JsonView(Views.Extended.class)
    private String surgicalDetails;
    @JsonView(Views.Extended.class)
    private String status;

    private SessionDto session;
}
