package com.apirest.apirestSmadia.financial.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Timestamp;

@Data
public class PaymentsContractDetailDto {
    @JsonView(Views.Basic.class)
    private Long id;

    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    private BigDecimal amount;
    private BigDecimal balance;
    private Timestamp paymentDate;
    private String comment;
    private String status;

    private ContractDto contract;
    //private PaymentsMethodDto paymentMethod;
   // private CompanyDto company;
    private SessionDto sessionIdSession;
}
