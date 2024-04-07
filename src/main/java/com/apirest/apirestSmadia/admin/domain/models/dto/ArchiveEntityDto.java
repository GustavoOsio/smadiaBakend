package com.apirest.apirestSmadia.admin.domain.models.dto;

import com.apirest.apirestSmadia.user.domain.models.dto.SessionDto;
import com.apirest.apirestSmadia.util.view.Views;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.Date;

@Data
public class ArchiveEntityDto {
    @JsonView(Views.Basic.class)
    private Integer taId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;
    private Date taDate;
    private String taConcept;
    private String taName;
    private String taPath;
    private String taType;
    private Integer taWeight;
    private String status;
    private SessionDto session;
}
