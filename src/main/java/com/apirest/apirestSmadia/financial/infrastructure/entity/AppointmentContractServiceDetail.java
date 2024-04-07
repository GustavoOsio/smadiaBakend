package com.apirest.apirestSmadia.financial.infrastructure.entity;

import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import lombok.*;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "appointment_contract_service_detail", schema = "common_financial")
public class AppointmentContractServiceDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appo_cont_ser_de_id")
    private Long id;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "update_user")
    private String updateUser;

    @Column(name = "update_program")
    private String updateProgram;

    @Column(name = "optimist_lock")
    private Long optimistLock;


    @Column(name = "session_name", length = 100)
    private String sessionName;

    @Column(name = "description", length = 55)
    private String description;

    @Column(name = "comment", length = 255)
    private String comment;

    @Column(name = "status", length = 20)
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_contract",referencedColumnName = "contract_id", insertable = true, updatable = true)
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id",insertable = true, updatable = true)
    private Session session;

}

