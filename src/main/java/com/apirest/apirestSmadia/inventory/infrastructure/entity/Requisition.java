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
@Table(name = "requisition", schema = "common_inventory")
public class Requisition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "req_id")
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

    @Column(name = "req_date")
    private Date reqDate;

    @Column(name = "req_consecutive")
    private String reqConsecutive;

    @Column(name = "req_icc_id")
    private Long reqIccId;

    @Column(name = "req_general_id")
    private Long reqGeneralId;

    @Column(name = "req_requested_id")
    private Long reqRequestedId;

    @Column(name = "req_level_need_id")
    private Long reqLevelNeedId;

    @Column(name = "req_observation")
    private String reqObservation;

    @Column(name = "req_location")
    private String reqLocation;

    @Column(name = "req_start_date")
    private Date reqStartDate;

    @Column(name = "req_end_date")
    private Date reqEndDate;

    @Column(name = "req_service_hours")
    private Integer reqServiceHours;

    @Column(name = "req_status")
    private String reqStatus;

    @Column(name = "req_supplier_id")
    private Long reqSupplierId;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}


