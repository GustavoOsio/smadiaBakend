package com.apirest.apirestSmadia.financial.infrastructure.entity;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.CostCenter;
import com.apirest.apirestSmadia.schedule.infrastructure.entity.Appointment;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import lombok.*;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "budget", schema = "common_financial")
public class Budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "budget_id")
    private Long id;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "update_user")
    private String updateUser;

    @Column(name = "update_program")
    private String updateProgram;

    @Column(name = "optimist_lock")
    private Long optimistLock;

    @Column(name = "code", unique = true, nullable = false, length = 255)
    private String code;

    @Column(name = "comment")
    private String comment;

    @Column(name = "status", length = 20)
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_appointments",referencedColumnName = "appointment_id",nullable = false)
    private Appointment appointment;


    @ManyToOne
    @JoinColumn(name = "id_company",referencedColumnName = "company_id",nullable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "id_cost_center",referencedColumnName = "cost_center_id", nullable = false)
    private CostCenter costCenter;

    @ManyToOne
    @JoinColumn(name = "session_id_session",referencedColumnName = "session_id", nullable = false)
    private Session sessionIdSession;

}
