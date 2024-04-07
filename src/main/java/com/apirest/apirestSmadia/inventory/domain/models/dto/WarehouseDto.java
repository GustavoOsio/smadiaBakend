package com.apirest.apirestSmadia.inventory.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class WarehouseDto {

    @JsonView(Views.Extended.class)
    private Long id;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimisticLock;

   /* private EmployeeDto manager;
    private EmployeeDto adjustment;
    private CostCenterDto costCenter;*/
    private Date startDate;
    private String code;
    private String description;
    private String type;
    private String classification;
    private String address;
    private String status;
    private String overallStatus;

    private SessionDto session;
}
