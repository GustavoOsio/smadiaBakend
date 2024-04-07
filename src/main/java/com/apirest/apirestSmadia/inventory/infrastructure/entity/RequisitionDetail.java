package com.apirest.apirestSmadia.inventory.infrastructure.entity;
import com.apirest.apirestSmadia.product.infrastructure.entity.ProductDescription;
import com.apirest.apirestSmadia.product.infrastructure.entity.ProductSubLine;
import com.apirest.apirestSmadia.product.infrastructure.entity.ProductType;
import com.apirest.apirestSmadia.shopping.infrastructure.entity.PurchaseOrderDetail;
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
@Table(name = "requisition_detail", schema = "common_inventory")
public class RequisitionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reqd_id")
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
    @JoinColumn(name = "reqd_req_id", referencedColumnName = "req_id", insertable = true, updatable = true)
    private Requisition requisition;

    @ManyToOne
    @JoinColumn(name = "reqd_product_id", referencedColumnName = "product_des_id", insertable = true, updatable = true)
    private ProductDescription productDescription;

    @ManyToOne
    @JoinColumn(name = "reqd_product_sub_line_id", referencedColumnName = "product_sub_line_id", insertable = true, updatable = true)
    private ProductSubLine productSubLine;

    @ManyToOne
    @JoinColumn(name = "reqd_product_type_id", referencedColumnName = "product_type_id", insertable = true, updatable = true)
    private ProductType productType;

    @ManyToOne
    @JoinColumn(name = "reqd_sale_order_detail_id", referencedColumnName = "pordd_id", insertable = true, updatable = true)
    private PurchaseOrderDetail purchaseOrderDetail;

    @Column(name = "reqd_observation")
    private String observation;

    @Column(name = "reqd_requested_quantity")
    private Integer requestedQuantity;

    @Column(name = "reqd_approved_quantity")
    private Integer approvedQuantity;

    @Column(name = "reqd_value")
    private BigDecimal value;

    @Column(name = "reqd_total")
    private BigDecimal total;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;


}


