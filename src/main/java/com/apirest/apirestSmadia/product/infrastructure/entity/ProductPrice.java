package com.apirest.apirestSmadia.product.infrastructure.entity;


import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.CostCenter;
import com.apirest.apirestSmadia.provider.infrastructure.entity.Provider;
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
@Table(name = "product_Price", schema = "common_product")
public class ProductPrice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pp_id")
    private Long ppId;

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

    @Column(name = "pp_date")
    @Temporal(TemporalType.DATE)
    private Date ppDate;

    @Column(name = "pp_priority")
    private Integer ppPriority;

    @Column(name = "pp_unit_value")
    private BigDecimal ppUnitValue;

    @Column(name = "pp_origin")
    private String ppOrigin;

    @Column(name = "pp_number")
    private String ppNumber;

    @Column(name = "pp_effective_date")
    @Temporal(TemporalType.DATE)
    private Date ppEffectiveDate;

    @Column(name = "status")
    private String status;


    @ManyToOne
    @JoinColumn(name = "pp_vp_id", referencedColumnName = "provider_id", insertable = true, updatable = true)
    private Provider provider;

    @ManyToOne
    @JoinColumn(name = "pp_product_id", referencedColumnName = "product_des_id", insertable = true, updatable = true)
    private ProductDescription productDescription;

    @ManyToOne
    @JoinColumn(name = "pp_cost_center_id", referencedColumnName = "cost_center_id", insertable = true, updatable = true)
    private CostCenter costCenter;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;
}
