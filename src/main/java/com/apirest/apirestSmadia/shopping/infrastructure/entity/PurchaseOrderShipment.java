package com.apirest.apirestSmadia.shopping.infrastructure.entity;

import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
import com.apirest.apirestSmadia.provider.infrastructure.entity.SupplierContact;
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
@Table(name = "purchase_order_shipment", schema = "common_shopping")
public class PurchaseOrderShipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pos_id")
    private Long posId;

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

    @Column(name = "pos_date")
    @Temporal(TemporalType.DATE)
    private Date posDate;

    @Column(name = "pos_time")
    @Temporal(TemporalType.TIME)
    private Date posTime;

    @Column(name = "pos_email")
    private String posEmail;

    @ManyToOne
    @JoinColumn(name = "pos_po_id", referencedColumnName = "pord_id")
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    @JoinColumn(name = "pos_te_id", referencedColumnName = "employee_id")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "pos_tpvc_id", referencedColumnName = "sc_id")
    private SupplierContact supplierContact;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", nullable = false)
    private Session session;
}
