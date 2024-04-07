package com.apirest.apirestSmadia.product.domain.models.dto;
import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
import com.apirest.apirestSmadia.product.infrastructure.entity.ProductLine;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class ProductLineAssignmentDto {

    @JsonView(Views.Extended.class)
    private Long productLineAsigId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private String comment;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private Employee employee;

    @JsonView(Views.Extended.class)
    private ProductLineDto productLine;

    @JsonView(Views.Extended.class)
    private ProductLine userSession;

    @JsonView(Views.Extended.class)
    private Company company;

    private Session session;
}
