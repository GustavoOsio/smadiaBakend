package com.apirest.apirestSmadia.financial.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class ContractDto {
    @JsonView(Views.Extended.class)
    private Long id;

    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    private String code;
    private String status;

    private BudgetDto budget;
   // private CompanyDto company;
   // private EmployeeDto professional;
   // private CostCenterDto costCenter;
    private SessionDto sessionIdSession;
}
