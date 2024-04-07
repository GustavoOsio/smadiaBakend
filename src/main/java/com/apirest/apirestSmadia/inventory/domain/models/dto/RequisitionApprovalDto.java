package com.apirest.apirestSmadia.inventory.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class RequisitionApprovalDto {

    @JsonView(Views.Extended.class)
    private Long id;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private RequisitionDto requisition;

    /*@JsonView(Views.Extended.class)
    private EmployeeDto employee;*/

    @JsonView(Views.Extended.class)
    private Date dateTime;

    @JsonView(Views.Extended.class)
    private BigDecimal amount;

    @JsonView(Views.Extended.class)
    private String observation;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private SessionDto session;
}
