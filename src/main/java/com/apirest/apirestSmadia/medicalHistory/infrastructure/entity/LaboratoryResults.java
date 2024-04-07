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
@Table(name = "laboratory_results", schema = "common_medical_history")
public class LaboratoryResults {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "results_id")
    private Long resultsId;

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

    @Column(name = "results_date")
    private Date resultsDate;

    @Column(name = "results_details")
    private String resultsDetails;



    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mh_id", referencedColumnName = "mh_id", insertable = true, updatable = true)
    private MedicalHistory medicalHistory;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}
