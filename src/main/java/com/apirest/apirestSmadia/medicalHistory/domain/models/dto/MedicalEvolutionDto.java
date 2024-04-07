package com.apirest.apirestSmadia.medicalHistory.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class MedicalEvolutionDto {

    @JsonView(Views.Extended.class)
    private Long evolutionId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

   // private MedicalHistoryDto medicalHistory;

    @JsonView(Views.Extended.class)
    private Date evolutionDate;

    @JsonView(Views.Extended.class)
    private String evolutionDetails;

    @JsonView(Views.Extended.class)
    private String status;

    private SessionDto session;
}
