package com.apirest.apirestSmadia.inventory.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class RequisitionDto {
    @JsonView(Views.Extended.class)
    private Long rqId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Date reqDate;

    @JsonView(Views.Extended.class)
    private String reqConsecutive;

    @JsonView(Views.Extended.class)
    private Long reqIccId;

    @JsonView(Views.Extended.class)
    private Long reqGeneralId;

    @JsonView(Views.Extended.class)
    private Long reqRequestedId;

    @JsonView(Views.Extended.class)
    private Long reqLevelNeedId;

    @JsonView(Views.Extended.class)
    private String reqObservation;

    @JsonView(Views.Extended.class)
    private String reqLocation;

    @JsonView(Views.Extended.class)
    private Date reqStartDate;

    @JsonView(Views.Extended.class)
    private Date reqEndDate;

    @JsonView(Views.Extended.class)
    private Integer reqServiceHours;

    @JsonView(Views.Extended.class)
    private String reqStatus;

    @JsonView(Views.Extended.class)
    private Long reqSupplierId;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private SessionDto session;
}
