package com.apirest.apirestSmadia.financial.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class PaymentsMethodDto {
    @JsonView(Views.Basic.class)
    private Long id;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    private String paymentMethod;
    private String comment;
    private String status;

    private SessionDto sessionIdSession;
}
