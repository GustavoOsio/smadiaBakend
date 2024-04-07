package com.apirest.apirestSmadia.inventory.domain.models.dto;

//import com.apirest.apirestSmadia.product.domain.models.dto.ProductDescriptionDto;
import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class SalesPriceDto {
    @JsonView(Views.Extended.class)
    private Long id;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimisticLock;

    private Date date;
  //  private ProductDescriptionDto productDescription;
    private BigDecimal salePrice;
    private String origin;
    private String number;
    private Date validity;
    private BigDecimal discount;
    private String status;

    private SessionDto session;
}
