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
@Table(name = "sales_order", schema = "common_inventory")
public class SalesOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tvov_id")
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
    @JoinColumn(name = "tvov_te_id_confirm", referencedColumnName = "employee_id", insertable = true, updatable = true)
    private Employee employeeConfirm;

    @ManyToOne
    @JoinColumn(name = "tvov_te_id", referencedColumnName = "employee_id", insertable = true, updatable = true)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "tvov_talm_id", referencedColumnName = "wh_id", insertable = true, updatable = true)
    private Warehouse warehouse;

    @Column(name = "tvov_date")
    private Date date;

    @Column(name = "tvov_consecutive")
    private String consecutive;

    @Column(name = "tvov_purchase_order")
    private String purchaseOrder;

    @Column(name = "tvov_customer_contact")
    private String customerContact;

    @Column(name = "tvov_address")
    private String address;

    @Column(name = "tvov_delivery_date")
    private Date deliveryDate;

    @Column(name = "tvov_note")
    private String note;

    @Column(name = "tvov_confirmation_date")
    private Date confirmationDate;

    @Column(name = "tvov_consecutive_radicado")
    private String consecutiveRadicado;

    @Column(name = "tvov_status")
    private String status;

    @Column(name = "status")
    private String overallStatus;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}

