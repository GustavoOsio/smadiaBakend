package com.apirest.apirestSmadia.provider.infrastructure.entity;


import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
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
@Table(name = "Provider", schema = "common_provider")
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "provider_id")
    private Long providerId;

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


    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "type")
    private String type;

    @Column(name = "name")
    private String name;

    @Column(name = "acronym")
    private String acronym;

    @Column(name = "nit")
    private String nit;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "phone")
    private String phone;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;

    @Column(name = "website")
    private String website;

    @Column(name = "facebook")
    private String facebook;

    @Column(name = "instagram")
    private String instagram;

    @Column(name = "other_social_media")
    private String otherSocialMedia;

    @Column(name = "family_working")
    private String familyWorking;

    @Column(name = "person_type")
    private String personType;

    @Column(name = "society_type")
    private String societyType;

    @Column(name = "constitution_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date constitutionDate;

    @Column(name = "validity")
    private String validity;

    @Column(name = "commercial_registry")
    private String commercialRegistry;

    @Column(name = "registry_city")
    private String registryCity;

    @Column(name = "sales_regime")
    private String salesRegime;

    @Column(name = "vat_regime")
    private String vatRegime;

    @Column(name = "income_regime")
    private String incomeRegime;

    @Column(name = "representative_id")
    private String representativeId;

    @Column(name = "representative_name")
    private String representativeName;

    @Column(name = "representative_role")
    private String representativeRole;

    @Column(name = "representative_phone")
    private String representativePhone;

    @Column(name = "payment_terms")
    private String paymentTerms;

    @Column(name = "payment_days")
    private String paymentDays;

    @Column(name = "financial_entity")
    private String financialEntity;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "main")
    private Boolean main;

    @Column(name = "status")
    private String status;


    @ManyToOne
    @JoinColumn(name = "id_company", referencedColumnName = "company_id", insertable = true, updatable = true)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "session_id_session", referencedColumnName = "session_id", insertable = true, updatable = true)
    private Session session;
}

