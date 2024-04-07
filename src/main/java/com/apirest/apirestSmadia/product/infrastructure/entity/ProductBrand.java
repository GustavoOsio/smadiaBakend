package com.apirest.apirestSmadia.product.infrastructure.entity;

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
@Table(name = "product_brand", schema = "common_product")
public class ProductBrand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pb_id")
    private Long pbId;

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

    @Column(name = "pb_product_id")
    private Long pbProductId;

    @Column(name = "pb_date")
    @Temporal(TemporalType.DATE)
    private Date pbDate;

    @Column(name = "pb_code")
    private String pbCode;

    @Column(name = "pb_description")
    private String pbDescription;

    @Column(name = "status")
    private String status;


    @ManyToOne
    @JoinColumn(name = "pb_product_id", referencedColumnName = "product_des_id", insertable = false, updatable = false)
    private ProductDescription productDescription;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = false, updatable = false)
    private Session session;
}

