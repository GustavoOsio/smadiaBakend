package com.apirest.apirestSmadia.inventory.infrastructure.entity;
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
@Table(name = "requisition_interaction", schema = "common_inventory")
public class RequisitionInteraction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tri_id")
    private Integer id;

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
    @JoinColumn(name = "tri_te_id", referencedColumnName = "employee_id", insertable = true, updatable = true)
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "tri_trq_id", referencedColumnName = "req_id", insertable = true, updatable = true)
    private Requisition requisition;

    @Column(name = "tri_date")
    private Date date;

    @Column(name = "tri_area")
    private String area;

    @Column(name = "tri_description")
    private String description;

    @Column(name = "tri_alert")
    private String alert;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}

