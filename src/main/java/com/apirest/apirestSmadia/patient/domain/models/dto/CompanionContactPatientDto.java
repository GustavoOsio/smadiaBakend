package com.apirest.apirestSmadia.patient.domain.models.dto;

import com.apirest.apirestSmadia.patient.infrastructure.entity.Patient;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class CompanionContactPatientDto {
    @JsonView(Views.Extended.class)
    private Long ccpId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Long pctPatientId;

    @JsonView(Views.Extended.class)
    private String ccpName;

    @JsonView(Views.Extended.class)
    private String ccpMobile;

    @JsonView(Views.Extended.class)
    private String ccpRelationship;

    @JsonView(Views.Extended.class)
    private String ccpNote;

    @JsonView(Views.Extended.class)
    private String ccpStatus;

    @JsonView(Views.Extended.class)
    private Patient patient;

    private Session session;

}
