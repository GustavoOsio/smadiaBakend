package com.apirest.apirestSmadia.inventory.infrastructure.entity;

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
@Table(name = "sales_invoice_item", schema = "common_inventory")
public class SalesInvoiceItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tvfr_id")
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
    @JoinColumn(name = "tvfr_tvf_id", referencedColumnName = "tvov_id", insertable = true, updatable = true)
    private SalesOrder salesOrder;

    @ManyToOne
    @JoinColumn(name = "tvfr_tkm_id", referencedColumnName = "km_id", insertable = true, updatable = true)
    private KardexMovement kardexMovement;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}
