package com.apirest.apirestSmadia.medicalHistory.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class DiagnosticAidsDto {

    @JsonView(Views.Extended.class)
    private Long aidsId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    private MedicalHistoryDto medicalHistory;

    @JsonView(Views.Extended.class)
    private Date aidsDate;

    @JsonView(Views.Extended.class)
    private String aidsDetails;

    @JsonView(Views.Extended.class)
    private String status;

    private SessionDto session;
}
