package com.apirest.apirestSmadia.shopping.infrastructure.entity;


import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
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
@Table(name = "purchase_order_correction", schema = "common_shopping")
public class PurchaseOrderCorrection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "porc_id")
    private Long porcId;

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
    @JoinColumn(name = "porc_pord_id", referencedColumnName = "pord_id")
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    @JoinColumn(name = "porc_employee_id", referencedColumnName = "employee_id")
    private Employee employee;

    @Column(name = "porc_date_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date porcDateTime;

    @Column(name = "porc_reason")
    private String porcReason;

    @Column(name = "porc_observation")
    private String porcObservation;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", nullable = false)
    private Session session;
}
