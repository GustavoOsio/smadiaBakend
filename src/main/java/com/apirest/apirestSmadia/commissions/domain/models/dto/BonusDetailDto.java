package com.apirest.apirestSmadia.commissions.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class BonusDetailDto {
    @JsonView(Views.Basic.class)
    private Long bonusDetailId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;
    private String codeDevelop;
    private BigDecimal value;
    private BigDecimal compliancePercentage;
    private BigDecimal notCompliancePercentage;
    private String comment;
    private String status;

    private BonusDto bonus;
    private SessionDto session;
}
