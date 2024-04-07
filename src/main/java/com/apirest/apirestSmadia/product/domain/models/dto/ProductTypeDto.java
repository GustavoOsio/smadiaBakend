package com.apirest.apirestSmadia.product.domain.models.dto;


import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class ProductTypeDto {

    @JsonView(Views.Extended.class)
    private Long productTypeId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private String type;

    @JsonView(Views.Extended.class)
    private String name;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private String comment;

    @JsonView(Views.Extended.class)
    private Company company;

    @JsonView(Views.Extended.class)
    private Session session;
}
