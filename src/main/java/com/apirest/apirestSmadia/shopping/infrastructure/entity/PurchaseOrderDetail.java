package com.apirest.apirestSmadia.shopping.infrastructure.entity;

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
@Table(name = "purchase_order_detail", schema = "common_shopping")
public class PurchaseOrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pordd_id")
    private Long porddId;

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

    @ManyToOne
    @JoinColumn(name = "pordd_pord_id", referencedColumnName = "pord_id")
    private PurchaseOrder purchaseOrder;

    @ManyToOne
    @JoinColumn(name = "pordd_product_id", referencedColumnName = "product_des_id")
    private ProductDescription product;

    @Column(name = "pordd_reqd_id")
    private Long porddReqdId;



    @Column(name = "pordd_quantity")
    private Long porddQuantity;

    @Column(name = "pordd_gross_value")
    private BigDecimal porddGrossValue;

    @Column(name = "pordd_discount")
    private BigDecimal porddDiscount;

    @Column(name = "pordd_discounted_value")
    private BigDecimal porddDiscountedValue;

    @Column(name = "pordd_net_value")
    private BigDecimal porddNetValue;

    @Column(name = "pordd_total_value")
    private BigDecimal porddTotalValue;

    @Column(name = "pordd_administration")
    private BigDecimal porddAdministration;

    @Column(name = "pordd_unforeseen")
    private BigDecimal porddUnforeseen;

    @Column(name = "pordd_profit")
    private BigDecimal porddProfit;

    @Column(name = "pordd_ico")
    private BigDecimal porddIco;

    @Column(name = "pordd_tax")
    private BigDecimal porddTax;

    @Column(name = "pordd_administration_value")
    private BigDecimal porddAdministrationValue;

    @Column(name = "pordd_unforeseen_value")
    private BigDecimal porddUnforeseenValue;

    @Column(name = "pordd_profit_value")
    private BigDecimal porddProfitValue;

    @Column(name = "pordd_ico_value")
    private BigDecimal porddIcoValue;

    @Column(name = "pordd_tax_value")
    private BigDecimal porddTaxValue;

    @Column(name = "pordd_observation")
    private String porddObservation;

    @Column(name = "pordd_tur_id")
    private Long porddTurId;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", nullable = false)
    private Session session;
}
