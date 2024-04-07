package com.apirest.apirestSmadia.shopping.domain.models.dto;

import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
import com.apirest.apirestSmadia.shopping.infrastructure.entity.PurchaseOrder;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;

import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;


import java.math.BigDecimal;
import java.util.Date;

public class PurchaseOrderApprovalDto {

    @JsonView(Views.Extended.class)
    private Long poraId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private PurchaseOrder purchaseOrder;

    @JsonView(Views.Extended.class)
    private Employee employee;

    @JsonView(Views.Extended.class)
    private Employee principalEmployee;

    @JsonView(Views.Extended.class)
    private Date poraDate;
    @JsonView(Views.Extended.class)
    private String poraConsecutive;

    @JsonView(Views.Extended.class)
    private BigDecimal poraAmount;

    @JsonView(Views.Extended.class)
    private String poraObservation;

    @JsonView(Views.Extended.class)
    private String poraStatus;

    @JsonView(Views.Extended.class)
    private String status;

    private Session session;
}
