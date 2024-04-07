package com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity;

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
@Table(name = "cost_center", schema = "common_compcostocenterbundle")
public class CostCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cost_center_id")
    private Long costCenterId;

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

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "company")
    private String company;

    @Column(name = "client")
    private String client;

    @Column(name = "other_code")
    private String otherCode;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_company", referencedColumnName = "company_id", insertable = false, updatable = false)
    private Company companyEntity;

    @ManyToOne
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id", insertable = false, updatable = false)
    private Session session;
}

