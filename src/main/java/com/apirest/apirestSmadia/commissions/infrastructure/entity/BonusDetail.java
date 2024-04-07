package com.apirest.apirestSmadia.commissions.infrastructure.entity;


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
@Table(name = "bonus_detail", schema = "common_commissions")
public class BonusDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bonus_de_id")
    private Long bonusDeId;

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

    @Column(name = "code_develop")
    private String codeDevelop;

    @Column(name = "value")
    private BigDecimal value;

    @Column(name = "compliance_percentage")
    private BigDecimal compliancePercentage;

    @Column(name = "not_compliance_percentage")
    private BigDecimal notCompliancePercentage;

    @Column(name = "comment")
    private String comment;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_bonus", referencedColumnName = "bonus_id", nullable = false)
    private Bonus bonus;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", nullable = false)
    private Session session;
}

