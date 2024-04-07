package com.apirest.apirestSmadia.user.domain.models.dto;
import com.apirest.apirestSmadia.user.aplication.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class UserDto {

    @JsonView(Views.Extended.class)
    private Long userId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private String nameUser;

    @JsonView(Views.Extended.class)
    private String password;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private String comment;

    @JsonView(Views.Extended.class)
    private String token;

    @JsonView(Views.Extended.class)
    private String tokenUser;

    @JsonView(Views.Extended.class)
    private boolean isEnabled;

    @JsonView(Views.Extended.class)
    private boolean accountNoExpired;

    @JsonView(Views.Extended.class)
    private boolean accountNoLocked;

    @JsonView(Views.Extended.class)
    private boolean credentialNoExpired;
}
