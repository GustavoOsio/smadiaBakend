package com.apirest.apirestSmadia.provider.infrastructure.entity;


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
@Table(name = "supplier_contact", schema = "common_provider")
public class SupplierContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sc_id")
    private Long scId;

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

    @Column(name = "sc_type")
    private String scType;

    @Column(name = "sc_code")
    private String scCode;

    @Column(name = "sc_name")
    private String scName;

    @Column(name = "sc_position")
    private String scPosition;

    @Column(name = "sc_cellphone")
    private String scCellphone;

    @Column(name = "sc_email")
    private String scEmail;

    @ManyToOne
    @JoinColumn(name = "sc_vp_id", referencedColumnName = "provider_id", insertable = true, updatable = true)
    private Provider provider;

    @ManyToOne
    @JoinColumn(name = "sc_se_id", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;
}

