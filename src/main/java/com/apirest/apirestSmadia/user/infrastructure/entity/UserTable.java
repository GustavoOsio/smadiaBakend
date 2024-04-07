package com.apirest.apirestSmadia.user.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user", schema = "common_user")
public class UserTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;

    @Column(name = "update_user")
    private String updateUser;

    @Column(name = "update_program")
    private String updateProgram;

    @Column(name = "optimist_lock")
    private Long optimistLock;

    @Column(name = "nameuser", unique = true)
    @NotNull
    private String nameUser;

    @Column(name = "password")
    @NotNull
    private String password;

    @Column(name = "status")
    @NotNull
    private String status;

    @Column(name = "comment")
    private String comment;

    @Column(name = "token")
    private String token;

    @Column(name = "token_user")
    private String tokenUser;

    @Column(name = "is_enabled")
    private boolean isEnabled;

    @Column(name = "account_no_expired")
    private boolean accountNoExpired;

    @Column(name = "account_no_locked")
    private boolean accountNoLocked;

    @Column(name = "credential_no_expired")
    private boolean credentialNoExpired;
}