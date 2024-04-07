package com.apirest.apirestSmadia.user.domain.models.dto;

import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
import com.apirest.apirestSmadia.user.aplication.view.Views;
import com.apirest.apirestSmadia.user.infrastructure.entity.UserTable;
import lombok.Data;
import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class EmployeeUserDto {

    @JsonView(Views.Extended.class)
    private Long id;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private Employee employeeId;

    @JsonView(Views.Extended.class)
    private UserTable userId;
}
