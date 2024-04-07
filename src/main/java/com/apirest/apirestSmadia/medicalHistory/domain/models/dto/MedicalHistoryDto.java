package com.apirest.apirestSmadia.medicalHistory.domain.models.dto;



import com.apirest.apirestSmadia.patient.domain.models.dto.PatientDto;
import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class MedicalHistoryDto {
    @JsonView(Views.Extended.class)
    private Long mhId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;


    private PatientDto patient;

    @JsonView(Views.Extended.class)
    private Date historyDate;

    @JsonView(Views.Extended.class)
    private String historyDescription;

    @JsonView(Views.Extended.class)
    private String status;

    private SessionDto session;
}
