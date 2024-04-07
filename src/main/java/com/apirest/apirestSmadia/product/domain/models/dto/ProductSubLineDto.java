package com.apirest.apirestSmadia.product.domain.models.dto;

import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class ProductSubLineDto {

    @JsonView(Views.Extended.class)
    private Long productSubLineId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Long code;

    @JsonView(Views.Extended.class)
    private String category;

    @JsonView(Views.Extended.class)
    private String comment;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private ProductLineDto productLine;

    private Session session;
}

