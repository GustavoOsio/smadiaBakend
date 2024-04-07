package com.apirest.apirestSmadia.inventory.infrastructure.entity;


import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.CostCenter;
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
@Table(name = "warehouse", schema = "common_inventory")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wh_id")
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
    @JoinColumn(name = "wh_manager_te_id", referencedColumnName = "employee_id", insertable = true, updatable = true)
    private Employee manager;

    @ManyToOne
    @JoinColumn(name = "wh_adjustment_te_id", referencedColumnName = "employee_id", insertable = true, updatable = true)
    private Employee adjustment;

    @ManyToOne
    @JoinColumn(name = "wh_center_cost_id", referencedColumnName = "cost_center_id", insertable = true, updatable = true)
    private CostCenter costCenter;

    @Column(name = "wh_start_date")
    private Date startDate;

    @Column(name = "wh_code")
    private String code;

    @Column(name = "wh_description")
    private String description;

    @Column(name = "wh_type")
    private String type;

    @Column(name = "wh_classification")
    private String classification;

    @Column(name = "wh_address")
    private String address;

    @Column(name = "wh_status")
    private String status;

    @Column(name = "status")
    private String overallStatus;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}

