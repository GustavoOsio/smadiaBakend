package com.apirest.apirestSmadia.product.domain.models.dto;

import com.apirest.apirestSmadia.product.infrastructure.entity.ProductDescription;
import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class ProductBatchDto {

    @JsonView(Views.Extended.class)
    private Long pbId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Long pbProductId;

    @JsonView(Views.Extended.class)
    private Date pbDate;

    @JsonView(Views.Extended.class)
    private String pbCode;

    @JsonView(Views.Extended.class)
    private String pbDescription;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private ProductDescription productDescription;

    @JsonView(Views.Extended.class)
    private SessionDto session;
}

