package com.apirest.apirestSmadia.inventory.infrastructure.entity;

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
@Table(name = "sales_price", schema = "common_inventory")
public class SalesPrice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tvp_id")
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

    @Column(name = "tvp_date")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "tvp_tpr_id", referencedColumnName = "product_des_id", insertable = true, updatable = true)
    private ProductDescription productDescription;

    @Column(name = "tvp_sale_price")
    private BigDecimal salePrice;

    @Column(name = "tvp_origin")
    private String origin;

    @Column(name = "tvp_number")
    private String number;

    @Column(name = "tvp_validity")
    private Date validity;

    @Column(name = "tvp_discount")
    private BigDecimal discount;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}

