package com.apirest.apirestSmadia.shopping.infrastructure.entity;

import com.apirest.apirestSmadia.provider.infrastructure.entity.Provider;
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
@Table(name = "purchase_order", schema = "common_shopping")
public class PurchaseOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pord_id")
    private Long pordId;

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

    @Column(name = "pord_date")
    @Temporal(TemporalType.DATE)
    private Date pordDate;

    @Column(name = "pord_consecutive")
    private String pordConsecutive;

    @Column(name = "pord_quotation")
    private String pordQuotation;

    @ManyToOne
    @JoinColumn(name = "pord_supplier_id", referencedColumnName = "provider_id")
    private Provider supplier;

    @ManyToOne
    @JoinColumn(name = "pord_to_id_deliver", referencedColumnName = "employee_id")
    private Employee deliverTo;

    @ManyToOne
    @JoinColumn(name = "pord_buyer_id", referencedColumnName = "employee_id")
    private Employee buyer;

    @Column(name = "pord_billing_address")
    private String pordBillingAddress;

    @Column(name = "pord_deadline_date")
    @Temporal(TemporalType.DATE)
    private Date pordDeadlineDate;

    @Column(name = "pord_delivery_date")
    @Temporal(TemporalType.DATE)
    private Date pordDeliveryDate;

    @Column(name = "pord_observation")
    private String pordObservation;

    @Column(name = "pord_status")
    private String pordStatus;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", nullable = false)
    private Session session;
}
