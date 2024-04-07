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
@Table(name = "kardex_transfer", schema = "common_inventory")
public class KardexTransfer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kt_id")
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
    @JoinColumn(name = "kt_from_km_id_transfer", referencedColumnName = "km_id", insertable = true, updatable = true)
    private KardexMovement fromKardexMovement;

    @ManyToOne
    @JoinColumn(name = "kt_to_km_id_receipt", referencedColumnName = "km_id", insertable = true, updatable = true)
    private KardexMovement toKardexMovement;

    @ManyToOne
    @JoinColumn(name = "kt_from_wh_id_transfer", referencedColumnName = "wh_id", insertable = true, updatable = true)
    private Warehouse fromWarehouse;

    @ManyToOne
    @JoinColumn(name = "kt_to_wh_id_transfer", referencedColumnName = "wh_id", insertable = true, updatable = true)
    private Warehouse toWarehouseTransfer;

    @ManyToOne
    @JoinColumn(name = "kt_to_wh_id_receipt", referencedColumnName = "wh_id", insertable = true, updatable = true)
    private Warehouse toWarehouseReceipt;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}

