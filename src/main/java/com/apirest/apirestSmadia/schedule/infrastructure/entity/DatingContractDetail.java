package com.apirest.apirestSmadia.schedule.infrastructure.entity;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.financial.infrastructure.entity.AppointmentContractServiceDetail;
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
@Table(name = "dating_contract_detail", schema = "common_schedule")
public class DatingContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dat_cont_de_id")
    private Long datContDeId;

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

    @Column(name = "appointment_date")
    private Date appointmentDate;

    @Column(name = "start_time")
    @Temporal(TemporalType.TIME)
    private Date startTime;

    @Column(name = "end_time")
    @Temporal(TemporalType.TIME)
    private Date endTime;

    @Column(name = "coment")
    private String comment;

    @Column(name = "status")
    private String status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_appointment_contract", referencedColumnName = "appo_cont_ser_de_id", insertable = true, updatable = true)
    private AppointmentContractServiceDetail appointmentContractServiceDetail;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_company", referencedColumnName = "company_id", insertable = true, updatable = true)
    private Company company;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}

