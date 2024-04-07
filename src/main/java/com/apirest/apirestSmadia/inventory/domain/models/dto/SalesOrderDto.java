package com.apirest.apirestSmadia.inventory.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;


import java.util.Date;

@Data
public class SalesOrderDto {
    @JsonView(Views.Extended.class)
    private Long id;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimisticLock;

    /*private EmployeeDto employeeConfirm;
    private EmployeeDto employee;
    private WarehouseDto warehouse;*/
    private Date date;
    private String consecutive;
    private String purchaseOrder;
    private String customerContact;
    private String address;
    private Date deliveryDate;
    private String note;
    private Date confirmationDate;
    private String consecutiveRadicado;
    private String status;
    private String overallStatus;

    private SessionDto session;
}
