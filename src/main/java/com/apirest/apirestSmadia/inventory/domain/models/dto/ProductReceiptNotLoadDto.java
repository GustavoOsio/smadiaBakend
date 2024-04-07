package com.apirest.apirestSmadia.inventory.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class ProductReceiptNotLoadDto {

    @JsonView(Views.Extended.class)
    private Long id;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Date dateTime;

    @JsonView(Views.Extended.class)
    private String reason;

    @JsonView(Views.Extended.class)
    private String observation;

    @JsonView(Views.Extended.class)
    private ProductReceiptDto productReceipt;

   /* @JsonView(Views.Extended.class)
    private EmployeeDto employee;*/

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private SessionDto session;
}