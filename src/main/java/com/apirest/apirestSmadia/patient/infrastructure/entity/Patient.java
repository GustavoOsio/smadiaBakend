package com.apirest.apirestSmadia.patient.infrastructure.entity;


import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
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
@Table(name = "patients", schema = "common_patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long patientId;

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



    @Column(name = "pt_full_name")
    private String ptFullName;

    @Column(name = "pt_identification_no")
    private String ptIdentificationNo;

    @Column(name = "pt_gender")
    private String ptGender;

    @Column(name = "pt_date_of_birth")
    @Temporal(TemporalType.DATE)
    private Date ptDateOfBirth;

    @Column(name = "pt_eps")
    private String ptEps;

    @Column(name = "pt_service")
    private String ptService;

    @Column(name = "pt_marital_status")
    private String ptMaritalStatus;

    @Column(name = "pt_occupation")
    private String ptOccupation;

    @Column(name = "pt_employment_type")
    private String ptEmploymentType;

    @Column(name = "pt_treatment_of_interest")
    private String ptTreatmentOfInterest;

    @Column(name = "pt_contact_source")
    private String ptContactSource;

    @Column(name = "status")
    private String status;


    @ManyToOne
    @JoinColumn(name = "pt_id_company", referencedColumnName = "company_id", insertable = false, updatable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id", insertable = false, updatable = false)
    private Session session;
}

