package com.apirest.apirestSmadia.inventory.infrastructure.entity;
import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
import com.apirest.apirestSmadia.shopping.infrastructure.entity.PurchaseOrder;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import lombok.*;
import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product_receipt", schema = "common_inventory")
public class ProductReceipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pr_id")
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

    @Column(name = "pr_consecutive_filed")
    private String consecutiveFiled;

    @Column(name = "pr_entry_date")
    private Date entryDate;

    @Column(name = "pr_entry_time")
    private Time entryTime;

    @Column(name = "pr_shipping_note")
    private String shippingNote;

    @Column(name = "pr_shipping_date")
    private Date shippingDate;

    @Column(name = "pr_shipping_elaborate")
    private String shippingElaborate;

    @Column(name = "pr_payment_method")
    private String paymentMethod;

    @Column(name = "pr_location")
    private String location;

    @Column(name = "pr_transport_medium")
    private String transportMedium;

    @Column(name = "pr_packaging")
    private String packaging;

    @Column(name = "pr_observation")
    private String observation;

    @Column(name = "pr_status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "pr_talm_id", referencedColumnName = "wh_id", insertable = true, updatable = true)
    private Warehouse warehouse;

    @ManyToOne
    @JoinColumn(name = "pr_te_id", referencedColumnName = "employee_id", insertable = true, updatable = true)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "pr_pord_id", referencedColumnName = "pord_id", insertable = true, updatable = true)
    private PurchaseOrder purchaseOrder;

    @Column(name = "status")
    private String overallStatus;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}

