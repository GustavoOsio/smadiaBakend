package com.apirest.apirestSmadia.shopping.infrastructure.entity;

import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
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
@Table(name = "purchase_order_approval", schema = "common_shopping")
public class PurchaseOrderApproval {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pora_id")
    private Long poraId;

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
    @JoinColumn(name = "pora_pord_id", referencedColumnName = "pord_id")
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    @JoinColumn(name = "pora_employee_id", referencedColumnName = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "pora_principal_employee_id", referencedColumnName = "employee_id")
    private Employee principalEmployee;

    @Column(name = "pora_date")
    @Temporal(TemporalType.DATE)
    private Date poraDate;

    @Column(name = "pora_consecutive")
    private String poraConsecutive;

    @Column(name = "pora_amount")
    private BigDecimal poraAmount;

    @Column(name = "pora_observation")
    private String poraObservation;

    @Column(name = "pora_status")
    private String poraStatus;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", nullable = false)
    private Session session;
}
