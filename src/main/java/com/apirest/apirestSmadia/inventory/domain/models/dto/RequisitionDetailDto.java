package com.apirest.apirestSmadia.inventory.domain.models.dto;


//import com.apirest.apirestSmadia.product.domain.models.dto.ProductDescriptionDto;
import com.apirest.apirestSmadia.product.domain.models.dto.ProductSubLineDto;
import com.apirest.apirestSmadia.product.domain.models.dto.ProductTypeDto;
import com.apirest.apirestSmadia.shopping.domain.models.dto.PurchaseOrderDetailDto;
import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class RequisitionDetailDto {
    @JsonView(Views.Extended.class)
    private Long id;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private RequisitionDto requisition;

   /*  @JsonView(Views.Extended.class)
    private ProductDescriptionDto productDescription;*/

    @JsonView(Views.Extended.class)
    private ProductSubLineDto productSubLine;

    @JsonView(Views.Extended.class)
    private ProductTypeDto productType;

    @JsonView(Views.Extended.class)
    private PurchaseOrderDetailDto purchaseOrderDetail;

    @JsonView(Views.Extended.class)
    private String observation;

    @JsonView(Views.Extended.class)
    private Integer requestedQuantity;

    @JsonView(Views.Extended.class)
    private Integer approvedQuantity;

    @JsonView(Views.Extended.class)
    private BigDecimal value;

    @JsonView(Views.Extended.class)
    private BigDecimal total;

    @JsonView(Views.Extended.class)
    private String status;

    private SessionDto session;
}
