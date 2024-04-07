package com.apirest.apirestSmadia.schedule.infrastructure.entity;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.CostCenter;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "calendar", schema = "common_schedule")
public class Calendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "calendar_id")
    private Long calendarId;

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

    @Column(name = "code")
    private String code;

    @Column(name = "description")
    private String description;

    @Column(name = "comment")
    private String comment;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_company", referencedColumnName = "company_id", insertable = true, updatable = true)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "id_cost_center", referencedColumnName = "cost_center_id", insertable = true, updatable = true)
    private CostCenter costCenter;

    @ManyToOne
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;
}
