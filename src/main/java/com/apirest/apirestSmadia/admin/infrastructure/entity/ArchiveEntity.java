package com.apirest.apirestSmadia.admin.infrastructure.entity;

import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import lombok.*;
import jakarta.persistence.*;
import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "archive", schema = "common_admin")
public class ArchiveEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ta_id")
    private Integer taId;

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

    @Column(name = "ta_date")
    @Temporal(TemporalType.DATE)
    private Date taDate;

    @Column(name = "ta_concept")
    private String taConcept;

    @Column(name = "ta_name")
    private String taName;

    @Column(name = "ta_path")
    private String taPath;

    @Column(name = "ta_type")
    private String taType;

    @Column(name = "ta_weight")
    private Integer taWeight;

    @Column(name = "status")
    private String status;


    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = false, updatable = false)
    private Session session;
}
