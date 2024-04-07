package com.apirest.apirestSmadia.shopping.domain.models.dto;


import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
import com.apirest.apirestSmadia.shopping.infrastructure.entity.PurchaseOrder;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class PurchaseOrderCorrectionDto {

    @JsonView(Views.Extended.class)
    private Long porcId;

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
    private Date porcDateTime;

    @JsonView(Views.Extended.class)
    private String porcReason;

    @JsonView(Views.Extended.class)
    private String porcObservation;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private Session session;
}
