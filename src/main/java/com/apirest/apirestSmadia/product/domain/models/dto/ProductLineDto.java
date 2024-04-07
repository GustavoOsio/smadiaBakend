package com.apirest.apirestSmadia.product.domain.models.dto;
import com.apirest.apirestSmadia.product.infrastructure.entity.ProductType;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class ProductLineDto {

    @JsonView(Views.Extended.class)
    private Long productLineId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Long code;

    @JsonView(Views.Extended.class)
    private String procedure;

    @JsonView(Views.Extended.class)
    private String item;

    @JsonView(Views.Extended.class)
    private String comment;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private ProductType productType;


    private Session session;
}
