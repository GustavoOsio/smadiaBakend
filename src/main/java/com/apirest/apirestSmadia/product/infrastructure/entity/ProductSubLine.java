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
@Table(name = "product_sub_line", schema = "common_product")
public class ProductSubLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_sub_line_id")
    private Long productSubLineId;

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


    @Column(name = "code")
    private Long code;

    @Column(name = "category")
    private String category;

    @Column(name = "comment")
    private String comment;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_product_line", referencedColumnName = "product_line_id", insertable = false, updatable = false)
    private ProductLine productLine;

    @ManyToOne
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id", insertable = false, updatable = false)
    private Session session;
}