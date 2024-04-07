package com.apirest.apirestSmadia.provider.domain.models.dto;

import com.apirest.apirestSmadia.compcostocenterbundle.infrastructure.entity.Company;
import com.apirest.apirestSmadia.user.infrastructure.entity.Session;
import com.apirest.apirestSmadia.util.view.Views;
import lombok.Data;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonView;

@Data
public class ProviderDto {

    @JsonView(Views.Extended.class)
    private Long providerId;

    private Date createdAt;
    private Date updatedAt;
    private String updateUser;
    private String updateProgram;
    private Long optimistLock;

    @JsonView(Views.Extended.class)
    private Date date;

    @JsonView(Views.Extended.class)
    private String type;

    @JsonView(Views.Extended.class)
    private String name;

    @JsonView(Views.Extended.class)
    private String acronym;

    @JsonView(Views.Extended.class)
    private String nit;

    @JsonView(Views.Extended.class)
    private String address;

    @JsonView(Views.Extended.class)
    private String city;

    @JsonView(Views.Extended.class)
    private String phone;

    @JsonView(Views.Extended.class)
    private String mobile;

    @JsonView(Views.Extended.class)
    private String email;

    @JsonView(Views.Extended.class)
    private String website;

    @JsonView(Views.Extended.class)
    private String facebook;

    @JsonView(Views.Extended.class)
    private String instagram;

    @JsonView(Views.Extended.class)
    private String otherSocialMedia;

    @JsonView(Views.Extended.class)
    private String familyWorking;

    @JsonView(Views.Extended.class)
    private String personType;

    @JsonView(Views.Extended.class)
    private String societyType;

    @JsonView(Views.Extended.class)
    private Date constitutionDate;

    @JsonView(Views.Extended.class)
    private String validity;

    @JsonView(Views.Extended.class)
    private String commercialRegistry;

    @JsonView(Views.Extended.class)
    private String registryCity;

    @JsonView(Views.Extended.class)
    private String salesRegime;

    @JsonView(Views.Extended.class)
    private String vatRegime;

    @JsonView(Views.Extended.class)
    private String incomeRegime;

    @JsonView(Views.Extended.class)
    private String representativeId;

    @JsonView(Views.Extended.class)
    private String representativeName;

    @JsonView(Views.Extended.class)
    private String representativeRole;

    @JsonView(Views.Extended.class)
    private String representativePhone;

    @JsonView(Views.Extended.class)
    private String paymentTerms;

    @JsonView(Views.Extended.class)
    private String paymentDays;

    @JsonView(Views.Extended.class)
    private String financialEntity;

    @JsonView(Views.Extended.class)
    private String accountType;

    @JsonView(Views.Extended.class)
    private String accountNumber;

    @JsonView(Views.Extended.class)
    private Boolean main;

    @JsonView(Views.Extended.class)
    private String status;

    @JsonView(Views.Extended.class)
    private Company company;


    private Session session;
}
