package com.apirest.apirestSmadia.medicalHistory.infrastructure.entity;

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
@Table(name = "anamnesis", schema = "common_medical_history")
public class Anamnesis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "anamnesis_id")
    private Long anamnesisId;

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

    @ManyToOne
    @JoinColumn(name = "mh_id", referencedColumnName = "mh_id")
    private MedicalHistory medicalHistory;

    @Column(name = "anamnesis_date")
    @Temporal(TemporalType.DATE)
    private Date anamnesisDate;

    @Column(name = "anamnesis_details")
    @Lob
    private String anamnesisDetails;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id")
    private Session session;
}

