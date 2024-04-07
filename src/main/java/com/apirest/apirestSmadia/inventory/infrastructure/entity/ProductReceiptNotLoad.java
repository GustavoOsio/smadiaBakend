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
@Table(name = "product_receipt_not_load", schema = "common_inventory")
public class ProductReceiptNotLoad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prnl_id")
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

    @Column(name = "prnl_date_time")
    private Date dateTime;

    @Column(name = "prnl_reason")
    private String reason;

    @Column(name = "prnl_observation")
    private String observation;

    @ManyToOne
    @JoinColumn(name = "prnl_pr_id", referencedColumnName = "pr_id", insertable = true, updatable = true)
    private ProductReceipt productReceipt;

    @ManyToOne
    @JoinColumn(name = "prnl_te_id", referencedColumnName = "employee_id", insertable = true, updatable = true)
    private Employee employee;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}
