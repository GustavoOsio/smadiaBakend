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
@Table(name = "cosmetology_evolution", schema = "common_medical_history")
public class CosmetologyEvolution {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cosmetology_id")
    private Long cosmetologyId;

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

    @Column(name = "cosmetology_date")
    private Date cosmetologyDate;

    @Column(name = "cosmetology_details")
    private String cosmetologyDetails;

    @Column(name = "status")
    private String status;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mh_id", referencedColumnName = "mh_id", insertable = true, updatable = true)
    private MedicalHistory medicalHistory;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}
