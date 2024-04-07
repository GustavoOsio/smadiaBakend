package com.apirest.apirestSmadia.shopping.domain.models.dto;

import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
import com.apirest.apirestSmadia.provider.infrastructure.entity.Provider;

import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class PurchaseOrderDto {
    @JsonView(Views.Extended.class)
    private Long pordId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Date pordDate;

    @JsonView(Views.Extended.class)
    private String pordConsecutive;

    @JsonView(Views.Extended.class)
    private String pordQuotation;

    @JsonView(Views.Extended.class)
    private Provider supplier;

    @JsonView(Views.Extended.class)
    private Employee deliverTo;

    @JsonView(Views.Extended.class)
    private Employee buyer;

    @JsonView(Views.Extended.class)
    private String pordBillingAddress;

    @JsonView(Views.Extended.class)
    private Date pordDeadlineDate;

    @JsonView(Views.Extended.class)
    private Date pordDeliveryDate;

    @JsonView(Views.Extended.class)
    private String pordObservation;

    @JsonView(Views.Extended.class)
    private String pordStatus;

    @JsonView(Views.Extended.class)
    private String status;

    private Session session;
}
