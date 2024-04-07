package com.apirest.apirestSmadia.inventory.infrastructure.entity;

import com.apirest.apirestSmadia.product.infrastructure.entity.ProductBrand;
import com.apirest.apirestSmadia.product.infrastructure.entity.ProductDescription;
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
@Table(name = "kardex_allocation_config", schema = "common_inventory")
public class KardexAllocationConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kac_id")
    private Long kacId;

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
    @JoinColumn(name = "kac_wh_id", referencedColumnName = "wh_id", insertable = true, updatable = true)
    private Warehouse warehouse;

    @ManyToOne
    @JoinColumn(name = "kac_product_id", referencedColumnName = "product_des_id", insertable = true, updatable = true)
    private ProductDescription productDescription;

    @ManyToOne
    @JoinColumn(name = "kac_wh_location_reg_id", referencedColumnName = "whlr_id", insertable = true, updatable = true)
    private WarehouseLocationRecord warehouseLocationRecord;

    @ManyToOne
    @JoinColumn(name = "kac_product_brand_id", referencedColumnName = "pb_id", insertable = true, updatable = true)
    private ProductBrand productBrand;

    @Column(name = "kac_allocation_requisition")
    private Boolean allocationRequisition;

    @Column(name = "kac_service_level")
    private BigDecimal serviceLevel;

    @Column(name = "kac_reorder_point")
    private BigDecimal reorderPoint;

    @Column(name = "kac_demand_time")
    private BigDecimal demandTime;

    @Column(name = "kac_pinball_loss")
    private BigDecimal pinballLoss;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}
