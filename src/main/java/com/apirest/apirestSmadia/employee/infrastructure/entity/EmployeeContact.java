package com.apirest.apirestSmadia.employee.infrastructure.entity;


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
@Table(name = "employee_contact", schema = "common_employee")
public class EmployeeContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pct_id")
    private Long pctId;

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

    @Column(name = "pct_email")
    private String pctEmail;

    @Column(name = "pct_phone")
    private String pctPhone;

    @Column(name = "pct_mobile")
    private String pctMobile;

    @Column(name = "pct_department")
    private String pctDepartment;

    @Column(name = "pct_city")
    private String pctCity;

    @Column(name = "pct_address")
    private String pctAddress;

    @Column(name = "status")
    private String status;



    @ManyToOne
    @JoinColumn(name = "pct_employee_id", referencedColumnName = "employee_id", insertable = false, updatable = false)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id", insertable = false, updatable = false)
    private Session session;
}

