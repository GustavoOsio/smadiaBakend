package com.apirest.apirestSmadia.inventory.domain.models.dto;

//import com.apirest.apirestSmadia.product.domain.models.dto.ProductDescriptionDto;
import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class KardexAllocationConfigDto {

    @JsonView(Views.Extended.class)
    private Long kacId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimisticLock;
    private WarehouseDto warehouse;
   // private ProductDescriptionDto productDescription;
    private WarehouseLocationRecordDto warehouseLocationRecord;
   // private ProductBrandDto productBrand;

    private Boolean allocationRequisition;
    private BigDecimal serviceLevel;
    private BigDecimal reorderPoint;
    private BigDecimal demandTime;
    private BigDecimal pinballLoss;
    private String status;

    private SessionDto session;
}
