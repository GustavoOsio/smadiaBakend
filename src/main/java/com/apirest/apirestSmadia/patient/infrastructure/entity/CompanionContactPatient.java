package com.apirest.apirestSmadia.patient.infrastructure.entity;

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
@Table(name = "companion_contact_patient", schema = "common_patient")
public class CompanionContactPatient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ccp_id")
    private Long ccpId;

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

    @Column(name = "pct_patient_id")
    private Long pctPatientId;

    @Column(name = "ccp_name")
    private String ccpName;

    @Column(name = "ccp_mobile")
    private String ccpMobile;

    @Column(name = "ccp_relationship")
    private String ccpRelationship;

    @Column(name = "ccp_note")
    private String ccpNote;

    @Column(name = "ccp_status")
    private String ccpStatus;


    @ManyToOne
    @JoinColumn(name = "pct_patient_id", referencedColumnName = "patient_id", insertable = false, updatable = false)
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id", insertable = false, updatable = false)
    private Session session;
}

