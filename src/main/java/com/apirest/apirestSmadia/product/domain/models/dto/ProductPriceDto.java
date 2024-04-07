package com.apirest.apirestSmadia.product.domain.models.dto;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.CostCenter;
import com.apirest.apirestSmadia.provider.infrastructure.entity.Provider;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class ProductPriceDto {
    @JsonView(Views.Extended.class)
    private Long ppId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Date ppDate;

    @JsonView(Views.Extended.class)
    private Integer ppPriority;

    @JsonView(Views.Extended.class)
    private BigDecimal ppUnitValue;

    @JsonView(Views.Extended.class)
    private String ppOrigin;

    @JsonView(Views.Extended.class)
    private String ppNumber;

    @JsonView(Views.Extended.class)
    private Date ppEffectiveDate;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private Provider provider;

  /*  @JsonView(Views.Extended.class)
    private ProductDescriptionDto productDescription;*/

    @JsonView(Views.Extended.class)
    private CostCenter costCenter;


    private Session session;
}
