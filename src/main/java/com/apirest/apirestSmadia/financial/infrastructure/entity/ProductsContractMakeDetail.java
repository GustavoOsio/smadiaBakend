package com.apirest.apirestSmadia.financial.infrastructure.entity;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.product.infrastructure.entity.ProductDescription;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import lombok.*;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "products_contract_make_detail", schema = "common_financial")
public class ProductsContractMakeDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proct_cont_make_de_id")
    private Long id;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "update_user")
    private String updateUser;

    @Column(name = "update_program")
    private String updateProgram;

    @Column(name = "optimist_lock")
    private Long optimistLock;

    @Column(name = "is_bonus")
    private Boolean isBonus;

    @Column(name = "amount_product")
    private Double amountProduct;

    @Column(name = "status", length = 20)
    private String status;


    @ManyToOne
    @JoinColumn(name = "id_contract",referencedColumnName = "contract_id", insertable = true, updatable = true)
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "id_product", referencedColumnName = "product_des_id",insertable = true, updatable = true)
    private ProductDescription productDescription;


    @ManyToOne
    @JoinColumn(name = "id_company", referencedColumnName = "company_id",insertable = true, updatable = true)
    private Company company;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "session_id_session",referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}

