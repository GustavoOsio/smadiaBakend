package com.apirest.apirestSmadia.financial.infrastructure.entity;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import lombok.*;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "payments_contract_detail", schema = "common_financial")
public class PaymentsContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_cont_de_id")
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


    @Column(name = "amount", precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(name = "balance", precision = 10, scale = 2)
    private BigDecimal balance;

    @Column(name = "payment_date")
    private Timestamp paymentDate;

    @Column(name = "comment")
    private String comment;

    @Column(name = "status", length = 20)
    private String status;


    @ManyToOne
    @JoinColumn(name = "id_contract",referencedColumnName = "contract_id",nullable = false)
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "id_Payments_method",referencedColumnName = "payment_method_id", nullable = false)
    private PaymentsMethod paymentMethod;


    @ManyToOne
    @JoinColumn(name = "id_company",referencedColumnName = "company_id",nullable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id",nullable = false)
    private Session sessionIdSession;

}

