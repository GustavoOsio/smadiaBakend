package com.apirest.apirestSmadia.shopping.domain.models.dto;

import com.apirest.apirestSmadia.product.infrastructure.entity.ProductDescription;
import com.apirest.apirestSmadia.shopping.infrastructure.entity.PurchaseOrder;
import com.apirest.apirestSmadia.user.aplication.view.Views;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class PurchaseOrderDetailDto {


    @JsonView(Views.Extended.class)
    private Long porddId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private PurchaseOrder purchaseOrder;

    @JsonView(Views.Extended.class)
    private ProductDescription product;

    @JsonView(Views.Extended.class)
    private Long porddReqdId;

    @JsonView(Views.Extended.class)
    private Long porddQuantity;

    @JsonView(Views.Extended.class)
    private BigDecimal porddGrossValue;

    @JsonView(Views.Extended.class)
    private BigDecimal porddDiscount;

    @JsonView(Views.Extended.class)
    private BigDecimal porddDiscountedValue;

    @JsonView(Views.Extended.class)
    private BigDecimal porddNetValue;

    @JsonView(Views.Extended.class)
    private BigDecimal porddTotalValue;

    @JsonView(Views.Extended.class)
    private BigDecimal porddAdministration;

    @JsonView(Views.Extended.class)
    private BigDecimal porddUnforeseen;

    @JsonView(Views.Extended.class)
    private BigDecimal porddProfit;

    @JsonView(Views.Extended.class)
    private BigDecimal porddIco;

    @JsonView(Views.Extended.class)
    private BigDecimal porddTax;

    @JsonView(Views.Extended.class)
    private BigDecimal porddAdministrationValue;

    @JsonView(Views.Extended.class)
    private BigDecimal porddUnforeseenValue;

    @JsonView(Views.Extended.class)
    private BigDecimal porddProfitValue;

    @JsonView(Views.Extended.class)
    private BigDecimal porddIcoValue;

    @JsonView(Views.Extended.class)
    private BigDecimal porddTaxValue;

    @JsonView(Views.Extended.class)
    private String porddObservation;

    @JsonView(Views.Extended.class)
    private Long porddTurId;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private Session session;

}
