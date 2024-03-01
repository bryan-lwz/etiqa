package com.as.etq.customerproduct.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "office_email")
    private String officeEmail;

    @Column(name = "personal_email")
    private String personalEmail;

    @Column(name = "mobile_phone")
    private String mobilePhone;

    @OneToMany(mappedBy = "customerId", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<FamilyMember> familyMembers;
}
