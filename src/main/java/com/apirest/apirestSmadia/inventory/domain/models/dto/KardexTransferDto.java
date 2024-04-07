package com.apirest.apirestSmadia.inventory.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class KardexTransferDto {

    @JsonView(Views.Extended.class)
    private Long ktId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

 /*   @JsonView(Views.Extended.class)
    private Transfer fromKardexMovement;
    @JsonView(Views.Extended.class)
    private Transfer toKardexMovement;
    @JsonView(Views.Extended.class)
    private Warehouse fromWarehouse;
    @JsonView(Views.Extended.class)
    private Warehouse toWarehouseTransfer;
    @JsonView(Views.Extended.class)
    private Warehouse toWarehouseReceipt;*/

    @JsonView(Views.Extended.class)
    private String status;


    private SessionDto session;
}
