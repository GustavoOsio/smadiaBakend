package com.apirest.apirestSmadia.patient.domain.models.dto;
import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class PatientContactDto {

    @JsonView(Views.Extended.class)
    private Long pctId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Long pctPatientId;

    @JsonView(Views.Extended.class)
    private String pctEmail;

    @JsonView(Views.Extended.class)
    private String pctPhone;

    @JsonView(Views.Extended.class)
    private String pctMobile;

    @JsonView(Views.Extended.class)
    private String pctDepartment;

    @JsonView(Views.Extended.class)
    private String pctCity;

    @JsonView(Views.Extended.class)
    private String pctAddress;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private PatientDto patient;

    private SessionDto session;
}

