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
@Table(name = "role", schema = "common_user")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long roleId;

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

    @Column(name = "role_name")
    @NotNull
    private String roleName;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    @NotNull
    private String status;

}
