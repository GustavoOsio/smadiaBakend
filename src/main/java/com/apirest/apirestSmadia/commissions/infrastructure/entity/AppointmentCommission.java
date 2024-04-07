package com.apirest.apirestSmadia.commissions.infrastructure.entity;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;

import com.apirest.apirestSmadia.schedule.infrastructure.entity.Appointment;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import lombok.*;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "appointment_commissions", schema = "common_commissions")
public class AppointmentCommission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "app_comm_id")
    private Long appCommId;

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

    @Column(name = "commission_amount")
    private BigDecimal commissionAmount;

    @Column(name = "appointment_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date appointmentDate;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_employee", referencedColumnName = "employee_id", nullable = true)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "id_company", referencedColumnName = "company_id", nullable = true)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "appointment_id", referencedColumnName = "appointment_id", nullable = true)
    private Appointment appointment;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", nullable = true)
    private Session session;
}

