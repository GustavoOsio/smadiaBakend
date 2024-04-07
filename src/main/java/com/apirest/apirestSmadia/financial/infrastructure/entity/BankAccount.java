package com.apirest.apirestSmadia.financial.infrastructure.entity;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
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
@Table(name = "bank_account", schema = "common_financial")
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bank_id")
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

    @Column(name = "account_number", length = 255)
    private String accountNumber;

    @Column(name = "account_type", length = 20)
    private String accountType;

    @Column(name = "bank_name", length = 50)
    private String bankName;

    @Column(name = "owner_name", length = 50)
    private String ownerName;

    @Column(name = "currency")
    private String currency;

    @Column(name = "status", length = 20)
    private String status;


    @ManyToOne
    @JoinColumn(name = "owner_id", referencedColumnName = "company_id",insertable = true, updatable = true)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "session_id_session",referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;

}

