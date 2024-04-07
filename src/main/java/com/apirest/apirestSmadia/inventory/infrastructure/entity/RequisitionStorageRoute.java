package com.apirest.apirestSmadia.inventory.infrastructure.entity;

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
@Table(name = "requisition_storage_route", schema = "common_inventory")
public class RequisitionStorageRoute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reqsr_id")
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
    @JoinColumn(name = "reqsr_req_id", referencedColumnName = "req_id", insertable = true, updatable = true)
    private Requisition requisition;

    @Column(name = "reqsr_date_time")
    private Date dateTime;

    @Column(name = "reqsr_description")
    private String description;

    @Column(name = "reqsr_name")
    private String name;

    @Column(name = "reqsr_route")
    private String route;

    @Column(name = "reqsr_type")
    private String type;

    @Column(name = "reqsr_weight")
    private BigDecimal weight;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}
