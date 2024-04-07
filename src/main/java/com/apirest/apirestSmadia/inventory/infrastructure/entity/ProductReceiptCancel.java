package com.apirest.apirestSmadia.inventory.infrastructure.entity;

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
@Table(name = "product_receipt_cancel", schema = "common_inventory")
public class ProductReceiptCancel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prc_id")
    private Long id;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_at")
    private Date updatedAt;

    @Column(name = "update_user")
    private String updateUser;

    @Column(name = "update_program")
    private String updateProgram;

    @Column(name = "optimist_lock")
    private Long optimistLock;

    @ManyToOne
    @JoinColumn(name = "prc_pr_id", referencedColumnName = "pr_id", insertable = true, updatable = true)
    private ProductReceipt productReceipt;

    @ManyToOne
    @JoinColumn(name = "prc_te_id", referencedColumnName = "employee_id", insertable = true, updatable = true)
    private Employee employee;

    @Column(name = "prc_date_time")
    private Date dateTime;

    @Column(name = "prc_reason")
    private String reason;

    @Column(name = "prc_observation")
    private String observation;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;


}
