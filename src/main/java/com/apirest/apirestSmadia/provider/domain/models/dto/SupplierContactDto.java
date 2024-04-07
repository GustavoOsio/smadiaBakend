package com.apirest.apirestSmadia.provider.domain.models.dto;


import com.apirest.apirestSmadia.provider.infrastructure.entity.Provider;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class SupplierContactDto {

    @JsonView(Views.Extended.class)
    private Long scId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private String scType;

    @JsonView(Views.Extended.class)
    private String scCode;

    @JsonView(Views.Extended.class)
    private String scName;

    @JsonView(Views.Extended.class)
    private String scPosition;

    @JsonView(Views.Extended.class)
    private String scCellphone;

    @JsonView(Views.Extended.class)
    private String scEmail;

    @JsonView(Views.Extended.class)
    private Provider provider;

    private Session session;
}
