package com.apirest.apirestSmadia.provider.infrastructure.entity;


import com.apirest.apirestSmadia.product.infrastructure.entity.ProductLine;
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
@Table(name = "product_line_supplier", schema = "common_provider")
public class ProductLineSupplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pls_id")
    private Long plsId;

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

    @Column(name = "status")
    private String status;


    @ManyToOne
    @JoinColumn(name = "pls_vp_id", referencedColumnName = "provider_id", insertable = true, updatable = true)
    private Provider provider;

    @ManyToOne
    @JoinColumn(name = "pls_pl_id", referencedColumnName = "product_line_id", insertable = true, updatable = true)
    private ProductLine productLine;

    @ManyToOne
    @JoinColumn(name = "session_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;
}
