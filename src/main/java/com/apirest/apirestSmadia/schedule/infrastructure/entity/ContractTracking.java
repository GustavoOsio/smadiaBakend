package com.apirest.apirestSmadia.schedule.infrastructure.entity;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
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
@Table(name = "contract_tracking", schema = "common_schedule")
public class ContractTracking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cont_tra_id")
    private Long contTraId;

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

    @Column(name = "tracking_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date trackingDate;

    @Column(name = "status")
    private String status;

    @Column(name = "comment")
    private String comment;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_dating_contract", referencedColumnName = "dat_cont_de_id", insertable = true, updatable = true)
    private DatingContractDetail datingContractDetail;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_employee", referencedColumnName = "employee_id", insertable = true, updatable = true)
    private Employee employee;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_company", referencedColumnName = "company_id", insertable = true, updatable = true)
    private Company company;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}
