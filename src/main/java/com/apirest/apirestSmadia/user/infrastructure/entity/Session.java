package com.apirest.apirestSmadia.user.infrastructure.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;


@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "session", schema = "common_user")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "session_id")
    private Long sessionId;

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

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "user_id")
    private UserTable userId;

    @Column(name = "commen")
    private String comment;

    @Column(name = "status")
    private String status;

}
