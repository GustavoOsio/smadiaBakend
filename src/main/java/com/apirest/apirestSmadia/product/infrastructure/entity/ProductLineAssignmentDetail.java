package com.apirest.apirestSmadia.product.infrastructure.entity;

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
@Table(name = "product_line_asignment_detail", schema = "common_product")
public class ProductLineAssignmentDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_line_asig_id")
    private Long productLineAsigId;

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


    @Column(name = "comment")
    private String comment;

    @Column(name = "status")
    private String status;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_employee", referencedColumnName = "employee_id", insertable = true, updatable = true)
    private Employee employee;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_product_line", referencedColumnName = "product_line_id", insertable = true, updatable = true)
    private ProductLine productLine;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_company", referencedColumnName = "company_id", insertable = true, updatable = true)
    private Company company;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}
