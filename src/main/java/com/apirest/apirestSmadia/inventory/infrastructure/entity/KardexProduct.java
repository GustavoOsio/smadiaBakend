package com.apirest.apirestSmadia.inventory.infrastructure.entity;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.CostCenter;
import com.apirest.apirestSmadia.product.infrastructure.entity.ProductBrand;
import com.apirest.apirestSmadia.product.infrastructure.entity.ProductDescription;
import com.apirest.apirestSmadia.product.infrastructure.entity.ProductSubLine;
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
@Table(name = "kardex_product", schema = "common_inventory")
public class KardexProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kp_id")
    private Long kpId;

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
    @JoinColumn(name = "kp_km_id", referencedColumnName = "km_id", insertable = true, updatable = true)
    private KardexMovement kardexMovement;

    @ManyToOne
    @JoinColumn(name = "kp_cc_id", referencedColumnName = "cost_center_id", insertable = true, updatable = true)
    private CostCenter costCenter;

    @ManyToOne
    @JoinColumn(name = "kp_kac_id", referencedColumnName = "kac_id", insertable = true, updatable = true)
    private KardexAllocationConfig kardexAllocationConfig;

    @ManyToOne
    @JoinColumn(name = "kp_prd_id", referencedColumnName = "product_des_id", insertable = true, updatable = true)
    private ProductDescription productDescription;

    @ManyToOne
    @JoinColumn(name = "kp_product_sub_line_id", referencedColumnName = "product_sub_line_id", insertable = true, updatable = true)
    private ProductSubLine productSubLine;

    @ManyToOne
    @JoinColumn(name = "kp_product_brand_id", referencedColumnName = "pb_id", insertable = true, updatable = true)
    private ProductBrand productBrand;

    @ManyToOne
    @JoinColumn(name = "kp_wau_id", referencedColumnName = "whl_id", insertable = true, updatable = true)
    private WarehouseLocation warehouseLocation;

    @ManyToOne
    @JoinColumn(name = "kp_sale_order_sale_record_id", referencedColumnName = "tvov_id", insertable = true, updatable = true)
    private SalesOrder salesOrder;

    @ManyToOne
    @JoinColumn(name = "kp_receipt_product_record_id", referencedColumnName = "prd_id", insertable = true, updatable = true)
    private ProductReceiptDetail productReceiptDetail;

    @Column(name = "kp_entry_quantity")
    private Long entryQuantity;

    @Column(name = "kp_entry_unit_value")
    private BigDecimal entryUnitValue;

    @Column(name = "kp_entry_total_value")
    private BigDecimal entryTotalValue;

    @Column(name = "kp_exit_quantity")
    private Long exitQuantity;

    @Column(name = "kp_exit_unit_value")
    private BigDecimal exitUnitValue;

    @Column(name = "kp_exit_total_value")
    private BigDecimal exitTotalValue;

    @Column(name = "kp_balance_quantity")
    private Long balanceQuantity;

    @Column(name = "kp_balance_unit_value")
    private BigDecimal balanceUnitValue;

    @Column(name = "kp_balance_total_value")
    private BigDecimal balanceTotalValue;

    @Column(name = "kp_physical_count")
    private Long physicalCount;

    @Column(name = "kp_observation")
    private String observation;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}
