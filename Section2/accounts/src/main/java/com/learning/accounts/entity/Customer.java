package com.learning.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity @Setter @Getter @AllArgsConstructor @NoArgsConstructor @ToString
public class Customer extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    private String name;

    private String email;

    private String movileNumber;

}
