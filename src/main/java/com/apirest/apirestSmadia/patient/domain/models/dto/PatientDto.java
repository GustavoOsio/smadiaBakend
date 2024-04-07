package com.apirest.apirestSmadia.patient.domain.models.dto;


import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import java.util.Date;

@Data
public class PatientDto {
    @JsonView(Views.Extended.class)
    private Long patientId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private String ptFullName;

    @JsonView(Views.Extended.class)
    private String ptIdentificationNo;

    @JsonView(Views.Extended.class)
    private String ptGender;

    @JsonView(Views.Extended.class)
    private Date ptDateOfBirth;

    @JsonView(Views.Extended.class)
    private String ptEps;

    @JsonView(Views.Extended.class)
    private String ptService;

    @JsonView(Views.Extended.class)
    private String ptMaritalStatus;

    @JsonView(Views.Extended.class)
    private String ptOccupation;

    @JsonView(Views.Extended.class)
    private String ptEmploymentType;

    @JsonView(Views.Extended.class)
    private String ptTreatmentOfInterest;

    @JsonView(Views.Extended.class)
    private String ptContactSource;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private Company company;

    @JsonView(Views.Extended.class)
    private Session session;
}
