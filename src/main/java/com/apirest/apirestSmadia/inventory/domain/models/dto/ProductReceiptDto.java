package com.apirest.apirestSmadia.inventory.domain.models.dto;

import com.apirest.apirestSmadia.shopping.domain.models.dto.PurchaseOrderDto;
import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import java.sql.Time;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class ProductReceiptDto {
    @JsonView(Views.Extended.class)
    private Long id;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private String consecutiveFiled;

    @JsonView(Views.Extended.class)
    private Date entryDate;

    @JsonView(Views.Extended.class)
    private Time entryTime;

    @JsonView(Views.Extended.class)
    private String shippingNote;

    @JsonView(Views.Extended.class)
    private Date shippingDate;

    @JsonView(Views.Extended.class)
    private String shippingElaborate;

    @JsonView(Views.Extended.class)
    private String paymentMethod;

    @JsonView(Views.Extended.class)
    private String location;

    @JsonView(Views.Extended.class)
    private String transportMedium;

    @JsonView(Views.Extended.class)
    private String packaging;

    @JsonView(Views.Extended.class)
    private String observation;

    @JsonView(Views.Extended.class)
    private String status;

  /*  @JsonView(Views.Extended.class)
    private WarehouseDto warehouse;

    @JsonView(Views.Extended.class)
    private EmployeeDto employee;*/

    @JsonView(Views.Extended.class)
    private PurchaseOrderDto purchaseOrder;

    @JsonView(Views.Extended.class)
    private String overallStatus;

    private SessionDto session;
}
