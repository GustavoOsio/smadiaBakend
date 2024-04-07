package com.apirest.apirestSmadia.financial.domain.models.dto;

//import com.apirest.apirestSmadia.product.domain.models.dto.ProductDescriptionDto;
import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class ProductsMakeDetailDto {
    @JsonView(Views.Basic.class)
    private Long id;

    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    private Boolean isBonus;
    private Double amountProduct;
    private String status;

    private BudgetDto budget;
  //  private ProductDescriptionDto productDescription;
   // private CompanyDto company;
    private SessionDto session;
}
