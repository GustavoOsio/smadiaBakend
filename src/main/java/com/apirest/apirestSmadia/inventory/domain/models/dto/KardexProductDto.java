package com.apirest.apirestSmadia.inventory.domain.models.dto;

//import com.apirest.apirestSmadia.product.domain.models.dto.ProductDescriptionDto;
import com.apirest.apirestSmadia.product.domain.models.dto.ProductSubLineDto;
import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class KardexProductDto {

    @JsonView(Views.Extended.class)
    private Long kpId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimisticLock;

   /* private KardexMovementDto kardexMovement;
    private CostCenterDto costCenter;
    private KardexAllocationConfigDto kardexAllocationConfig;
    private ProductDescriptionDto productDescription;
    private ProductSubLineDto productSubLine;
    private ProductBrandDto productBrand;
    private WarehouseLocationDto warehouseLocation;
    private SalesOrderDto salesOrder;
    private ProductReceiptDetailDto productReceiptDetail;*/

    @JsonView(Views.Extended.class)
    private Long entryQuantity;
    @JsonView(Views.Extended.class)
    private BigDecimal entryUnitValue;
    @JsonView(Views.Extended.class)
    private BigDecimal entryTotalValue;
    @JsonView(Views.Extended.class)
    private Long exitQuantity;
    @JsonView(Views.Extended.class)
    private BigDecimal exitUnitValue;
    @JsonView(Views.Extended.class)
    private BigDecimal exitTotalValue;
    private Long balanceQuantity;
    @JsonView(Views.Extended.class)
    private BigDecimal balanceUnitValue;
    @JsonView(Views.Extended.class)
    private BigDecimal balanceTotalValue;
    @JsonView(Views.Extended.class)
    private Long physicalCount;
    @JsonView(Views.Extended.class)
    private String observation;
    @JsonView(Views.Extended.class)
    private String status;

    private SessionDto session;
}
