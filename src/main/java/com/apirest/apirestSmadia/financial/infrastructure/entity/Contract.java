package com.apirest.apirestSmadia.financial.infrastructure.entity;
import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.CostCenter;
import com.apirest.apirestSmadia.employee.infrastructure.entity.Employee;
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
@Table(name = "contract", schema = "common_financial")
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
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

    @Column(name = "code", unique = true, nullable = false, length = 255)
    private String code;

    @Column(name = "status", length = 20)
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_budget", referencedColumnName = "budget_id",nullable = false)
    private Budget budget;

    @ManyToOne
    @JoinColumn(name = "id_company", referencedColumnName = "company_id", nullable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "id_professional",referencedColumnName = "employee_id",nullable = false)
    private Employee professional;

    @ManyToOne
    @JoinColumn(name = "id_cost_center",referencedColumnName = "cost_center_id", nullable = false)
    private CostCenter costCenter;

    @ManyToOne
    @JoinColumn(name = "session_id_session",referencedColumnName = "session_id", nullable = false)
    private Session sessionIdSession;

}

