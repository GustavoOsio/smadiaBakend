package com.apirest.apirestSmadia.medicalHistory.domain.models.dto;

import com.apirest.apirestSmadia.provider.infrastructure.entity.Provider;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class MedicationControlDto {

    @JsonView(Views.Extended.class)
    private Long productId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private String productName;

    @JsonView(Views.Extended.class)
    private String productDescription;

    @JsonView(Views.Extended.class)
    private Double price;

    @JsonView(Views.Extended.class)
    private Provider provider;
}
