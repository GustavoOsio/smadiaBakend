package com.apirest.apirestSmadia.shopping.domain.models.dto;

import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
import com.apirest.apirestSmadia.provider.infrastructure.entity.SupplierContact;
import com.apirest.apirestSmadia.shopping.infrastructure.entity.PurchaseOrder;
import com.apirest.apirestSmadia.user.aplication.view.Views;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class PurchaseOrderShipmentDto {

    @JsonView(Views.Extended.class)
    private Long posId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Date posDate;

    @JsonView(Views.Extended.class)
    private Date posTime;

    @JsonView(Views.Extended.class)
    private String posEmail;

    @JsonView(Views.Extended.class)
    private PurchaseOrder purchaseOrder;

    @JsonView(Views.Extended.class)
    private Employee employee;

    @JsonView(Views.Extended.class)
    private SupplierContact supplierContact;

    @JsonView(Views.Extended.class)
    private String status;

    private Session session;
}
