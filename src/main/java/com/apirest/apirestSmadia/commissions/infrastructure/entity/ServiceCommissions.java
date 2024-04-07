package com.apirest.apirestSmadia.commissions.infrastructure.entity;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;

import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import lombok.*;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "service_commissions", schema = "common_commissions")
public class ServiceCommissions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "serv_commi_id")
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


    @ManyToOne
    @JoinColumn(name = "id_employee", referencedColumnName = "employee_id", insertable = true, updatable = true)
    private Employee employeeId;


    @ManyToOne
    @JoinColumn(name = "id_company", referencedColumnName = "company_id", insertable = true, updatable = true)
    private Company companyId;


  /* @ManyToOne
    @JoinColumn(name = "service_id", referencedColumnName = "service_id", insertable = true, updatable = true)
    private ProductDescription serviceId;*/

    @Column(name = "commission_amount")
    private BigDecimal commissionAmount;

    @Column(name = "service_date")
    private Date serviceDate;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}

