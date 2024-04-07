package com.apirest.apirestSmadia.inventory.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Time;

@Data
public class KardexMovementDto {
    @JsonView(Views.Extended.class)
    private Long id;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimisticLock;

  /*  private ArchiveEntityDto archive;
    private EmployeeDto employeeReceive;
    private EmployeeDto employeeRealize;*/

    @JsonView(Views.Extended.class)
    private Date entryDate;
    @JsonView(Views.Extended.class)
    private Time entryTime;
    @JsonView(Views.Extended.class)
    private String movementType;
    @JsonView(Views.Extended.class)
    private String concept;
    @JsonView(Views.Extended.class)
    private String transaction;
    @JsonView(Views.Extended.class)
    private String consecutive;
    @JsonView(Views.Extended.class)
    private String consecutiveRadicado;
    @JsonView(Views.Extended.class)
    private String shippingAddress;
    @JsonView(Views.Extended.class)
    private String receptionAddress;
    @JsonView(Views.Extended.class)
    private String transportMedium;
    @JsonView(Views.Extended.class)
    private String transportCompany;
    @JsonView(Views.Extended.class)
    private String documentNumber;
    @JsonView(Views.Extended.class)
    private String vehiclePlate;
    @JsonView(Views.Extended.class)
    private String driverName;
    @JsonView(Views.Extended.class)
    private Date expectedDate;
    @JsonView(Views.Extended.class)
    private String packaging;
    @JsonView(Views.Extended.class)
    private BigDecimal piecesNumber;
    @JsonView(Views.Extended.class)
    private String assetNumber;
    @JsonView(Views.Extended.class)
    private String workOrder;
    @JsonView(Views.Extended.class)
    private String signature;
    @JsonView(Views.Extended.class)
    private String digitalSignature;
    @JsonView(Views.Extended.class)
    private String observation;
    @JsonView(Views.Extended.class)
    private String status;

    private SessionDto session;
}
