package com.apirest.apirestSmadia.provider.domain.models.dto;

import com.apirest.apirestSmadia.product.infrastructure.entity.ProductLine;
import com.apirest.apirestSmadia.provider.infrastructure.entity.Provider;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class ProductLineSupplierDto {


    @JsonView(Views.Extended.class)
    private Long plsId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private Provider provider;

    @JsonView(Views.Extended.class)
    private ProductLine productLine;

    private Session session;
}
