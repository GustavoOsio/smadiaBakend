package com.apirest.apirestSmadia.inventory.infrastructure.entity;

import com.apirest.apirestSmadia.admin.infrastructure.entity.ArchiveEntity;
import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import lombok.*;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Time;
import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "kardex_movement", schema = "common_inventory")
public class KardexMovement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "km_id")
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
    @JoinColumn(name = "km_ta_id", referencedColumnName = "ta_id", insertable = true, updatable = true)
    private ArchiveEntity archive;

    @ManyToOne
    @JoinColumn(name = "km_te_id_receive", referencedColumnName = "employee_id", insertable = true, updatable = true)
    private Employee employeeReceive;

    @ManyToOne
    @JoinColumn(name = "km_te_id_realize", referencedColumnName = "employee_id", insertable = true, updatable = true)
    private Employee employeeRealize;

    @Column(name = "km_entry_date")
    private Date entryDate;

    @Column(name = "km_entry_time")
    private Time entryTime;

    @Column(name = "km_movement_type")
    private String movementType;

    @Column(name = "km_concept")
    private String concept;

    @Column(name = "km_transaction")
    private String transaction;

    @Column(name = "km_consecutive")
    private String consecutive;

    @Column(name = "km_consecutive_radicado")
    private String consecutiveRadicado;

    @Column(name = "km_shipping_address")
    private String shippingAddress;

    @Column(name = "km_reception_address")
    private String receptionAddress;

    @Column(name = "km_transport_medium")
    private String transportMedium;

    @Column(name = "km_transport_company")
    private String transportCompany;

    @Column(name = "km_document_number")
    private String documentNumber;

    @Column(name = "km_vehicle_plate")
    private String vehiclePlate;

    @Column(name = "km_driver_name")
    private String driverName;

    @Column(name = "km_expected_date")
    private Date expectedDate;

    @Column(name = "km_packaging")
    private String packaging;

    @Column(name = "km_pieces_number")
    private BigDecimal piecesNumber;

    @Column(name = "km_asset_number")
    private String assetNumber;

    @Column(name = "km_work_order")
    private String workOrder;

    @Column(name = "km_signature")
    private String signature;

    @Column(name = "km_digital_signature")
    private String digitalSignature;

    @Column(name = "km_observation")
    private String observation;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}

